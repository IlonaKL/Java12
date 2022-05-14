package com.Inher;

class Animal {
    String cat;

    Animal(String cat){
        this.cat=cat;
    }

    void eat(){
        System.out.println(this.cat+" eats");
    }

    void sleep(){
        System.out.println(this.cat+" sleeps a lot");
    }

}

class Cat extends Animal{

    Cat(String cat){
        super(cat);
    }

    void eat(){
        System.out.println(cat+" eats");
    }

    void sleep(){
        System.out.println(cat+" sleeps a lot");
    }
}

class Kitten1 extends Cat{

    Kitten1(String kitten1){
        super(kitten1);
    }

    void eat(){
        System.out.println(cat+" eats milk");
    }

}

class Kitten2 extends Cat{

    Kitten2(String kitten2){
        super(kitten2);
    }

    void eat(){
        System.out.println(cat+" eats snacks");
    }
}

class Kitten3 extends Cat{

    Kitten3(String kitten3){
        super(kitten3);
    }

    void eat(){
        System.out.println(cat+" eats everything");
    }

}


class Replit166 {
    public static void main(String[] args){

        Animal [] cats= new Animal[4];
        cats[0] =new Cat("Cat");
        cats[1]= new Kitten1("kitten1");
        cats[2]= new Kitten2("kitten2");
        cats[3]= new Kitten3("kitten3");

        for(Animal cat: cats){
            cat.eat();
            cat.sleep();
        }
    }
}