package oop;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    static int a = 1;
    static int b = 11;
    static double c = 7.3;
    static double d = 9.4;
    static String name = "Safari";

    public static void main(String[] args) {
       HashSet<String> cars = new HashSet<String>();
       cars.add("Volvo");
       cars.add("Volvo");
       cars.add("Toyota");

       Iterator<String> carsIterator= cars.iterator();
      
       while(carsIterator.hasNext()){
        System.out.println(carsIterator.next());
       }
    };
}