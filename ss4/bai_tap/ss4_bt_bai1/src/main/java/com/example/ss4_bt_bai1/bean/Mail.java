package com.example.ss4_bt_bai1.bean;

public class Mail {
    private String language;
    private Integer pageSize;
    private boolean allowSpam;
    private String signature;

    public Mail() {
    }

    public Mail(String language, Integer pageSize, boolean allowSpam, String signature) {
        this.language = language;
        this.pageSize = pageSize;
        this.allowSpam = allowSpam;
        this.signature = signature;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isAllowSpam() {
        return allowSpam;
    }

    public void setAllowSpam(boolean allowSpam) {
        this.allowSpam = allowSpam;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
