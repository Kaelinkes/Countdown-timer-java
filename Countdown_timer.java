import java.io.Console;
import java.util.Scanner;

public class Countdown_timer {
    public static void main(String[] args) throws InterruptedException{

        Scanner input  = new Scanner(System.in);
        int hours,minute,seconds,timer;

        System.out.println("Welcome to a count down timer app!");
        System.out.print("Enter the hours (Enter 0 if less than an hour): ");
        hours = input.nextInt();
        System.out.print("Enter the minutes (Enter 0 if less than a minute):");
        minute = input.nextInt();
        System.out.print("Enter seconds: ");
        seconds = input.nextInt();

        timer = ((hours*60)+minute)*60 + seconds;
        
        for(int i = timer; i>0;i--){

            int displayHours = i / 3600;
            int displayMinutes = (i % 3600) / 60;
            int displaySeconds = i % 60;

            System.out.printf("\r%02d hours, %02d minutes and %02d seconds remain",displayHours, displayMinutes, displaySeconds);
            System.out.flush();
            Thread.sleep(1000);
        }

        System.out.println("Timer has ended!");
        input.close();    
    }
}

