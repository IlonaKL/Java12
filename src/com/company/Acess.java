package com.company;

public class Acess {

    double sum(double[] arr){
        double sum=arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }


    public static void main(String[] args) {
        Acess obj=new Acess();
        double [] array={1, 4.5, 6, 6.5, 4};
        System.out.println(obj.sum(array));

    }
}
