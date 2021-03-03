package MSU.Assignment1.classes; // set current directory

import java.util.Scanner; // import scanner class

public class Sum {
    // "throws InterruptedException" if thread is interrupted, then clear the interrupted status and execute the process. This operation was used when using the TimeUnit class. 
    public static void main(String[] args) throws InterruptedException
    {        
        System.out.print("\033[H\033[2J"); // moves the cursor at the top left corner of the screen or console and clears the screen from the cursor to the end of the screen.
        System.out.flush(); // flush out the previous console screen.   
        System.out.println("The sum of number is " + sumNumbers()); // print out the main display for sumNumbers result.
    }

    // "throws InterruptedException" if thread is interrupted, then clear the interrupted status and execute the process.
    private static int sumNumbers() throws InterruptedException
    {
        System.out.print("\033[H\033[2J"); // moves the cursor at the top left corner of the screen or console and clears the screen from the cursor to the end of the screen.
        System.out.flush(); // flush out the previous console screen. 
        System.out.flush(); // flush out the previous console screen. 
        System.out.println("Type any integer value and press enter, then type another integer to stack it.\nType 0 to end the program and display the output. "); // print out the main instruction to the user.
        
        Scanner scan = new Scanner(System.in); // get the input from the user.
        int sum = 0, number; // assign sum as integer variable and set the value to 0.
        while((number = scan.nextInt()) != 0) sum += number; // while looping the scanner process, if the value of condition doesn't match to 0, then sum the current value and run the next statement. The process repeats until the user type in 0 value.

        scan.close(); // close the Scanner class to avoid resource leak.
        return sum; // return the sum value.
    }    
}
