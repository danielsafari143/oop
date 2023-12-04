package oop;

class Dog {
    String breed;
    private int age;
    String color;
    String name;

    private static String COLOR = "#34af34";

    public Dog(String name){
        this.name = name;
        System.err.println(name + " " + Dog.COLOR);
    }

    int getAge () {
        return age;
    }

    void setAge (int value){
        this.age = value;
    }

    void barking(){} // Methods/Behavior
    void hungry(){} // Methods/Behavior
    void sleeping(){} // Methods/Behavior
}

