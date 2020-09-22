package com.svj.bean;


import lombok.Data;

/**
 * 3*descriptions:
 * 4*
 * 5*author: LiCan
 * 6*date: 2020 - 09 - 21 14:52
 * 7
 */
public class LabelQuery {
    String svj_user_userid;
    String svj_user_username;
    String svj_user_regdate;
    String svj_user_regemail;
    String svj_user_birthdaytime;
    String svj_user_lastlogintime;
    String svj_user_organname;
    String svj_user_deptname;
    String svj_user_employeeid;
    String svj_user_mobile;

    public LabelQuery(String svj_user_userid, String svj_user_username, String svj_user_regdate, String svj_user_regemail, String svj_user_birthdaytime, String svj_user_lastlogintime, String svj_user_organname, String svj_user_deptname, String svj_user_employeeid, String svj_user_mobile) {
        this.svj_user_userid = svj_user_userid;
        this.svj_user_username = svj_user_username;
        this.svj_user_regdate = svj_user_regdate;
        this.svj_user_regemail = svj_user_regemail;
        this.svj_user_birthdaytime = svj_user_birthdaytime;
        this.svj_user_lastlogintime = svj_user_lastlogintime;
        this.svj_user_organname = svj_user_organname;
        this.svj_user_deptname = svj_user_deptname;
        this.svj_user_employeeid = svj_user_employeeid;
        this.svj_user_mobile = svj_user_mobile;
    }

    public String getSvj_user_userid() {
        return svj_user_userid;
    }

    public void setSvj_user_userid(String svj_user_userid) {
        this.svj_user_userid = svj_user_userid;
    }

    public String getSvj_user_username() {
        return svj_user_username;
    }

    public void setSvj_user_username(String svj_user_username) {
        this.svj_user_username = svj_user_username;
    }

    public String getSvj_user_regdate() {
        return svj_user_regdate;
    }

    public void setSvj_user_regdate(String svj_user_regdate) {
        this.svj_user_regdate = svj_user_regdate;
    }

    public String getSvj_user_regemail() {
        return svj_user_regemail;
    }

    public void setSvj_user_regemail(String svj_user_regemail) {
        this.svj_user_regemail = svj_user_regemail;
    }

    public String getSvj_user_birthdaytime() {
        return svj_user_birthdaytime;
    }

    public void setSvj_user_birthdaytime(String svj_user_birthdaytime) {
        this.svj_user_birthdaytime = svj_user_birthdaytime;
    }

    public String getSvj_user_lastlogintime() {
        return svj_user_lastlogintime;
    }

    public void setSvj_user_lastlogintime(String svj_user_lastlogintime) {
        this.svj_user_lastlogintime = svj_user_lastlogintime;
    }

    public String getSvj_user_organname() {
        return svj_user_organname;
    }

    public void setSvj_user_organname(String svj_user_organname) {
        this.svj_user_organname = svj_user_organname;
    }

    public String getSvj_user_deptname() {
        return svj_user_deptname;
    }

    public void setSvj_user_deptname(String svj_user_deptname) {
        this.svj_user_deptname = svj_user_deptname;
    }

    public String getSvj_user_employeeid() {
        return svj_user_employeeid;
    }

    public void setSvj_user_employeeid(String svj_user_employeeid) {
        this.svj_user_employeeid = svj_user_employeeid;
    }

    public String getSvj_user_mobile() {
        return svj_user_mobile;
    }

    public void setSvj_user_mobile(String svj_user_mobile) {
        this.svj_user_mobile = svj_user_mobile;
    }
}
