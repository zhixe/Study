package MSU.Assignment1.classes;
import java.util.Scanner;

public class Admission_SwitchCase {
    public void switchCase()
    // public static void main(String[] switchCase) throws InterruptedException
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
            switch 
            (
                (test > 100 || test < 0) ? 0 :
                (test >= 0 && test <= 10) ? 1 : 1
            )
            {
                case 0:
                    System.out.println("GPA: " + gpa);
                    System.out.println("Test score: " + test);
                    System.out.println("\nERROR: Invalid value!");
                    System.out.println("GPA value must be in range 0.00 to 4.00, and");
                    System.out.println("test score must be an integer value within range 0 to 100");
                    break;
                case 1:
                    System.out.println("GPA: " + gpa);
                    System.out.println("Test score: " + test);
                    System.out.println("\nERROR: Invalid value!");
                    System.out.println("GPA value must be in range 0.00 to 4.00");
                    break;
            }
        }
        else if(gpa > 2.99 && gpa < 4.01)
        {
            switch
            (
                test > 59 && test < 101 ? 2 :
                test < 60 ? 3 : 3
            )
            {
                case 2:
                    System.out.println("GPA: " + gpa);
                    System.out.println("Test score: " + test);
                    System.out.println("Status: Accept");   
                    break;
                case 3:
                    System.out.println("GPA: " + gpa);
                    System.out.println("Test score: " + test);
                    System.out.println("Status: Reject");             
                    break;
            }
        }
        else if(gpa < 3.00 && gpa > 0.00)
        {
            switch
            (
                test > 79 && test < 101 ? 4 :
                test < 80 ? 5 : 5
            )
            {
                case 4:    
                    System.out.println("GPA: " + gpa);
                    System.out.println("Test score: " + test);
                    System.out.println("Status: Accept");
                    break;

                case 5:
                    System.out.println("GPA: " + gpa);
                    System.out.println("Test score: " + test);
                    System.out.println("Status: Reject");
                    break;
            }
        }
       scan.close();
    }
}

