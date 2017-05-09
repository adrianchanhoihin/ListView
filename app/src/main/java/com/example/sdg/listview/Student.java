package com.example.sdg.listview;

/**
 * Created by sdg on 25/4/2017.
 */

public class Student {
    private String name;
    private  int grade;
    private  String DOB;
    private boolean isBoy;
    private  String status;

    public Student() {
        name = "";
        DOB = "";
        status = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public boolean isBoy() {
        return isBoy;
    }

    public void setBoy(boolean boy) {
        isBoy = boy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {

        return "Name: " + getName() + "\n" + "Date of Birth: " + getDOB() + "\n" + "Grade: " + getGrade() + "\n" + "Status: " + getStatus();
    }
}
