package com.codewithmosh;

public class Encapsulamiento {

    public static void main(String[] args){

        User alu = new User();
        User alu2 = new User(1,"Gaby","Ilarreta",32);

        System.out.println(alu2.getName());
        System.out.println(alu2.getLastname());
        System.out.println(alu2.getAge());

    }
}
