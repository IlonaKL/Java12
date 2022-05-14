package com.company;

public class Overload {
    static void area(int a){
        System.out.println("Rectangle: "+a*a);
    }

    static void area(int a, int b){
        System.out.println("Square: "+a*b);
    }


    public static void main(String[] args) {
        area(3);
        area(3,5);
    }
}
