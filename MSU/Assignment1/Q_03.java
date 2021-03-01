package MSU.Assignment1;

import java.util.concurrent.TimeUnit;
import MSU.Assignment1.classes.BMI;
// import MSU.Assignment1.classes.BMI_SwitchCase;

public class Q_03
{
    public static void main(String[] args) throws InterruptedException 
    {
        System.out.print("\033[H\033[2J");
        System.out.flush(); 
    
        System.out.println("[OOP ASSIGNMENT 1]: QUESTION 3\n\nWelcome my friend..\nThis cheap program will calculate your BMI.");
        TimeUnit.SECONDS.sleep(6);
        
        // Call BMI class
        BMI.main(args);

        // // Call BMI_SwitchCase class -- uses switch case function
        // BMI_SwitchCase.main(args);
    }
}

