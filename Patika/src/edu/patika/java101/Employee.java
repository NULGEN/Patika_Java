package edu.patika.java101;

import java.util.Date;

public class Employee {
    private String name;
    private double salary;
    private double workHours;
    private int hireYear;

    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }


    public double tax(){
        if(salary <1000){
            return 0;
        }
        else{
            return salary * 0.03 ;
        }
    }

    public  double bonus(){

        if(workHours > 40){
            return  (workHours -40) *30;
        }
        else {
            return  0;
        }
    }

    public double raiseSalary(){
        int currentYear = 2021;
        int workYears = currentYear - hireYear;
        double bonus=0;

        if(workYears <10){
            bonus= (salary* 0.05);
        }
        else if(workYears >9  && workYears < 20 ){
            bonus=  (salary * 0.1);
        }
        else if(workYears >19){
            bonus= ( salary * 0.15);
        }
        return  bonus;
    }
/*
    @Override
    public String toString() {
        return "Employee{" +
                "Adı ='" + name + '\'' +
                ", Maaşı=" + salary +
                ", Çalışma Saati=" + workHours +
                ", Başlangıç Yılı=" + hireYear +
                ", Vergi=  "+ tax()+
                ", Bonus= "+ bonus()+
                ", Maaş Artışı= " + raiseSalary() +
                ", Vergi ve Bonuslar ile birlikte maaş : " + salary+tax()+bonus() +
                ", Toplam Maaş= " + salary+tax()+bonus()+raiseSalary()+
                '}';
    }
*/

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }
}
