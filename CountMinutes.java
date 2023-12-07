package oop;
import java.time.LocalTime;

public class CountMinutes extends Thread {
    int counterName;
    LocalTime time;

    CountMinutes(int counterName){
        this.counterName = counterName;
    }

    @Override
    public void run(){
       try {
         for(int i = 0; i < 5; i++){
            this.time = LocalTime.now();
            Thread.sleep(1000);
            System.out.println(time);
         }
       } catch (Exception e) {
         System.out.println(e);
       }
    }
}
