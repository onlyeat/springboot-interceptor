package com.liu.interceptor.practise.interceptor.mode;

import java.util.Date;

public class Log {
    private Long id;

    private String operationCode;

    private String creater;

    private Date createDate;

    private Integer type;

    private String os;

    private String browser;

    private String ip;

    private Integer executeTime;

    private String description;

    private String requestParam;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode == null ? null : operationCode.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os == null ? null : os.trim();
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser == null ? null : browser.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Integer getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(Integer executeTime) {
        this.executeTime = executeTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getRequestParam() {
        return requestParam;
    }

    public void setRequestParam(String requestParam) {
        this.requestParam = requestParam == null ? null : requestParam.trim();
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", operationCode='" + operationCode + '\'' +
                ", creater='" + creater + '\'' +
                ", createDate=" + createDate +
                ", type=" + type +
                ", os='" + os + '\'' +
                ", browser='" + browser + '\'' +
                ", ip='" + ip + '\'' +
                ", executeTime=" + executeTime +
                ", description='" + description + '\'' +
                ", requestParam='" + requestParam + '\'' +
                '}';
    }
}