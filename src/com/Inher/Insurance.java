package com.Inher;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class Insurance {
    String insuranceName;

    Insurance(String insuranceName){
        this.insuranceName=insuranceName;
    }

    abstract void getQuote();

    abstract void cancelInsurance();

}

class Car extends Insurance{
    String carModel;

    Car(String insuranceName, String carModel){
        super(insuranceName);
        this.carModel=carModel;
    }

    @Override
    void getQuote() {
        System.out.println("Car get Quote");

    }

    @Override
    void cancelInsurance() {
        System.out.println("Car get cancelInsurance");
    }

    @Override
    public String toString() {
        return "Car{" +
                "insuranceName='" + insuranceName + '\'' +
                ", carModel='" + carModel + '\'' +
                '}';
    }
}

class Pet extends Insurance{
    String petType;

    Pet(String insuranceName, String petType){
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    void getQuote() {
        System.out.println("Pet get Quote");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Pet get cancelInsurance");
    }

    @Override
    public String toString() {
        return "Pet{" +
                "insuranceName='" + insuranceName + '\'' +
                ", petType='" + petType + '\'' +
                '}';
    }
}

class Health extends Insurance{

    Health(String insuranceName){
        super(insuranceName);
    }

    @Override
    void getQuote() {
        System.out.println("Health get Quote");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Health get cancelInsurance");
    }

    @Override
    public String toString() {
        return "Health{" +
                "insuranceName='" + insuranceName ;
    }
}

class Test{
    public static void main(String[] args) {
        Car car=new Car("geico", "bmw");
        Health health=new Health("progressive");
        Pet pet=new Pet("farmers", "dog");

        ArrayList<Insurance> list=new ArrayList<>();
        list.add(car);
        list.add(health);
        list.add(pet);

        for (int i=0; i<list.size();i++){
            System.out.println(list.get(i).toString());
        }

        for (Insurance lis: list){
            lis.getQuote();
            lis.cancelInsurance();
        }

        Iterator<Insurance> iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
            Insurance i=iterator.next();
            i.getQuote();
            i.cancelInsurance();
        }
    }
}
