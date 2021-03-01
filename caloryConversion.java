import java.util.Scanner;

public class caloryConversion
{
    public static void main(String[] args) 
    {
        System.out.println("This program will calculate the number of "
                + "230 calorie candy bars to eat to maintain your weight");
        
        Scanner input = new Scanner(System.in);
        System.out.print("\t"+"[Q1] What is your First name?\n");
        String fName=input.next();
        
        System.out.print("\t"+"[Q2] What is your last name?\n");
        String lName=input.next();
        //
        System.out.print("\t"+"[Q3] What is your age in years?\n");
        double age = input.nextDouble();
        if(age<1||age>125){
            System.out.println(lName+" "+fName+ "You have entred an invalid entry for age!\n");
            System.exit(0);
            System.out.println("Program has ended");
        }
        //
        System.out.print("\t"+"[Q4] What is your total height in cm?\n");
        double height = input.nextDouble();
        if(height<1||height>300){
            System.out.println(lName+" "+fName+ "You have entered an invalid entry for height!\n");
            System.exit(0);
            System.out.println("Program has ended");
        }
        //
        System.out.print("\t"+"[Q5] What is your weight in kg?\n");
        double weight = input.nextDouble();
        if(weight<1||weight>1400){
            System.out.println(lName+" "+fName+ "You have entered an invalid entry for weight!\n");
            System.exit(0);
            System.out.println("Program has ended");

        }
        //
        System.out.print("\t"+"[Q6] Are you a Male or Female?\n");
        String gender = input.next(); 
        
        if (!gender.equalsIgnoreCase("female")&&!gender.equalsIgnoreCase("male")){
            System.out.println("You have enetered an invalid entry for gender ");
            System.exit(0);
        }
        String lowerGender= gender.toLowerCase();
        System.out.print("\t"+"[Q7] What is your Activity Level? "
                + "\n" + "A. Sedentary (Little or no exercise) "
                + "\n" + "B. Moderate (excercise occasionally) "
                + "\n" + "C. Vigorous (excersize 3-4 days per week) "
                + "\n" + "D. Extreme (exercize every day");
        //
        System.out.print("\n"+"\t"+"Enter Sedentary, Moderate, Vigorous, or Extreme:");
        
        String activity = input.next();
        String lowerActivity= activity.toLowerCase();
        if (!activity.equalsIgnoreCase("sedentary")
                &&!activity.equalsIgnoreCase("medrate")
                &&!activity.equalsIgnoreCase("vigorous")
                &&!activity.equalsIgnoreCase("extreme")) {
            System.out.println("You have enetered an invalid entry for activity");
            System.exit(0);
        }
        
        
        double BMRF = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
        double BMRM = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);

        switch (lowerGender) {
            case "female":
                switch (lowerActivity) {
                    case "sedentary":
                        double newBMRF1 = ((BMRF * .20) + BMRF) / 230;
                        System.out.println(lName+" "+fName+"With these measurements you should eat"
                                + " " + newBMRF1 + " " + "candy bars per day to maintain the same weight");
                        break;
                    case "moderate":
                        double newBMRF2 = ((BMRF * .30) + BMRF) / 230;
                        System.out.println(lName+" "+fName+"With these measurements you should eat"
                                + " " + newBMRF2 + " " + "candy bars per day to maintain the same weight");
                        break;
                    case "vigorous":
                        double newBMRF3 = ((BMRF * .40) + BMRF) / 230;
                        System.out.println(lName+" "+fName+"With these measurements you should eat"
                                + " " + newBMRF3 + " " + "candy bars per day to maintain the same weight");
                        break;
                    case "extreme":
                        double newBMRF4 = ((BMRF * .50) + BMRF) / 230;
                        System.out.println(lName+" "+fName+"With these measurements you should eat"
                                + " " + newBMRF4 + " " + "candy bars per day to maintain the same weight");
                        break;
                }
                break;
            case "male":
                switch (activity) {
                    case "sedentary":
                        double newBMRM1 = ((BMRM * .20) + BMRM) / 230;
                        System.out.println(lName+" "+fName+"With these measurements you should eat"
                                + " " + newBMRM1 + " " + "candy bars per day to maintain the same weight");
                        break;
                    case "moderate":
                        double newBMRM2 = ((BMRM * .30) + BMRM) / 230;
                        System.out.println(lName+" "+fName+"With these measurements you should eat"
                                + " " + newBMRM2 + " " + "candy bars per day to maintain the same weight");
                        break;
                    case "vigorous":
                        double newBMRM3 = ((BMRM * .40) + BMRM) / 230;
                        System.out.println(lName+" "+fName+"With these measurements you should eat"
                                + " " + newBMRM3 + " " + "candy bars per day to maintain the same weight");
                        break;
                    case "extreme":
                        double newBMRM4 = ((BMRM * .50) + BMRM) / 230;
                        System.out.println(lName+" "+fName+"With these measurements you should eat"
                                + " " + newBMRM4 + " " + "candy bars per day to maintain the same weight");
                        break;
                }System.out.println("\n"+"program ended");
            

                break;
        }
        input.close();
    }
}




