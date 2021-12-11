package com.homework.pojo;

/**
 * @author 兵结藤诚
 * @version 1.0
 */
public class course {
    private String Cno;
    private String Cname;
    private Integer Ctime;
    private Integer Credit;

    public course() {
    }

    public course(String cno, String cname, Integer ctime, Integer credit) {
        Cno = cno;
        Cname = cname;
        Ctime = ctime;
        Credit = credit;
    }

    @Override
    public String toString() {
        return "course{" +
                "Cno='" + Cno + '\'' +
                ", Cname='" + Cname + '\'' +
                ", Ctime=" + Ctime +
                ", Credit=" + Credit +
                '}';
    }

    public String getCno() {
        return Cno;
    }

    public void setCno(String cno) {
        Cno = cno;
    }

    public String getCname() {
        return Cname;
    }

    public void setCname(String cname) {
        Cname = cname;
    }

    public Integer getCtime() {
        return Ctime;
    }

    public void setCtime(Integer ctime) {
        Ctime = ctime;
    }

    public Integer getCredit() {
        return Credit;
    }

    public void setCredit(Integer credit) {
        Credit = credit;
    }
}
