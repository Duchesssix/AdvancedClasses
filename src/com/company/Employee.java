package com.company;
import java.text.DecimalFormat;

public class Employee {
    private String empName;
    private String empPosition;
    private boolean salaried;
    private double payRate;
    private int empShift;
    private String startDate;

    DecimalFormat priceFormatter = new DecimalFormat("$#,###.00"); //setting the format

    //New employee constructor
    public Employee(String empName, String empPosition, boolean salaried, double payRate, int empShift, String startDate) {
        this.empName = empName;
        this.empPosition = empPosition;
        this.salaried = salaried;
        this.payRate = payRate;
        this.empShift = empShift;
        this.startDate = startDate;
    }


    //Get methods for employee class parameters
    public String getEmpName() {

        return this.empName;
    }

    public String getEmpPosition() {

        return this.empPosition;
    }

    public int getEmpShift() {

        return this.empShift;
    }

    public String getStartDate() {

        return this.startDate;
    }

    public boolean getSalaried() {

        return this.salaried;
    }

    public double getPayRate() {

        return this.payRate;
    }


    //Set methods for employee class parameters
    public void setEmpName(String empName) {

        this.empName = empName;
    }

    public void setSalaried(boolean salaried) {

        this.salaried = salaried;
    }

    public void setEmpShift(int empShift) {

        this.empShift = empShift;
    }

    public void setEmpPosition(String empPosition) {

        this.empPosition = empPosition;
    }

    public void setPayRate(double payRate) {

        this.payRate = payRate;
    }

    public void setStartDate(String startDate) {

        this.startDate = startDate;
    }

    //Calculate Total Pay with shift differential
    public double calculateWeeklyPay(double hours) {
        //declare variables
        double results = 0.00;
        double newRate = 0.00;

        //determine shift differential
        switch (this.empShift) {
            case 2:
                newRate = this.payRate * 1.05;
                break;
            case 3:
                newRate = this.payRate * 1.1;
                break;
            default:
                newRate = this.payRate;
        }

        //Calculate pay with overtime if hourly
        if (salaried == false) {
            if (hours <= 40) {
                results = hours * newRate;
            } else {
                results = (40 * newRate) + ((hours-40) * newRate * 1.5);
            }
        } else {
            results = 40 * newRate;
        }

        return results;
    }


    //Print function
    public void printAll(double hours) {
        System.out.println("Employee: " + this.empName +
                        //"\n{Insert PositionTitle} is salaried: " + this.salaried +
                        "\n" + this.empPosition + " is salaried: " + this.salaried +
                        "\nCurrent Shift: " + this.empShift +
                        "\nRate of pay is: " + priceFormatter.format(this.payRate) + " per hour" +
                "\n" + this.empName + " earned " + priceFormatter.format(calculateWeeklyPay(hours)) + " this week." + "\n") ;
    }
}

