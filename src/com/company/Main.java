
package com.company;


public class Main {

    public static void main(String[] args) {

        //Declare employees with given parameters
        Employee emp1 = new Employee("Diana Prince", PositionTitle.ADMINISTRATION.empTitle(), true, 27.00, 1,"08/10/2010");
        Employee emp2 = new Employee("Bruce Wayne", PositionTitle.SALES.empTitle(), false, 22.00, 2, "07/15/2011");
        Employee emp3 = new Employee("Clark Kent", PositionTitle.PRODUCTION.empTitle(), false, 21.00, 3, "2/16/2012");

        //Display all employees with given hours
        emp1.printAll(45);
        emp2.printAll(50);
        emp3.printAll(35);
    }
}

