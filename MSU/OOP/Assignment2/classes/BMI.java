package MSU.OOP.Assignment2.classes;

import java.util.Scanner;

public class BMI 
{
    private static final int BMI = 0;

    public static double bmi_cal()
    {
        Scanner scan = new Scanner(System.in);

        // get height value from user
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("What is your total height in cm?\n");
        double height = scan.nextDouble();

        // get weight value from user
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("What is your total weight in kg?\n");
        double weight = scan.nextDouble();

        double heightIn = height; // assign heightIn as double floating variable and set the value to height variable.
        double weightIn = weight; // assign weightIn as double floating variable and set the value to weight variable.
        double BMI = weightIn/((heightIn/100)*(heightIn/100)); // assign BMI as double floating variable and set the value to formula: "weightIn / [(heightIn / 100) * (heightIn / 100)]", to calculate the value of Body Mass Index (BMI).

        scan.close();
        return BMI;
    }

    public static void bmi_class()
    {
        
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
    }

    public static void main(String[] args)
    {

    }
}
