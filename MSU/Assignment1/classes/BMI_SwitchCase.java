package MSU.Assignment1.classes;

import java.util.Scanner;

public class BMI_SwitchCase {
        public static void main(String[] args) throws InterruptedException 
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();      

        Scanner scan = new Scanner(System.in);
        System.out.print("What is your total height in cm?\n");
        double height = scan.nextDouble();
        if(height<1||height>250){
            System.out.print("\033[H\033[2J");
            System.out.flush(); 
            System.out.println("Dude, you have entered an invalid value for height!");
            System.out.println("Program has ended..");
            System.exit(0);
        }
        
        System.out.print("\033[H\033[2J");
        System.out.flush();      

        System.out.print("What is your total weight in kg?\n");
        double weight = scan.nextDouble();
        if(weight<1||weight>500){
            System.out.print("\033[H\033[2J");
            System.out.flush(); 
            System.out.println("Dude, you have entered an invalid entry for weight!");
            System.out.println("Program has ended..");
            System.exit(0);
        }
        
        double heightIn = height;
        double weightIn = weight;
        double BMI = weightIn/((heightIn/100)*(heightIn/100));

        System.out.print("\033[H\033[2J");
        System.out.flush();      
          
        if (BMI > 0)
        {
            if (BMI < 16) 
            {
                System.out.printf("Your BMI is %.0f", BMI);
                System.out.println("\n\nERROR: Your BMI is off chart!\nPlease provide the valid input!!");
            }  
            else if (BMI > 15 && BMI < 20) 
            {
                System.out.printf("Your BMI is %.0f", BMI);
                System.out.printf("\nClassification: Underweight!");
                System.out.println("\nComputer advice:\nYou should start calling yourself 'stick'.");
            } 
            else if (BMI > 19 && BMI < 25) 
            {
                System.out.printf("Your BMI is %.0f", BMI);
                System.out.println("\nClassification: Normal.");
                System.out.println("\nComputer advice:\nCongratulation, you're finally normal.");
            } 
            else if (BMI > 24 && BMI < 31) 
            {
                System.out.printf("Your BMI is %.0f", BMI);
                System.out.println("\nClassification: Overweight!");
                System.out.println("\nComputer advice:\nCongratulation, you earned a honorary title 'Fatso'.");
            } 
            else 
            {
                System.out.printf("Your BMI is %.0f", BMI);
                System.out.println("\nClassification: Obese!!");
                System.out.println("\nComputer advice:\nYou're a monster!! I don't know what you've become..");
            }
        }
        scan.close();
    }
}
