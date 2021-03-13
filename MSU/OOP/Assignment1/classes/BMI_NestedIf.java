package MSU.OOP.Assignment1.classes; // set current working directory.
import java.util.Scanner; // import Scanner class from java utils.
public class BMI_NestedIf 
{
    public void NestedIf()
    {
        System.out.print("\033[H\033[2J"); // moves the cursor at the top left corner of the screen or console and clears the screen from the cursor to the end of the screen.
        System.out.flush(); // flush out the previous console.screen.       

        Scanner scan = new Scanner(System.in); // assign scan as Scanner class variable and construct a new Scanner which allows user to read value from the input stream source such as System.in class.
        System.out.print("What is your total height in cm?\n"); // print out the first instruction (height input) to the user.
        double height = scan.nextDouble(); // assign height as double floating variable and set the entry to scan variable in nextDouble() method of Scanner class.
        if(height < 1 || height > 250) // if else statement condition, if height value is less than 1 or more than 250, then execute the error message and terminate the program.
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
        double BMI = weightIn/((heightIn/100)*(heightIn/100)); // assign BMI as double floating variable and set the value to formula: "weightIn / [(heightIn / 100) * (heightIn / 100)]", to calculate the value of Body Mass Index (BMI).

        System.out.print("\033[H\033[2J"); // moves the cursor at the top left corner of the screen or console and clears the screen from the cursor to the end of the screen.
        System.out.flush(); // flush out the previous console.     
          
        if (BMI > 0) // if else statement condition, if BMI value is more than 0, then execute the nested if else statement.
        {
            if (BMI < 16) // if else statement condition, if BMI value is less than 16, then print out the error message.
            {
                System.out.printf("Your BMI is %.0f", BMI);
                System.out.println("\n\nERROR: Your BMI is off chart!\nPlease provide the valid input!!");
            }  
            else if (BMI > 15 && BMI < 20) // if else statement condition, if BMI value is more than 15 and less than 20, then print out the underweight classification message.
            {
                System.out.printf("Your BMI is %.0f", BMI);
                System.out.printf("\nClassification: Underweight!");
                System.out.println("\nComputer advice:\nYou should start calling yourself 'stick'.");
            } 
            else if (BMI > 19 && BMI < 25) // if else statement condition, if BMI value is more than 19 and less than 25, then print out the normal classification message. 
            {
                System.out.printf("Your BMI is %.0f", BMI);
                System.out.println("\nClassification: Normal.");
                System.out.println("\nComputer advice:\nCongratulation, you're finally normal.");
            } 
            else if (BMI > 24 && BMI < 31) // if else statement condition, if BMI value is more than 24 and less than 31, then print out the overweight classification message.
            {
                System.out.printf("Your BMI is %.0f", BMI);
                System.out.println("\nClassification: Overweight!");
                System.out.println("\nComputer advice:\nCongratulation, you earned a honorary title 'Fatso'.");
            } 
            else // if else statement condition, if BMI value is more than 31, then print out the obese classification message.
            {
                System.out.printf("Your BMI is %.0f", BMI);
                System.out.println("\nClassification: Obese!!");
                System.out.println("\nComputer advice:\nYou're a monster!! I don't know what you've become..");
            }
        }
        scan.close(); // close the Scanner class to avoid resource leak warning.
    }
}