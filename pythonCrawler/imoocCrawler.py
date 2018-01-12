import  requests
import socket
from bs4 import BeautifulSoup
import pymysql
import datetime

# imooc慕课网页面解析
headers = {
    'User-Agent':'Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Mobile Safari/537.36'
}
#代理ip数组      http://www.data5u.com/
idArr = '39.134.93.12:8080'

# 打开数据库连接
db = pymysql.connect("localhost", "root", "123456", "kcatv2",charset="utf8")
# 使用 cursor() 方法创建一个游标对象 cursor
cursor = db.cursor()

titles = []
intros = []
imgs = []
gageUrls = []
# 获取信息方法
def getMess(pageNum,type):
    mainUrl = 'https://www.imooc.com/search/course?words='+type+'&type=mf&page='+pageNum    # 免费的才能搜到
    proxy = {'HTTPS': idArr}
    wb_data = requests.get(mainUrl,headers = headers,proxies=proxy,timeout = 1500)
    socket.setdefaulttimeout(20)  # 设置socket层的超时时间为20秒
    soup = BeautifulSoup(wb_data.text, 'lxml')
    # 获取标题
    titlesTemp = soup.select(".course-item-detail > a ")
    for title in titlesTemp:
        titles.append(title)
    # 获取介绍
    introsTemp = soup.select(".course-item-detail > p")
    for intro in introsTemp:
        intros.append(intro)
    # 获取图片链接
    imgsTemp = soup.select(".course-item > a > img")
    for img in imgsTemp:
        imgs.append(img)
    # 获取跳转链接
    gageUrlsTemp = soup.select(".course-item-detail > a")
    for gageUrl in gageUrlsTemp:
        gageUrls.append(gageUrl)


    wb_data.close()

# 遍历数组输出
def outMess(typeCode):
    for title,intro,img,gageUrl in zip(titles,intros,imgs,gageUrls):
        title = title.get_text().replace('\r', '').replace('\n', '').replace('\t', '') + ""
        intro = intro.get_text().replace('\r', '').replace('\n', '').replace('\t', '') + ""
        img = "http:"+img.get("src")
        gageUrl = "https://www.imooc.com"+gageUrl.get("href")
        now_time = datetime.datetime.now().strftime("%Y-%m-%d %H:%M %p")
        # SQL 插入语句
        sql = "insert into freemooc(parentId, imgUrl, title, intro, pageUrl, delFlag, createDate, modifyDate)values('"+typeCode+"','"+img+"','"+title+"','"+intro+"','"+gageUrl+"','0','"+now_time+"','"+now_time+"')"
        try:
            # 执行sql语句
            cursor.execute(sql)
            # 提交到数据库执行
            db.commit()
            print(sql)
        except Exception as e:
            print(e)
            # 如果发生错误则回滚
            db.rollback()



# 执行方法
for pageNum in range(1, 3):
    type = "Linux"    # 类型
    typeCode = '22'   # 类型id

    getMess(str(pageNum),type)
    outMess(typeCode)
    print('--------------------------------------------------页数:'+str(pageNum)+'-------------------------------------')

# 关闭数据库连接
db.close()