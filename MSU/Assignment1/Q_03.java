package MSU.Assignment1; // set current directory
import java.util.Scanner;
import java.util.concurrent.TimeUnit; // import timeunit class
import MSU.Assignment1.classes.BMI; /// import custom BMI class
import MSU.Assignment1.classes.BMI_SwitchCase; // import custom BMI_SwitchCase class

public class Q_03
{
    // "throws InterruptedException" if thread is interrupted, then clear the interrupted status and execute the process. This operation was used when using the TimeUnit class. 
    public static void Q3() throws InterruptedException 
    {
        System.out.print("\033[H\033[2J"); // moves the cursor at the top left corner of the screen or console and clears the screen from the cursor to the end of the screen.
        System.out.flush(); // flush out the previous console screen.
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose type of program to run:\n");
        System.out.print("[1] Nested If Statement\n");
        System.out.print("[2] Switch Case Statement\n");
        System.out.print("[3] Exit Cheap App\n");
        int inputMain = scan.nextInt();

        switch 
        (
            (inputMain == 1) ? 1 :
            (inputMain == 2) ? 2 : 2
        )
        {
            case 1:
                BMI main1 = new BMI(); // assign first to BMI class as the new operator instantiates the BMI method
                System.out.print("\033[H\033[2J"); // moves the cursor at the top left corner of the screen or console and clears the screen from the cursor to the end of the screen.
                System.out.flush(); // flush out the previous console screen.
                System.out.println("[OOP ASSIGNMENT 1]: QUESTION 3 - Nested If Statement\n\nWelcome my friend..\nThis cheap program will calculate your BMI."); // print out the main display for Nested If Statement.
                TimeUnit.SECONDS.sleep(4); // set the console to sleep for 4 seconds.
                main1.ifNested(); // invoke variable of first and execute the ifNested method from BMI class.
                TimeUnit.SECONDS.sleep(3); // set the console to sleep for 3 seconds.
                break;

            case 2:
                BMI_SwitchCase main2 = new BMI_SwitchCase(); // assign second to BMI_SwitchCase class as the new operator instantiates the BMI_SwitchCase method
                System.out.print("\033[H\033[2J"); // moves the cursor at the top left corner of the screen or console and clears the screen from the cursor to the end of the screen.
                System.out.flush(); // flush out the previous console screen.
                System.out.println("[OOP ASSIGNMENT 1]: QUESTION 3 - Switch Case Statement\n\nWelcome my friend..\nThis cheap program will calculate your BMI."); // print out the main display for Switch Case Statement.
                TimeUnit.SECONDS.sleep(4); // set the console to sleep for 4 seconds.
                main2.switchCase(); // invoke variable of second and execute the switchCase method from BMI_SwitchCase class.
                TimeUnit.SECONDS.sleep(3); // set the console to sleep for 3 seconds.
                break;
                
            case 3:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Doggo: Goodbye my friend!");
                TimeUnit.SECONDS.sleep(10);
                break;  
        }
        scan.close();
    }
}


































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
