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
            Thread.sleep(60000);
             this.time = LocalTime.now();
            System.out.println(time.getMinute());
         }
       } catch (Exception e) {
         System.out.println(e);
       }
    }
}
