package com.company;

public class Students {
    String name;
    int id;
    static int numberOfStudents;

    public static void main(String[] args) {
        Students st1=new Students();
        Students st2=new Students();
        Students st3=new Students();

        st1.name="Ilona";
        st1.id=1;
        Students.numberOfStudents=3;

        st2.name="Jamy";
        st2.id=2;
        Students.numberOfStudents=5;

        st3.name="Mar";
        st3.id=3;
        Students.numberOfStudents=4;

        System.out.println(numberOfStudents);
    }
}
