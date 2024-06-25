package com.busraeylul.MerveHocaMext.Day2;

public class Employee {
    private String name;//instancelarımızı tanımladık
    protected double salary;
    private int age;

    public Employee(String name, double salary, int age){//constructor
    }
    public double getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void resalary(){
        this.salary = salary;
    }
}
