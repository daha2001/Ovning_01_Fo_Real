package com.company;

public class Main {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int change;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("------");

        change = a;
        a = b;
        b = change;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
