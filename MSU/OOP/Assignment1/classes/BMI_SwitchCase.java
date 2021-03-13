package MSU.OOP.Assignment1.classes; // set current working directory.
import java.util.Scanner; // import Scanner class from java utils.
public class BMI_SwitchCase 
{
    // uncomment the comment below for debugging purpose.
    // public static void main(String[] args)    
    public void switchCase()
    {
        System.out.print("\033[H\033[2J"); // moves the cursor at the top left corner of the screen or console and clears the screen from the cursor to the end of the screen.
        System.out.flush(); // flush out the previous console.      

        Scanner scan = new Scanner(System.in); // assign scan as Scanner class variable and construct a new Scanner which allows user to read value from the input stream source such as System.in class.
        System.out.print("What is your total height in cm?\n"); // print out the first instruction (height input) to the user.
        double height = scan.nextDouble(); // assign height as double floating variable and set the entry to scan variable in nextDouble() method of Scanner class.
        if( height < 1 || height > 250) // if else statement condition, if height value is less than 1 or more than 250, then execute the error message and terminate the program.
        {
            System.out.print("\033[H\033[2J"); // moves the cursor at the top left corner of the screen or console and clears the screen from the cursor to the end of the screen.
            System.out.flush(); // flush out the previous console. 
            System.out.println("Dude, you have entered an invalid value for height!"); // print out the error message to the user.
            System.out.println("Program has ended.."); // print out the program termination message to the user.
            System.exit(0); // exit the program.
        }
        System.out.print("\033[H\033[2J"); // moves the cursor at the top left corner of the screen or console and clears the screen from the cursor to the end of the screen.
        System.out.flush(); // flush out the previous console.      

        System.out.print("What is your total weight in kg?\n"); // print out the second instruction (weight input) to the user.
        double weight = scan.nextDouble(); // assign weight as double floating variable and set the entry to scan variable in nextDouble() method of Scanner class.
        if( weight < 1 || weight > 500) // if else statement condition, if weight value is less than 1 or more than 500, then execute the error message and terminate the program.
        {
            System.out.print("\033[H\033[2J"); // moves the cursor at the top left corner of the screen or console and clears the screen from the cursor to the end of the screen.
            System.out.flush(); // flush out the previous console. 
            System.out.println("Dude, you have entered an invalid entry for weight!"); // print out the error message to the user.
            System.out.println("Program has ended.."); // print out the program termination message to the user.
            System.exit(0); // exit the program.
        }

        double heightIn = height; // assign heightIn as double floating variable and set the value to height variable.
        double weightIn = weight; // assign weightIn as double floating variable and set the value to weight variable.
        double BMI = weightIn/((heightIn/100)*(heightIn/100));

        System.out.print("\033[H\033[2J"); // moves the cursor at the top left corner of the screen or console and clears the screen from the cursor to the end of the screen.
        System.out.flush(); // flush out the previous console.      
        if (BMI > 0)
        {
            switch 
            (
                (BMI < 16) ? 0 : // statement condition, if BMI value is less than 16, then execute the switch case statement of 0 and print out the error message. Then move to the next case 1.
                (BMI > 15 && BMI < 20) ? 1 : // statement condition, if BMI value is more than 15 and less than 20, then execute the switch case statement of 1 and print out the statement and BMI output message. Then move to the case 2.
                (BMI > 19 && BMI < 25) ? 2 : // statement condition, if BMI value is more than 19 and less than 25, then execute the switch case statement of 2 and print out the statement and BMI output message. Then move to the case 3.
                (BMI > 24 && BMI < 31) ? 3 : // statement condition, if BMI value is more than 24 and less than 31, then execute the switch case statement of 3 and print out the statement and BMI output message. Then move to the case 3.
                (BMI > 30) ? 4 : 4 // statement condition, if BMI value is more than 30, then execute the switch case statement of 4 and print out the statement and BMI output message. Then move to the case 4.
            )
            {
                case 0:
                    System.out.printf("Your BMI is %.0f", BMI);
                    System.out.println("\n\nERROR: Your BMI is off chart!\nPlease provide the valid input!!");
                    break; // end the statement.
                case 1:
                    System.out.printf("Your BMI is %.0f", BMI);
                    System.out.printf("\nClassification: Underweight!");
                    System.out.println("\nComputer advice:\nYou should start calling yourself 'stick'.");
                    break; // end the statement.
                case 2:
                    System.out.printf("Your BMI is %.0f", BMI);
                    System.out.println("\nClassification: Normal.");
                    System.out.println("\nComputer advice:\nGreat, you're finally normal.");
                    break; // end the statement.
                case 3:
                    System.out.printf("Your BMI is %.0f", BMI);
                    System.out.println("\nClassification: Overweight!");
                    System.out.println("\nComputer advice:\nCongratulation, you earned a honorary title 'Fat-Ass'.");
                    break; // end the statement.          
                case 4:
                    System.out.printf("Your BMI is %.0f", BMI);
                    System.out.println("\nClassification: Obese!!");
                    System.out.println("\nComputer advice:\nYou're a monster!! I don't know what you had become..");
                    break; // end the statement.
            }
        }
        scan.close(); // close the Scanner class to avoid resource leak warning.
    }
}


