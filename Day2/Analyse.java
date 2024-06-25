package com.busraeylul.MerveHocaMext.Day2;

public class Analyse extends Employee{//yeni oluşturduğumuz analyse subclassı employee ana class özelliklerini miras alıyor

    public Analyse(String name, double salary, int age) {//constructor
        super(name, salary, age);
    }
    public double getAnnualBonus(){
        return super.salary*.05;
    }

    public double getResalary(){
        return this.salary =this.salary* 1.2;
    }
}
