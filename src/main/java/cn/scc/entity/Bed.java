package cn.scc.entity;

public class Bed {
    private Long bedid;

    private String room;

    private String floor;

    private String status;

    public Long getBedid() {
        return bedid;
    }

    public void setBedid(Long bedid) {
        this.bedid = bedid;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room == null ? null : room.trim();
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor == null ? null : floor.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}