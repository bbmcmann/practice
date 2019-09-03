import java.util.Scanner;
import java.time.LocalDateTime;

public class TimeUntil{

    public static void main(String[] args){

        LocalDateTime ldt = LocalDateTime.now();
        Scanner input = new Scanner(System.in);

        int currentHour = ldt.getHour();
        int currentMinute = ldt.getMinute();
        int currentSecond = ldt.getSecond();
        int futureHour, futureMinute, futureSecond;
        int hourDiff, minuteDiff, secondDiff;

        String futureTime;
        
        System.out.println("Enter a time in hh:mm:ss format");

        futureTime = input.nextLine();
        
        System.out.println(futureTime);

        futureHour = Integer.parseInt(futureTime.substring(0, 2));
        futureMinute = Integer.parseInt(futureTime.substring(3, 5));
        futureSecond = Integer.parseInt(futureTime.substring(6, 8));

        System.out.println(currentHour);
        System.out.println(currentMinute);
        System.out.println(currentSecond);
        
        hourDiff = futureHour - currentHour;
        minuteDiff = futureMinute - currentMinute;
        secondDiff = futureSecond - currentSecond;
        
        //able to collect data. now need to write code to determine what type of math to do 
    }

}