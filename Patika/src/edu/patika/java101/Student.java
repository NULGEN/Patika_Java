package edu.patika.java101;

public class Student {
    private  String name;
    private  int stuNo;
    private String classes;
    private Course mat;
    private  Course fizik;
    private Course kimya;
    private double avarage;
    private  boolean isPass;

    public Student(String name, int stuNo, String classes, Course mat, Course fizik, Course kimya, double avarage, boolean isPass) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.avarage = avarage;
        this.isPass = isPass;
    }


    public boolean isPass(boolean isPass){

        return  true;
    }

    public double calcAvarage(){



        return  0;
    }

    public void printNote(){


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public Course getMat() {
        return mat;
    }

    public void setMat(Course mat) {
        this.mat = mat;
    }

    public Course getFizik() {
        return fizik;
    }

    public void setFizik(Course fizik) {
        this.fizik = fizik;
    }

    public Course getKimya() {
        return kimya;
    }

    public void setKimya(Course kimya) {
        this.kimya = kimya;
    }

    public double getAvarage() {
        return avarage;
    }

    public void setAvarage(double avarage) {
        this.avarage = avarage;
    }

    public boolean isPass() {
        return isPass;
    }

    public void setPass(boolean pass) {
        isPass = pass;
    }
}
