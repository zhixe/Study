package MSU.OOP.Assignment2.classes; // Set current working directory.
import java.util.Scanner; // Import Scanner class from java utils.

public class bmi_main // Construct BMI main class for Question 2
{
    public void bmi_class() // 1. Declare a method to classify the BMI category.
    {
        double BMI = bmi_cal(); // Define BMI as double data type and declare it as bmi_cal() method.

        System.out.print("\033[H\033[2J"); // Navigate the cursor to the terminal screen.
        System.out.flush(); // Clear the terminal screen.

        // BMI classification logics run here:
        if(BMI > 0)
        {
            if(BMI > 15 && BMI < 20) // When BMI condition matched the value in range between 16 to 19, then print out the 'Underweight' result.
            {
                System.out.println(BMI + ", Underweight.");
            }
            else if(BMI > 19 && BMI < 25) // When BMI condition matched the value in range between 20 to 24, then print out the 'Normal' result.
            {
                System.out.println(BMI + ", Normal.");
            }
            else if(BMI > 24 && BMI < 30) // When BMI condition matched the value in range between 25 to 29, then print out the 'Overweight' result.
            {
                System.out.println(BMI + ", Overweight."); 
            }
            else if(BMI > 29) // When BMI condition matched the value 30 and above, then print out the 'Obese' result.
            {
                System.out.println(BMI + ", Obese.");
            }
        }
    }

    private static double bmi_cal() // 2. Declare a method to calculate the BMI.
    {
        Scanner input = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); 
        System.out.flush(); 
        System.out.println("Please enter your weight:");
        double weight = input.nextDouble();

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Please enter your height:");
        double height = input.nextDouble();

        double inBMI = weight/((height/100)*(height/100));

        input.close();

        return inBMI;
    }
}