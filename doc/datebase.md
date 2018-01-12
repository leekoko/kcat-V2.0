# 数据库设计    

## 1.专业软件页面   

专业软件页面有多层对应关系：

学校 --> 多个学院 --> 多个专业  -->多个软件     

采用存储模板的方式，提高查询的性能。     



## 2.免费慕课页面    

免费慕课页面展示 的主要为外部爬取到的数据，主要由三个表构成：

表A：类别存储表_存储类别。

```      
ID
类别
创建时间
修改时间
是否删除

大类别ID
```

表B：页面存储表_对应表A主键作为外键存储。

```
ID
类别ID
图片地址
标题
介绍文字
链接
创建时间
修改时间
删除标识
```
表C：大类别存储表：用来对表A的类别分类。

```
ID
大类别名称
创建时间
修改时间
是否删除
```