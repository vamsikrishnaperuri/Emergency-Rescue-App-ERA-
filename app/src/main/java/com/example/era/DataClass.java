package com.example.era;

public class DataClass {

    private String dataTitle,dataname,datamail,datamsg;
    private int dataDesc;
    private String dataLang;
    private int dataImage;
    private String datanum;

    public DataClass(String dataTitle) {
        this.dataTitle = dataTitle;
    }


    public DataClass(String dataname, String datamail, String datamsg) {
        this.dataname = dataname;
        this.datamail = datamail;
        this.datamsg = datamsg;
    }

    public String getDataname() {
        return dataname;
    }

    public String getDatamail() {
        return datamail;
    }

    public String getDatamsg() {
        return datamsg;
    }

    public String getDatanum() { return datanum;}

    public String getDataTitle() {
        return dataTitle;
    }

    public int getDataDesc() {
        return dataDesc;
    }

    public String getDataLang() {
        return dataLang;
    }

    public int getDataImage() {
        return dataImage;
    }

    public DataClass(String dataTitle, int dataDesc, String dataLang, int dataImage,String datanum) {
        this.dataTitle = dataTitle;
        this.dataDesc = dataDesc;
        this.dataLang = dataLang;
        this.dataImage = dataImage;
        this.datanum = datanum;

    }
}