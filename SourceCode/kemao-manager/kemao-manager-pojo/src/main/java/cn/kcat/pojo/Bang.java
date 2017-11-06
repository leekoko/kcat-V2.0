package cn.kcat.pojo;

public class Bang {
    private Integer id;

    private String videoname;

    private Integer videotype;

    private String videourl;

    private String videoimage;

    private String videoexplain;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVideoname() {
        return videoname;
    }

    public void setVideoname(String videoname) {
        this.videoname = videoname == null ? null : videoname.trim();
    }

    public Integer getVideotype() {
        return videotype;
    }

    public void setVideotype(Integer videotype) {
        this.videotype = videotype;
    }

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl == null ? null : videourl.trim();
    }

    public String getVideoimage() {
        return videoimage;
    }

    public void setVideoimage(String videoimage) {
        this.videoimage = videoimage == null ? null : videoimage.trim();
    }

    public String getVideoexplain() {
        return videoexplain;
    }

    public void setVideoexplain(String videoexplain) {
        this.videoexplain = videoexplain == null ? null : videoexplain.trim();
    }
}