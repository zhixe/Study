package MSU.Assignment1; // set current directory
import java.util.concurrent.TimeUnit; // import timeunit class from java utils concurrent
import MSU.Assignment1.classes.Input123; // import Input123 class from local directory

public class Q_05 
{
    public static void Q5() throws InterruptedException 
    {
        Input123 main = new Input123();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("[OOP ASSIGNMENT 1]: QUESTION 5\n\nWelcome my friend..\nThis app will test your skills in typing.");
        TimeUnit.SECONDS.sleep(6);
        main.loop();
    }    
}

