package com.wx.server.entity;

public class TbAptitude {
    private Integer id;

    private Integer userId;

    private String aptitudeName;

    private Integer fileId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAptitudeName() {
        return aptitudeName;
    }

    public void setAptitudeName(String aptitudeName) {
        this.aptitudeName = aptitudeName == null ? null : aptitudeName.trim();
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }
}