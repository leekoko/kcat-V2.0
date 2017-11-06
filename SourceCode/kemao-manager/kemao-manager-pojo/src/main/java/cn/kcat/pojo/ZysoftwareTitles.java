package cn.kcat.pojo;

public class ZysoftwareTitles {
    private Integer id;

    private String titlesname;

    private Integer titlesToTitleb;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitlesname() {
        return titlesname;
    }

    public void setTitlesname(String titlesname) {
        this.titlesname = titlesname == null ? null : titlesname.trim();
    }

    public Integer getTitlesToTitleb() {
        return titlesToTitleb;
    }

    public void setTitlesToTitleb(Integer titlesToTitleb) {
        this.titlesToTitleb = titlesToTitleb;
    }
}