package MSU.Assignment1;
import java.util.concurrent.TimeUnit;
import MSU.Assignment1.classes.Sum;

public class Q_01
{
    // "throws InterruptedException" if thread is interrupted, then clear the interrupted status and execute the process. This operation was used when using the TimeUnit class. 
    public static void Q1() throws InterruptedException 
    {        
        Sum main = new Sum();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("[OOP ASSIGNMENT 1]: QUESTION 1\n\nWelcome my friend..\nThis app will sum all the input integers and display the output.");
        TimeUnit.SECONDS.sleep(6);    
        main.sum();
    }
}

