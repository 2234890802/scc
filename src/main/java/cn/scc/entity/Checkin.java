package cn.scc.entity;

import java.util.Date;

public class Checkin {
    private Long id;

    private Long cusId;

    private Date bedStart;

    private Date bedEnd;

    private String content;

    private Long bedId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCusId() {
        return cusId;
    }

    public void setCusId(Long cusId) {
        this.cusId = cusId;
    }

    public Date getBedStart() {
        return bedStart;
    }

    public void setBedStart(Date bedStart) {
        this.bedStart = bedStart;
    }

    public Date getBedEnd() {
        return bedEnd;
    }

    public void setBedEnd(Date bedEnd) {
        this.bedEnd = bedEnd;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Long getBedId() {
        return bedId;
    }

    public void setBedId(Long bedId) {
        this.bedId = bedId;
    }
}