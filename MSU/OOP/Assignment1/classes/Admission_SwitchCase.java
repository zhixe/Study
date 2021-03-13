package MSU.OOP.Assignment1.classes; // set current working directory.
import java.util.Scanner; // import Scanner class from java utils.
public class Admission_SwitchCase 
{
    public void switchCase()
    {
        System.out.print("\033[H\033[2J"); // moves the cursor at the top left corner of the screen or console and clears the screen from the cursor to the end of the screen.
        System.out.flush(); // flush out the previous console.

        Scanner scan = new Scanner(System.in); // assign scan as Scanner class variable and construct a new Scanner which allows user to read value from the input stream source such as System.in class.
        System.out.println("Input your grade point average (0.00-4.00):");
        double gpa = scan.nextDouble(); // assign gpa as double floating variable and set the entry to scan variable in nextDouble() method of Scanner class.
 
        System.out.print("\033[H\033[2J"); // moves the cursor at the top left corner of the screen or console and clears the screen from the cursor to the end of the screen.
        System.out.flush(); // flush out the previous console.
        System.out.println("Input your test score (0-100):");
        int test = scan.nextInt();
 
        System.out.print("\033[H\033[2J"); // moves the cursor at the top left corner of the screen or console and clears the screen from the cursor to the end of the screen.
        System.out.flush(); // flush out the previous console.
 
        if(gpa < 0.00 || gpa > 4.00) // if else statement condition, if gpa value is less than 0.00 or more than 4.00, then execute the nested switch case statement.
        {
            switch 
            (
                (test > 100 || test < 0) ? 0 : // statement condition, if test value is more than 100 and less than 0, then execute the switch case statement of 0 and print out the Error message. Then move to the next case 3.
                (test >= 0 && test <= 10) ? 1 : 1 // statement condition, if test value is less than 60, then execute the switch case statement of 1 and print out the Error message. Then move to the case 1.
            )
            {
                case 0:
                    System.out.println("GPA: " + gpa);
                    System.out.println("Test score: " + test);
                    System.out.println("\nERROR: Invalid value!");
                    System.out.println("GPA value must be in range 0.00 to 4.00, and");
                    System.out.println("test score must be an integer value within range 0 to 100");
                    break; // end the statement.
                case 1:
                    System.out.println("GPA: " + gpa);
                    System.out.println("Test score: " + test);
                    System.out.println("\nERROR: Invalid value!");
                    System.out.println("GPA value must be in range 0.00 to 4.00");
                    break; // end the statement.
            }
        }
        else if(gpa > 2.99 && gpa < 4.01) // if else statement condition, if gpa value is more than 2.99 and less than 4.01, then execute the nested switch case statement.
        {
            switch
            (
                test > 59 && test < 101 ? 2 : // statement condition, if test value is more than 59 and less than 101, then execute the switch case statement of 2 and print out the Accept message. Then move to the next case 3.
                test < 60 ? 3 : 3 // statement condition, if test value is less than 60, then execute the switch case statement of 3 and print out the Reject message. Then move to the case 3.
            )
            {
                case 2:
                    System.out.println("GPA: " + gpa);
                    System.out.println("Test score: " + test);
                    System.out.println("Status: Accept");   
                    break; // end the statement.
                case 3:
                    System.out.println("GPA: " + gpa);
                    System.out.println("Test score: " + test);
                    System.out.println("Status: Reject");             
                    break; // end the statement.
            }
        }
        else if(gpa < 3.00 && gpa > 0.00) // if else statement condition, if gpa value is more less 3.00 and more than 0.0, then execute the nested switch case statement.
        {
            switch
            (
                test > 79 && test < 101 ? 4 : // statement condition, if test value is more than 79 and less than 101, then execute the switch case statement of 4 and print out the Accept message. Then move to the next case 5. 
                test < 80 ? 5 : 5 // statement condition, if test value is less than 80, then execute the switch case statement of 5 and print out the Reject message. Then move to the case 5.
            )
            {
                case 4:    
                    System.out.println("GPA: " + gpa);
                    System.out.println("Test score: " + test);
                    System.out.println("Status: Accept");
                    break; // end the statement.

                case 5:
                    System.out.println("GPA: " + gpa);
                    System.out.println("Test score: " + test);
                    System.out.println("Status: Reject");
                    break; // end the statement.
            }
        }
       scan.close(); // close the Scanner class to avoid resource leak warning.
    }
}

