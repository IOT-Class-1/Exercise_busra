package com.busraeylul.MerveHocaMext.Day2;

public class SalesPerson extends Employee{
    private double commissionPercentage;

    public SalesPerson(String name, double salary, double commissionPercentage, int age) {
        super(name, salary, age);
        this.commissionPercentage = commissionPercentage;
    }
    public double getCommissionPercentage(){
        return this.commissionPercentage;
    }

    public void raiseCommission(){
        if(this.commissionPercentage < .30){//komisyon yüzdesi yüzde 30 altındaysa
            this.commissionPercentage = this.commissionPercentage * 1.2;
        }
    }

}
