package MSU.OOP.Assignment1; // set current working directory
import java.util.concurrent.TimeUnit; // import TimeUnit class from java utils concurrent
import MSU.OOP.Assignment1.classes.Sum; // import Sum class from local directory
public class Q_01
{
    // "throws InterruptedException" if thread is interrupted, then clear the interrupted status and execute the process. This operation is used for TimeUnit class. 
    public static void Q1() throws InterruptedException 
    {        
        Sum main = new Sum();
        System.out.print("\033[H\033[2J"); // moves the cursor at the top left corner of the screen or console and clears the screen from the cursor to the end of the screen.
        System.out.flush(); // flush out the previous console screen.
        System.out.println("[OOP ASSIGNMENT 1]: QUESTION 1\n\nWelcome my friend..\nThis app will sum all the input integers and display the output.");
        TimeUnit.SECONDS.sleep(6);    
        main.sum();
    }
}

