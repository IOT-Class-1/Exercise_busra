package com.busraeylul.MerveHocaMext.Day2;

public class Main {
    public static void main(String[] args) {
        Analyse employeeOne = new Analyse("Hediye Kartal", 70000, 25);
        SalesPerson employeeTwo = new SalesPerson("İrem Uguz", 75000, .24, 24);

        employeeOne.getAnnualBonus();
        employeeOne.getResalary();
        employeeTwo.raiseCommission();
        employeeTwo.getCommissionPercentage();

        System.out.println(employeeOne.getAnnualBonus());
        System.out.println(employeeOne.getResalary());
    }
}
