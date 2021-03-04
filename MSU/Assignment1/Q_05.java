package MSU.Assignment1;
import java.util.concurrent.TimeUnit;
import MSU.Assignment1.classes.WhileLoop;

public class Q_05 
{
    public static void Q5() throws InterruptedException 
    {
        WhileLoop main = new WhileLoop();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("[OOP ASSIGNMENT 1]: QUESTION 5\n\nWelcome my friend..\nThis app will test your skills in typing.");
        TimeUnit.SECONDS.sleep(6);
        main.loop();
    }    
}

