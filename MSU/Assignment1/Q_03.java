package MSU.Assignment1;

import java.util.concurrent.TimeUnit;
import MSU.Assignment1.classes.BMI;
import MSU.Assignment1.classes.BMI_SwitchCase;

public class Q_03
{
    public static void main(String[] args) throws InterruptedException 
    {
        // Call BMI class -- uses nested if statement
        BMI first = new BMI();
        BMI_SwitchCase second = new BMI_SwitchCase();

        System.out.print("\033[H\033[2J");
        System.out.flush(); 
        System.out.println("Nested If Statement");
        TimeUnit.SECONDS.sleep(2);  
        first.ifNested();
        TimeUnit.SECONDS.sleep(3);

        System.out.print("\033[H\033[2J");
        System.out.flush(); 
        System.out.println("Switch Case Statement");
        TimeUnit.SECONDS.sleep(2);
        second.switchCase();
        TimeUnit.SECONDS.sleep(3);



        // TimeUnit.SECONDS.sleep(3);

        // System.out.print("\033[H\033[2J");
        // System.out.flush(); 

        // System.out.println("Switch Case Statement");
        // TimeUnit.SECONDS.sleep(6);
        // // Call BMI_SwitchCase class -- uses switch case function
        // BMI_SwitchCase.main(ifNested);









    // public static void main(String[] args) throws InterruptedException 
    // {
    //     System.out.print("\033[H\033[2J");
    //     System.out.flush(); 
        
    //     process: 
    //     for(int i = 0; i < 2; ++i)
    //     {
    //         boolean executeProg = true;
    //         if(i < 1)
    //         {
    //             System.out.print("\033[H\033[2J");
    //             System.out.flush(); 

    //             System.out.println("Nested If Statement");
    //             TimeUnit.SECONDS.sleep(6);  

    //             // Call BMI class -- uses nested if statement
    //             BMI.main(args);
    //             TimeUnit.SECONDS.sleep(3);
    //             executeProg = false;
    //             continue process;
    //         }
    //         if(executeProg)
    //         {
    //             System.out.print("\033[H\033[2J");
    //             System.out.flush(); 

    //             System.out.println("Switch Case Statement");
    //             TimeUnit.SECONDS.sleep(6);

    //             // Call BMI_SwitchCase class -- uses switch case statement
    //             BMI_SwitchCase.main(args);
    //             TimeUnit.SECONDS.sleep(3);  
    //         }
    //         executeProg = true;
    //     }









        // System.out.println("[OOP ASSIGNMENT 1]: QUESTION 3\n\nWelcome my friend..\nThis cheap program will calculate your BMI.");
        // TimeUnit.SECONDS.sleep(6);
        // // Call BMI_SwitchCase class -- uses switch case function
        // BMI_SwitchCase.main(args);

        // for (int i = 0; i < 2; i++) 
        // {
        //     if (i == 1) 
        //     {
        //         System.out.print("\033[H\033[2J");
        //         System.out.flush(); 
        //         System.out.println("Nested If Statement");
        //         TimeUnit.SECONDS.sleep(6);              
        //         // Call BMI class
        //         BMI.main(args);
        //         TimeUnit.SECONDS.sleep(3);
        //     }
        //     else
        //     {
        //         System.out.print("\033[H\033[2J");
        //         System.out.flush(); 

        //         System.out.println("Switch Case Statement");
        //         TimeUnit.SECONDS.sleep(6);
        //         // Call BMI_SwitchCase class -- uses switch case function
        //         BMI_SwitchCase.main(args);
        //         TimeUnit.SECONDS.sleep(3);
        //     }
        // }        



    }
}

