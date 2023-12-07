package oop;

public class Main {
    static int a = 1;
    static int b = 11;
    static double c = 7.3;
    static double d = 9.4;
    static String name = "Safari";

    static double result1 = minFunction(c , d);

    public static int minFunction(int a , int b){
        int min;
        
        if(a < b) {
            min = a;
        }
        else
            min = b;

        return min;
    }
    public static double minFunction(double a , double b){
        double min;
        
        if(a < b) {
            min = a;
        }
        else
            min = b;

        return min;
    }

    public static void main(String[] args) {
       CountMinutes counter = new CountMinutes();
       CountMinutes counter2 = new CountMinutes();

       counter.start();
       counter2.start();
    };
}