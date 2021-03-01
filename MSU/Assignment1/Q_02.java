package MSU.Assignment1;

import MSU.Assignment1.classes.FahrenhietToCelsius;
import java.util.concurrent.TimeUnit;

public class Q_02 
{
    public static void main(String[] args) throws InterruptedException 
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("[OOP ASSIGNMENT 1]: QUESTION 2\n\nWelcome my friend..\nThis cheap program will convert the input degree of Fahrenhiet into Celcius value.");
        TimeUnit.SECONDS.sleep(6);
        
        // Call FahrenhietToCelsius class
        FahrenhietToCelsius.main(args);
    }    
}

