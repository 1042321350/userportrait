package com.svj.bean;

/**
 * 3*descriptions:
 * 4*
 * 5*author: LiCan
 * 6*date: 2020 - 09 - 12 17:20
 * 7
 */
public class SvjUser {
    String userid;
    String organid;
    String organname;
    String deptid;
    String deptname;
    String username;
    String regemail;
    String regdate;

    public SvjUser() {
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getOrganid() {
        return organid;
    }

    public void setOrganid(String organid) {
        this.organid = organid;
    }

    public String getOrganname() {
        return organname;
    }

    public void setOrganname(String organname) {
        this.organname = organname;
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRegemail() {
        return regemail;
    }

    public void setRegemail(String regemail) {
        this.regemail = regemail;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }
}
