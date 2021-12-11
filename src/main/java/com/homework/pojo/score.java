package com.homework.pojo;

/**
 * @author 兵结藤诚
 * @version 1.0
 */
public class score {
    private String Sno;
    private String Cno;
    private Integer Grade;

    @Override
    public String toString() {
        return "score{" +
                "Sno='" + Sno + '\'' +
                ", Cno='" + Cno + '\'' +
                ", Grade=" + Grade +
                '}';
    }

    public String getSno() {
        return Sno;
    }

    public void setSno(String sno) {
        Sno = sno;
    }

    public String getCno() {
        return Cno;
    }

    public void setCno(String cno) {
        Cno = cno;
    }

    public Integer getGrade() {
        return Grade;
    }

    public void setGrade(Integer grade) {
        Grade = grade;
    }

    public score(String sno, String cno, Integer grade) {
        Sno = sno;
        Cno = cno;
        Grade = grade;
    }

    public score() {
    }
}
