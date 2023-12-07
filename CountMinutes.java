package oop;

public class CountMinutes extends Thread {
    int counterName;

    CountMinutes(int counterName){
        this.counterName = counterName;
    }

    @Override
    public void run(){
       try {
         for(int i = 0; i < 5; i++){
            System.out.println("The result of counter"+ counterName +" is there :" + i);
            Thread.sleep(3000);
         }
       } catch (Exception e) {
         System.out.println(e);
       }
    }
}
