package MSU.OOP.Assignment2.classes; // Set current working directory.
import java.util.Scanner; // Import Scanner class from java utils.

public class bmiClass // Construct bmiClass class for OOP A2 Question 2
{
    public void bmi_class() // 1. Declare a method to classify the BMI category.
    {
        double BMI = bmi_cal(); // Define BMI as double data type and declare it as bmi_cal() method.

        System.out.print("\033[H\033[2J"); // Navigate the cursor to the terminal screen.
        System.out.flush(); // Clear the terminal screen.

        // BMI classification logics run here:
        if(BMI > 0) // When BMI condition matched the value 0 and above, then proceed with the nested if else statement.
        {
            if(BMI > 15 && BMI < 20) // When BMI condition matched the value in range between 16 to 19, then print out the 'Underweight' result in integer format.
            {
                System.out.printf("Your BMI is %.0f, Underweight.", BMI);
            }
            else if(BMI > 19 && BMI < 25) // When BMI condition matched the value in range between 20 to 24, then print out the 'Normal' result in integer format.
            {
                System.out.printf("Your BMI is %.0f, Normal.", BMI);
            }
            else if(BMI > 24 && BMI < 30) // When BMI condition matched the value in range between 25 to 29, then print out the 'Overweight' result in integer format.
            {
                System.out.printf("Your BMI is %.0f, Overweight.", BMI);
            }
            else if(BMI > 29) // When BMI condition matched the value 30 and above, then print out the 'Obese' result in integer format.
            {
                System.out.printf("Your BMI is %.0f, Obese.", BMI);
            }
            else // When BMI condition didn't matched any of the value in condition, then print out the error result in integer format.
            {
                System.out.printf("Your BMI is %.0f", BMI);
                System.out.println("\n\nERROR: Your BMI is off chart!\nPlease provide the valid input!!");
            }  
        }
    }

    private static double bmi_cal() // 2. Declare a method to calculate the BMI.
    {
        Scanner scan = new Scanner(System.in); // Assign scan as a Scanner class variable and instantiate a new object to a Scanner class constructor which initializes the new object with parameter of System.in.

        System.out.print("\033[H\033[2J"); // Navigate the cursor to the terminal screen.
        System.out.flush(); // Clear the terminal screen.
        System.out.println("What is your weight in kg?"); // Print out the first instruction to the user.
        double weight = scan.nextDouble(); // Store the input given by the user from scan variable as a variable weight and define it as double data type.

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("What is your height in cm?"); // Print out the second instruction to the user.
        double height = scan.nextDouble(); 

        double inBMI = weight/((height/100)*(height/100)); // Define inBMI as double data type and declare it as a variable. Then use variables 'height' and 'weight' to calculate the BMI value of the user.

        scan.close(); // Close the Scanner class to avoid resource leak warning.

        return inBMI; // Return inBMI value to bmi_cal() method.
    }
}




