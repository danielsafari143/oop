package oop;

public class Salary extends Employee{
    private double salary;

    @Override
    public double computePay() {
        System.err.println("The salary is " + salary/10);
        return salary;
    }
}
