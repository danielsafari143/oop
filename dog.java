package oop;

class Dog extends Animal{
    String breed;
    private int age;
    protected String color;
    protected String name;

    private static String COLOR = "#34af34";

    public Dog(String name){
        super(12345 , 23);
        this.name = name;
        System.err.println(name + " " + Dog.COLOR);
    }

   @Override
   protected String crie(String spec) {
       // TODO Auto-generated method stub
       return super.crie(spec);
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

