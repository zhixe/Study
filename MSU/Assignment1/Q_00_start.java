package MSU.Assignment1;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Q_00_start {
    public static void main(String[] mainPage) throws InterruptedException 
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("############################################");
        System.out.println("################# CHEAP APP ################");
        System.out.println("############################################\n");
        System.out.println("Hello there stranger! Welcome to Cheap App.");
        System.out.println("Don't be shy, come let's get some drinks.\n");
        System.out.println("Cheap App allows cheap people to use the");
        System.out.println("paid app without having to pay.\n");
        System.out.println("############################################");
        System.out.println("########## BUILT FOR CHEAP PEOPLE ##########");
        System.out.println("############################################");
        TimeUnit.SECONDS.sleep(1);

        Scanner scan = new Scanner(System.in);
        boolean repeat;

        do 
        {
            System.out.print("\033[H\033[2J");
            System.out.flush();            
            repeat = false;
            System.out.println("#######[OOP ASSIGNMENT 1]#######\n");
            System.out.println("Please choose which app to run.");
            System.out.println("Choose integer from 1 to 5:");
            displayInstructions();

            int input = scan.nextInt();

            if(input > 0 && input < 7)
            {
                repeat = extracted(repeat, input);
            }
            else if(input < 1 || input > 6) 
            {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Dude! you entered the wrong value!\nPlease try again and choose integer from 1 to 6 only:");
                break;
            }
            scan.close();
        } while(repeat);
    }

    private static boolean extracted(boolean repeat, int input) throws InterruptedException 
    {
        switch(input) 
        {
            case 1:
                Q_01.Q1();
                break;
            case 2:
                Q_02.Q2();
                break;
            case 3:
                Q_03.Q3();
                break;
            case 4:
                Q_04.Q4();
                break;
            case 5:
                Q_05.Q5();
                break;
            case 6:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Doggo: Goodbye my friend!");
                TimeUnit.SECONDS.sleep(10);
                break;                
            default:
                repeat = true;
        }
        return repeat;
    }

    private static String displayInstructions()
    {
        System.out.println("App [1]: Question 1");
        System.out.println("App [2]: Question 2");
        System.out.println("App [3]: Question 3");
        System.out.println("App [4]: Question 4");
        System.out.println("App [5]: Question 5");
        System.out.println("App [6]: Exit the program");
        return null;
    }
}

