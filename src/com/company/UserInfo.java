package com.company;

class UserInfo extends Inheritance {
    String address;

    UserInfo(String name, String number, String address){
        super(name, number);
        this.address=address;
    }

    void userDetails(){
        System.out.println(this.name+" "+this.number+" "+this.address);
    }

}
