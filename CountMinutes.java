package oop;

public class CountMinutes extends Thread {
    @Override
    public void run(){
       try {
         for(int i = 0; i < 5; i++){
            System.out.println("The result is there :" + i);
            Thread.sleep(1000);
         }
       } catch (Exception e) {
         System.out.println(e);
       }
    }
}
