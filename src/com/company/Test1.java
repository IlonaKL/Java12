package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String names=input.nextLine();
        input.close();
        String [] namesArr=names.split(" ");
        Arrays.toString(namesArr);
        for (int i = 0; i < namesArr.length; i++) {
            System.out.println(namesArr[i].substring(0,3));
        }
    }
}
