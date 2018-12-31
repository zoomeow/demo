package com.example.demo.entity;

public class User {
    private Integer id;

    private String vistorName;

    private String phoneNum;

    private String seatNum;

    private String createDtmLoc;

    private String signDtmLoc;

    private String sendDtmLoc;

    private String sendStatus;

    private String urAnnualMetting;

    private String mettingStartTime;

    private String mettingEndTime;

    private String mettingAddress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVistorName() {
        return vistorName;
    }

    public void setVistorName(String vistorName) {
        this.vistorName = vistorName == null ? null : vistorName.trim();
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
    }

    public String getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(String seatNum) {
        this.seatNum = seatNum == null ? null : seatNum.trim();
    }

    public String getCreateDtmLoc() {
        return createDtmLoc;
    }

    public void setCreateDtmLoc(String createDtmLoc) {
        this.createDtmLoc = createDtmLoc == null ? null : createDtmLoc.trim();
    }

    public String getSignDtmLoc() {
        return signDtmLoc;
    }

    public void setSignDtmLoc(String signDtmLoc) {
        this.signDtmLoc = signDtmLoc == null ? null : signDtmLoc.trim();
    }

    public String getSendDtmLoc() {
        return sendDtmLoc;
    }

    public void setSendDtmLoc(String sendDtmLoc) {
        this.sendDtmLoc = sendDtmLoc == null ? null : sendDtmLoc.trim();
    }

    public String getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(String sendStatus) {
        this.sendStatus = sendStatus == null ? null : sendStatus.trim();
    }

    public String getUrAnnualMetting() {
        return urAnnualMetting;
    }

    public void setUrAnnualMetting(String urAnnualMetting) {
        this.urAnnualMetting = urAnnualMetting == null ? null : urAnnualMetting.trim();
    }

    public String getMettingStartTime() {
        return mettingStartTime;
    }

    public void setMettingStartTime(String mettingStartTime) {
        this.mettingStartTime = mettingStartTime == null ? null : mettingStartTime.trim();
    }

    public String getMettingEndTime() {
        return mettingEndTime;
    }

    public void setMettingEndTime(String mettingEndTime) {
        this.mettingEndTime = mettingEndTime == null ? null : mettingEndTime.trim();
    }

    public String getMettingAddress() {
        return mettingAddress;
    }

    public void setMettingAddress(String mettingAddress) {
        this.mettingAddress = mettingAddress == null ? null : mettingAddress.trim();
    }
}