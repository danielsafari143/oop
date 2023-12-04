package oop;

class Dog {
    String breed;
    int age;
    String color;
    String name;

    private static String COLOR = "#34af34";

    public Dog(String name){
        this.name = name;
        System.err.println(name + " " + Dog.COLOR);
    }

    void barking(){} // Methods/Behavior
    void hungry(){} // Methods/Behavior
    void sleeping(){} // Methods/Behavior
}

