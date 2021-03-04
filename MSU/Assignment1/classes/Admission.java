package MSU.Assignment1.classes;
import java.util.Scanner;

public class Admission {
    public void ifNested()
    // public static void main(String[] ifNested) throws InterruptedException
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your grade point average (0.00-4.00):");
        double gpa = scan.nextDouble();
 
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Input your test score (0-100):");
        int test = scan.nextInt();
 
        System.out.print("\033[H\033[2J");
        System.out.flush();
 
        if(gpa < 0.00 || gpa > 4.00)
        {
            if(test > 100 || test < 0)
            {
                System.out.println("GPA: " + gpa);
                System.out.println("Test score: " + test);
                System.out.println("\nERROR: Invalid value!");
                System.out.println("GPA value must be in range 0.00 to 4.00");
                System.out.println("Test score must be an integer value within range 0 to 100");
            }
            else if(test > -1 && test < 101)
            {
                System.out.println("GPA: " + gpa);
                System.out.println("Test score: " + test);
                System.out.println("\nERROR: Invalid value!");
                System.out.println("GPA value must be in range 0.00 to 4.00");
            }
        }
        else if(gpa >= 3.00 && gpa <= 4.00)
        {
            if(test >= 60 && test <= 100)
            {
                System.out.println("GPA: " + gpa);
                System.out.println("Test score: " + test);
                System.out.println("Status: Accept");
            }
            else
            {
                System.out.println("GPA: " + gpa);
                System.out.println("Test score: " + test);
                System.out.println("Status: Reject");
            }
        }
        else if(gpa < 3.00 && gpa >= 0.00)
        {
            if(test >= 80 && test <= 100)
            {
                System.out.println("GPA: " + gpa);
                System.out.println("Test score: " + test);
                System.out.println("Status: Accept");
            }
            else
            {
                System.out.println("GPA: " + gpa);
                System.out.println("Test score: " + test);
                System.out.println("Status: Reject");
            }
        }
       scan.close();
    }
}

