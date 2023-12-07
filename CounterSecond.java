package oop;

class CounterSecond implements Runnable{
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