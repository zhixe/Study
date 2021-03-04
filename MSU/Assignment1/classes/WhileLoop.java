package MSU.Assignment1.classes;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WhileLoop {
    // "throws InterruptedException" if thread is interrupted, then clear the interrupted status and execute the process. This operation was used when using the TimeUnit class. 
    public static void main(String[] args) throws InterruptedException 

    {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner scan = new Scanner(System.in);
        displayInstructions();
        int value;

        while((value = scan.nextInt()) != 0)
        {
            if(value == 4) 
            {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Program ends..");
                TimeUnit.SECONDS.sleep(2);
                System.exit(0);
            }
            else if(value > 0 && value < 4)
            {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Good job dude!");
                displayInstructions();
            } 
            else 
            {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Dude, wrong integer! Try again..");
                displayInstructions();
            }
        }
        scan.close();
    }

    private static String displayInstructions()
    {
        System.out.println("Type any integer value 1,2,3 or 4");
        return null;
    }
}

