package MSU.Assignment1; // set current directory
import java.util.concurrent.TimeUnit; // import timeunit class from java utils concurrent
import MSU.Assignment1.classes.FahrenhietToCelsius; // import FahrenhietToCelsius class from local directory

public class Q_02 
{
    public static void Q2() throws InterruptedException 
    {
        FahrenhietToCelsius main = new FahrenhietToCelsius();
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("[OOP ASSIGNMENT 1]: QUESTION 2\n\nWelcome my friend..\nThis cheap program will convert the input degree of Fahrenhiet into Celcius value.");
        TimeUnit.SECONDS.sleep(6);
        
        // Call FahrenhietToCelsius class
        main.fahcel();
    }    
}

