package com.company;

public enum PositionTitle {
    //configure constant Employee positions
    ADMINISTRATION("Administration"),
    PRODUCTION("Production"),
    SALES("Sales"),
    MAINTENANCE("Maintenance"),
    TECHNICAL("Technical"),
    SECRETARIAL("Secretarial");

    private String empTitle;

    PositionTitle(String empTitle) {
        this.empTitle = empTitle;
    }

    public String empTitle() {
        return empTitle;
    }

}