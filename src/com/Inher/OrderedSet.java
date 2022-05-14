package com.Inher;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class OrderedSet {
    public static void main(String[] args) {
        LinkedHashSet<String> countries=new LinkedHashSet<>();
        countries.add("Ukraine");
        countries.add("USA");
        countries.add("Canada");
        countries.add("Austria");
        countries.add("Italy");

        countries.removeIf(s -> s.startsWith("A"));

        /*
        public String toString() {
        return "Pet{" +
                "insuranceName='" + insuranceName + '\'' +
                ", petType='" + petType + '\'' +
                '}';
        }
         */

        System.out.println(countries);
    }
}
