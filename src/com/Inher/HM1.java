package com.Inher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class HM1 {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>(Arrays.asList("Bmw", "audi", "toyoya", "honda"));
        System.out.println(cars);

        Iterator<String> iterator=cars.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
