package MSU.OOP.Assignment2.classes; // Set current working directory.
import java.util.Scanner; // Import Scanner class from java utils.


public class calculateClass // Construct calculateClass class for OOP A2 Question 1
{
    public void calNumbers() // Declare a method to calculate the two inputs by using 'Addition', 'Subtraction', 'Division' and 'Multiplication' formulas.
    {
        Scanner scan = new Scanner(System.in); // Assign scan as a Scanner class variable and instantiate a new object to a Scanner class constructor which initializes the new object with parameter of System.in.

        System.out.print("\033[H\033[2J"); // Navigate the cursor to the terminal screen.
        System.out.flush(); // Clear the terminal screen.
   
        System.out.println("Type any first integer value:"); // Print out the first instruction to the user.
        int num1 = scan.nextInt(); // Store the input given by the user from scan variable as a variable num1 and define it as integer data type.
        
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Type any second integer value:"); // Print out the second instruction to the user.
        int num2 = scan.nextInt(); // Store the input given by the user from scan variable as a variable num2 and define it as integer data type.
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        System.out.println("Addition:\n" + num1 + " + " + num2 + " = " + 
        (num1 + num2) + "\n"); //print out the 'Addition' result in integer format.
        
        System.out.println("Subtraction:\n" + num1 + " - " + num2 + " = " + 
        (num1 - num2) + "\n"); //print out the 'Subtraction' result in integer format.
                
        System.out.println("Division:\n" + num1 + " / " + num2 + " = " + 
        (num1 / num2) + "\n"); //print out the 'Division' result in integer format.

        System.out.println("Multiplication:\n" + num1 + " x " + num2 + " = " + 
        (num1 * num2) + "\n"); //print out the 'Multiplication' result in integer format.

        scan.close(); // Close the Scanner class to avoid resource leak warning.
    }
}