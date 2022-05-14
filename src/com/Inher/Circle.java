package com.Inher;

public class Circle extends Shape{

    Circle(double radius){
        super(radius);
    }
    void area(){
        System.out.println(this.radius*this.radius* Math.PI);
    }
}
