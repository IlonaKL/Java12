package com.company;

public class Main {



    public static void main(String[] args) {
	// write your code here
        String s1="Is it saturday? Do we have a Java Class today?";
        String s2="Is it raining?";
        s1 += s2;
        s2=s1.substring(0,s1.length()-s2.length()); //s1-s2;
        s1=s1.substring(s2.length()); //s1-s2;
            System.out.println(s1);
        System.out.println(s2);
    }
}
