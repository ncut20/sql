package com.homework.pojo;

/**
 * @author 兵结藤诚
 * @version 1.0
 */
public class student {
    private String Sno;
    private String Sname;
    private String Ssex;
    private Integer Sage;
    private String Sdept;

    @Override
    public String toString() {
        return "student{" +
                "Sno='" + Sno + '\'' +
                ", Sname='" + Sname + '\'' +
                ", Ssex='" + Ssex + '\'' +
                ", Sage=" + Sage +
                ", Sdept='" + Sdept + '\'' +
                '}';
    }

    public String getSno() {
        return Sno;
    }

    public void setSno(String sno) {
        Sno = sno;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public String getSsex() {
        return Ssex;
    }

    public void setSsex(String ssex) {
        Ssex = ssex;
    }

    public Integer getSage() {
        return Sage;
    }

    public void setSage(Integer sage) {
        Sage = sage;
    }

    public String getSdept() {
        return Sdept;
    }

    public void setSdept(String sdept) {
        Sdept = sdept;
    }

    public student() {
    }

    public student(String sno, String sname, String ssex, Integer sage, String sdept) {
        Sno = sno;
        Sname = sname;
        Ssex = ssex;
        Sage = sage;
        Sdept = sdept;
    }
}
