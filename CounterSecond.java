package oop;

class CounterSecond extends Animal implements Runnable{
    CounterSecond(){
        super(1, 1);
    }
    
    public void run(){
        try {
            for(int i = 0; i < 10; i++){
                System.out.println("This is the tread implemented with the Runnable interface " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}