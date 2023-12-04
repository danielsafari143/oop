package oop;

public class Main {
    static int a = 1;
    static int b = 11;
    double c = 7.3;
    double d = 9.4;

    static int result1 = minFunction(a , b);


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
         System.out.println(result1);
    };
}