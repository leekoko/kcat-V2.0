package cn.kcat.pojo;

public class ZysoftwareTitleb {
    private Integer id;

    private String titlebname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitlebname() {
        return titlebname;
    }

    public void setTitlebname(String titlebname) {
        this.titlebname = titlebname == null ? null : titlebname.trim();
    }
}