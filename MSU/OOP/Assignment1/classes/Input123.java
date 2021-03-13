package MSU.OOP.Assignment1.classes; // set current working directory.
import java.util.Scanner; // import Scanner class from java utils.
import java.util.concurrent.TimeUnit; // import TimeUnit class from java utils concurrent
public class Input123 {
    // throws InterruptedException if thread is interrupted, then clear the interrupted status and execute the process. This operation is used for TimeUnit class.
    public void loop() throws InterruptedException
    {
        System.out.print("\033[H\033[2J"); // moves the cursor at the top left corner of the screen or console and clears the screen from the cursor to the end of the screen.
        System.out.flush(); // flush out the previous console.

        Scanner scan = new Scanner(System.in); // assign scan as Scanner class variable and construct a new Scanner which allows user to read value from the input stream source such as System.in class.
        displayInstructions(); // call method displayInstructions(). 
        int value; // assign value as integer variable

        while((value = scan.nextInt()) != 0) // whilprocese looping the scanner process, if the value of condition doesn't match to 0, then execute the nested if else statement. The s repeats until the user type in 0 value. 
        {
            if(value == 4) // if else statement condition, if value of value is equal to 4, then print out the program termination message to the user.
            {
                System.out.print("\033[H\033[2J"); // moves the cursor at the top left corner of the screen or console and clears the screen from the cursor to the end of the screen.
                System.out.flush(); // flush out the previous console.
                System.out.println("Program ends..");
                TimeUnit.SECONDS.sleep(2); // set the program to sleep or delay for 2 seconds.
                System.exit(0); // exit the program.
            }
            else if(value > 0 && value < 4) // if else statement condition, if value of value is more than 0 and less than 4, then print out the good job message.
            {
                System.out.print("\033[H\033[2J"); // moves the cursor at the top left corner of the screen or console and clears the screen from the cursor to the end of the screen.
                System.out.flush(); // flush out the previous console.
                System.out.println("Good job dude!");
                displayInstructions(); // call method displayInstructions()
            } 
            else // if else statement condition, if value of value is more than 4, then print out the error message and ask user to type the integer again. Repeat the statemement again.
            {
                System.out.print("\033[H\033[2J"); // moves the cursor at the top left corner of the screen or console and clears the screen from the cursor to the end of the screen.
                System.out.flush(); // flush out the previous console.
                System.out.println("Dude, wrong integer! Try again..");
                displayInstructions(); // call method displayInstructions()
            }
        }
        scan.close(); // close the Scanner class to avoid resource leak warning.
    }

    // set private static method of displayInstructions() as String.
    private static String displayInstructions()
    {
        System.out.println("Type any integer value 1,2,3 or 4"); // print out the main instruction to the user.
        return null; // return null value to the current method.
    }
}

