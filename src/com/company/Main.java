package com.company;

public class Main {

    static void printDate(Date date) {
        System.out.println(date);
    }

    public static void main(String[] args) {

        Date birthday = new Date(7,10,2000);
        printDate(birthday);

    }
}
