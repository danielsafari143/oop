package oop;

public class Animal {
    String name;

    public Animal(int color , int age ){
        System.out.println("Hi Animals");
    }

    protected final String cries(String spec){
        return "This animal is " + spec;
    }
}
