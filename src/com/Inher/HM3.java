package com.Inher;

import java.util.ArrayList;
import java.util.Arrays;

public class HM3 {

    public static void main(String[] args) {
        ArrayList<String> drinks = new
                ArrayList<>(Arrays.asList("water", "soda", "coffee", "milk"));
        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
                drinks.set(i, "water");
            }
        }
        System.out.println(drinks);
    }
}

