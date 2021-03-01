package MSU.Assignment1;

import java.util.concurrent.TimeUnit;
import MSU.Assignment1.classes.WhileLoop;

public class Q_05 
{
    public static void main(String[] args) throws InterruptedException 
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
 
        System.out.println("[OOP ASSIGNMENT 1]: QUESTION 5\n\nWelcome my friend..\nThis cheap program will test your skills in typing.");
        TimeUnit.SECONDS.sleep(6);

        // Call WhileLoop class
        WhileLoop.main(args);
    }    
}

