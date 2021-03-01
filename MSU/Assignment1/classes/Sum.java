package MSU.Assignment1.classes;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) throws InterruptedException
    {        
        // Flush out the previous console screen
        System.out.print("\033[H\033[2J");  // "\033[H" It moves the cursor at the top left corner of the screen or console. "\033[2J" It clears the screen from the cursor to the end of the screen.
        System.out.flush();
                
        // Display the sum output
        System.out.println("The sum of number is " + sumNumbers());
    }

    private static int sumNumbers() throws InterruptedException
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Type any integer value and press enter, then type another integer to stack it.\nType 0 to end the program and display the output. ");
        
        Scanner scan = new Scanner(System.in);

        // Declare variables as integer and set init sum as 0
        int sum = 0, number;

        // Loop the scanner process, if the value condition doesn't match 0, then sum the current value and run the next statement, repeat until user type in the 0 value
        while((number = scan.nextInt()) != 0) sum += number;

        // Close the Scanner input method to avoid resource leak
        scan.close();

        // Return the sum value
        return sum;
    }    
}
