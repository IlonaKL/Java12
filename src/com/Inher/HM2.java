package com.Inher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class HM2 {
    public static void main(String[] args) {
        LinkedList<String> words=new
                LinkedList<>(Arrays.asList("mother", "dad","moone", "sister", "husband", "sone"));
        Iterator<String> iterator=words.iterator();
        while (iterator.hasNext()){
            if(iterator.next().endsWith("e")){
                iterator.remove();
            }
        }
        System.out.println(words);


    }
}
