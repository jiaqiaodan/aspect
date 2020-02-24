package com.example.spring_aspect.entity;

public class UserLog {
    private Integer id;

    private String reType;

    private String reMethod;

    private String param;

    private String user;

    private String createTime;

    private String startTime;

    private String endTime;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReType() {
        return reType;
    }

    public void setReType(String reType) {
        this.reType = reType == null ? null : reType.trim();
    }

    public String getReMethod() {
        return reMethod;
    }

    public void setReMethod(String reMethod) {
        this.reMethod = reMethod == null ? null : reMethod.trim();
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param == null ? null : param.trim();
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }
}