package MSU.Assignment1;

import java.util.concurrent.TimeUnit;
import MSU.Assignment1.classes.Sum;

public class Q_01
{
    public static void main(String[] args) throws InterruptedException
    {        
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Read the input value from the user
        System.out.println("[OOP ASSIGNMENT 1]: QUESTION 1\n\nWelcome my friend..\nThis cheap program will sum all the input integers and display the output.");
        TimeUnit.SECONDS.sleep(6);    

        // Call Sum class
        Sum.main(args);
    }
}

