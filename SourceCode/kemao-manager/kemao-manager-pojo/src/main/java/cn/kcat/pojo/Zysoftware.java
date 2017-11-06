package cn.kcat.pojo;

public class Zysoftware {
    private Integer id;

    private String softname;

    private Integer softToTitles;

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

    public Integer getSoftToTitles() {
        return softToTitles;
    }

    public void setSoftToTitles(Integer softToTitles) {
        this.softToTitles = softToTitles;
    }
}