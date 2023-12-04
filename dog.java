package oop;

class Dog extends Animal{
    String breed;
    private int age;
    protected String color;
    protected String name;

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

    void hungry(){} // Methods/Behavior
    void sleeping(){} // Methods/Behavior
}

