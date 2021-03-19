package MSU.OOP.Assignment2.classes;
import java.util.Scanner;

public class evodClass 
{
    public void EvOdNumber()
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Type any integer value:");
        int num = scan.nextInt();  

        System.out.print("\033[H\033[2J");
        System.out.flush();

        if(evenNum(num))
        {
            System.out.println(num + " is an even number!");
        }
        else
        {
            System.out.println(num + " is an odd number!");
        }   
        
        scan.close(); // Close the Scanner class to avoid resource leak warning.
    }

    public static boolean evenNum(int number)
    {
        if(number % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}