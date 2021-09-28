package com.company;

public class Date {

    private int year;
    private int month;
    private int day;

    Date (int dag, int maaned, int aar){
        day = dag;
        month = maaned;
        year = aar;
    }

    public String toString() {
        return "Dato: " + day + "/" + month + "-" + year+".";
    }
}
