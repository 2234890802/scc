package cn.scc.entity;

import java.util.Date;

public class Checkin {
    private Long id;

    private Long cusid;

    private Date bedstart;

    private Date bedend;

    private String content;

    private Long bedid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCusid() {
        return cusid;
    }

    public void setCusid(Long cusid) {
        this.cusid = cusid;
    }

    public Date getBedstart() {
        return bedstart;
    }

    public void setBedstart(Date bedstart) {
        this.bedstart = bedstart;
    }

    public Date getBedend() {
        return bedend;
    }

    public void setBedend(Date bedend) {
        this.bedend = bedend;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Long getBedid() {
        return bedid;
    }

    public void setBedid(Long bedid) {
        this.bedid = bedid;
    }
}