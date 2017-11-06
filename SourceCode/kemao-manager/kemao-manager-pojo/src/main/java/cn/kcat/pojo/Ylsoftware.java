package cn.kcat.pojo;

public class Ylsoftware {
    private Integer id;

    private String softname;

    private String softtype;

    private String softimage;

    private Integer softToTitle;

    private String softJianjie;

    private String softJietu;

    private String softurl;

    private String softDate;

    private String softVersion;

    private String softPw;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSoftname() {
        return softname;
    }

    public void setSoftname(String softname) {
        this.softname = softname == null ? null : softname.trim();
    }

    public String getSofttype() {
        return softtype;
    }

    public void setSofttype(String softtype) {
        this.softtype = softtype == null ? null : softtype.trim();
    }

    public String getSoftimage() {
        return softimage;
    }

    public void setSoftimage(String softimage) {
        this.softimage = softimage == null ? null : softimage.trim();
    }

    public Integer getSoftToTitle() {
        return softToTitle;
    }

    public void setSoftToTitle(Integer softToTitle) {
        this.softToTitle = softToTitle;
    }

    public String getSoftJianjie() {
        return softJianjie;
    }

    public void setSoftJianjie(String softJianjie) {
        this.softJianjie = softJianjie == null ? null : softJianjie.trim();
    }

    public String getSoftJietu() {
        return softJietu;
    }

    public void setSoftJietu(String softJietu) {
        this.softJietu = softJietu == null ? null : softJietu.trim();
    }

    public String getSofturl() {
        return softurl;
    }

    public void setSofturl(String softurl) {
        this.softurl = softurl == null ? null : softurl.trim();
    }

    public String getSoftDate() {
        return softDate;
    }

    public void setSoftDate(String softDate) {
        this.softDate = softDate == null ? null : softDate.trim();
    }

    public String getSoftVersion() {
        return softVersion;
    }

    public void setSoftVersion(String softVersion) {
        this.softVersion = softVersion == null ? null : softVersion.trim();
    }

    public String getSoftPw() {
        return softPw;
    }

    public void setSoftPw(String softPw) {
        this.softPw = softPw == null ? null : softPw.trim();
    }
}