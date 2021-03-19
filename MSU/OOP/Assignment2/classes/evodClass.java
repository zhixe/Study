package MSU.OOP.Assignment2.classes; // Set current working directory.
import java.util.Scanner; // Import Scanner class from java utils.

public class evodClass // Construct evodClass class for OOP A2 Question 3
{
    public void EvOdNumber() // 1. Declare a method to print out the result of even or odd number.
    {
        Scanner scan = new Scanner(System.in); // Assign scan as a Scanner class variable and instantiate a new object to a Scanner class constructor which initializes the new object with parameter of System.in.
        
        System.out.print("\033[H\033[2J"); // Navigate the cursor to the terminal screen.
        System.out.flush(); // Clear the terminal screen.

        System.out.println("Type any integer value to find even or odd number:"); // Print out the instruction to the user.
        int num = scan.nextInt(); // Store the input given by the user from scan variable as a variable num and define it as integer data type.

        System.out.print("\033[H\033[2J");
        System.out.flush();

        if(evenNum(num)) // Call the object of evenNum(num), then print out the even number result, else print out the odd number result.
        {
            System.out.println(num + " is an even number!");
        }
        else
        {
            System.out.println(num + " is an odd number!");
        }   
        
        scan.close(); // Close the Scanner class to avoid resource leak warning.
    }

    public static boolean evenNum(int number) // 2. Declare a method to verify even and odd numbers.
    {
        if(number % 2 == 0) // When the remainder of the variable number is equal to 0, then return the boolean value true as even number, else return the boolean value false as odd number.
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}