package com.homework.pojo;

/**
 * @author 兵结藤诚
 * @version 1.0
 */
public class teacher {
    private String Tno;
    private String Tname;
    private String Tsex;
    private String Cno;
    private String Tdept;

    @Override
    public String toString() {
        return "teacher{" +
                "Tno='" + Tno + '\'' +
                ", Tname='" + Tname + '\'' +
                ", Tsex='" + Tsex + '\'' +
                ", Cno='" + Cno + '\'' +
                ", Tdept='" + Tdept + '\'' +
                '}';
    }

    public String getTno() {
        return Tno;
    }

    public void setTno(String tno) {
        Tno = tno;
    }

    public String getTname() {
        return Tname;
    }

    public void setTname(String tname) {
        Tname = tname;
    }

    public String getTsex() {
        return Tsex;
    }

    public void setTsex(String tsex) {
        Tsex = tsex;
    }

    public String getCno() {
        return Cno;
    }

    public void setCno(String cno) {
        Cno = cno;
    }

    public String getTdept() {
        return Tdept;
    }

    public void setTdept(String tdept) {
        Tdept = tdept;
    }

    public teacher(String tno, String tname, String tsex, String cno, String tdept) {
        Tno = tno;
        Tname = tname;
        Tsex = tsex;
        Cno = cno;
        Tdept = tdept;
    }

    public teacher() {
    }
}
