package MSU.OOP.Assignment1.classes; // set current working directory.
import java.util.Scanner; // import Scanner class from java utils.
public class Sum
{
    // uncomment the main method below for testing & debugging purpose.
    // public static void main(String[] args)
    public void sum() // <<-- comment the public method within this line for testing & debugging purpose, and uncomment it to use it for main class of another directory.
    {        
        System.out.print("\033[H\033[2J"); // moves the cursor at the top left corner of the screen or console and clears the screen from the cursor to the end of the screen.
        System.out.flush(); // flush out the previous console screen.   
        System.out.println("The sum of number is " + sumNumbers()); // print out the statement and output display for sumNumbers result.
    }

    private static int sumNumbers()
    {
        System.out.print("\033[H\033[2J"); // moves the cursor at the top left corner of the screen or console and clears the screen from the cursor to the end of the screen.
        System.out.flush(); // flush out the previous console screen. 
        System.out.println("Type any integer value and press enter, then type another integer to stack it.\nType 0 to end the program and display the output. "); // print out the main instruction statement to the user.
        
        Scanner scan = new Scanner(System.in); // assign scan as Scanner class variable and construct a new Scanner which allows user to read value from the input stream source such as System.in class.
        int sum = 0, number; // assign sum as integer variable and set the value to 0.
        while((number = scan.nextInt()) != 0) sum += number; // while looping the scanner process, if the value of condition doesn't match to 0, then sum the current value and run the next statement. The process repeats until the user type in 0 value.

        scan.close(); // close the Scanner class to avoid resource leak warning.
        return sum; // return the sum value to current method.
    }    
}

