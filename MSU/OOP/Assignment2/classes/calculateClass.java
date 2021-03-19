package MSU.OOP.Assignment2.classes;
import java.util.Scanner;

public class calculateClass 
{
    public void calNumbers()
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();
   
        System.out.println("Type any first integer value:");
        int num1 = scan.nextInt();
        
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Type any second integer value:");
        int num2 = scan.nextInt();
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        System.out.println("Addition:\n" + num1 + " + " + num2 + " = " + 
        (num1 + num2) + "\n");
        
        System.out.println("Subtraction:\n" + num1 + " - " + num2 + " = " + 
        (num1 - num2) + "\n");
                
        System.out.println("Division:\n" + num1 + " / " + num2 + " = " + 
        (num1 / num2) + "\n");

        System.out.println("Multiplication:\n" + num1 + " x " + num2 + " = " + 
        (num1 * num2) + "\n");

        scan.close(); // Close the Scanner class to avoid resource leak warning.
    }
}