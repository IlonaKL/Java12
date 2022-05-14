package com.Inher;

public class Quiz {}


class T {
    int t = 20;
}
class M extends T{
    public static void main(String args[]) {
        T t1 = new T();
        System.out.println(t1.t);
    }
}