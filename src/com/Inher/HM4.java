package com.Inher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class HM4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        for (int i=0; i<=500; i++){
            if(i%2==0){
                numbers.add(i);
            }
        }
        System.out.println(numbers);

        Iterator<Integer> iterator=numbers.iterator();
        while (iterator.hasNext()){
            if (iterator.next()%5==0){
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
