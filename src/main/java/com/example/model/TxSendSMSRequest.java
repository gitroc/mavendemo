package com.example.model;

import java.io.Serializable;

/**
 * Created by roc on 2017/5/22.
 */

public class TxSendSMSRequest implements Serializable{
    private String mobile;

    private String content;

    private String spType;

    private String channel;

    private String simulatorSwitch;


    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSpType() {
        return spType;
    }

    public void setSpType(String spType) {
        this.spType = spType;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getSimulatorSwitch() {
        return simulatorSwitch;
    }

    public void setSimulatorSwitch(String simulatorSwitch) {
        this.simulatorSwitch = simulatorSwitch;
    }
}
