package com.example.demo.thirdday.builder;

/**
 * Created by Chenjl
 * 2021/8/19 23:44
 */
public class Home {

    private String fatherName;
    private String motherName;
    private String sisterName;
    private String botherName;

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getSisterName() {
        return sisterName;
    }

    public void setSisterName(String sisterName) {
        this.sisterName = sisterName;
    }

    public String getBotherName() {
        return botherName;
    }

    public void setBotherName(String botherName) {
        this.botherName = botherName;
    }

    @Override
    public String toString() {
        return "Home{" +
                "fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", sisterName='" + sisterName + '\'' +
                ", botherName='" + botherName + '\'' +
                '}';
    }
}
