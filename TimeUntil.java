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
        

        futureHour = Integer.parseInt(futureTime.substring(0, 2));
        futureMinute = Integer.parseInt(futureTime.substring(3, 5));
        futureSecond = Integer.parseInt(futureTime.substring(6, 8));

        System.out.println(currentHour);
        System.out.println(currentMinute);
        System.out.println(currentSecond);
        
        // hourDiff = ldt.minusHours(futureHour);
        // minuteDiff = ldt.minusMinutes(futureMinute);
        // secondDiff = ldt.minusSeconds(futureSecond);

       
        
        if(!(futureSecond > currentSecond)){
            currentMinute = currentMinute + 1;
        }
        
        hourDiff = futureHour - currentHour;
        minuteDiff = futureMinute - currentMinute;
        secondDiff = futureSecond - currentSecond;

        if(hourDiff < 0){       // to make sure time diff is correct if past 12
            hourDiff += 12;
        }

        if(minuteDiff < 0){
            minuteDiff += 60;
            hourDiff -= 1;
            if(hourDiff < 0){       // to make sure time diff is correct if past 12
                hourDiff += 12;
            }
        }

        if(secondDiff < 0){
            secondDiff += 60;
            minuteDiff -= 1;
            if(minuteDiff < 0){
                minuteDiff += 60;
                hourDiff -= 1;
                if(hourDiff < 0){       // to make sure time diff is correct if past 12
                    hourDiff += 12;
                }
            }
        }


        if(hourDiff != 0){
            System.out.println("Hour difference: " + hourDiff);
        }
        if(minuteDiff != 0){
            System.out.println("Minute difference: " + minuteDiff);
        }
        if(secondDiff != 0){
            System.out.println("Second difference: " + secondDiff);
        }
        //able to collect data. now need to write code to determine what type of math to do 
    }

}