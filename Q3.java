package Pract2;

public class Q3 {
    
    public static void main(String [] args){

        long totalMilli = System.currentTimeMillis();
        long totalSec = totalMilli/1000;
        long currentSec = totalSec%60;
        long totalMin = totalSec/60;
        long currentMin = totalMin%60;
        long totalHrs = totalMin/60;
        long currentHrs = totalHrs%24;

        System.out.print("Current time is: " + currentHrs + ":" + currentMin + ":" + currentSec + " GMT");
    }
}
