package MSU.Assignment1.classes; // set current directory
import java.util.Scanner; // import scanner class from java utils
import java.util.concurrent.TimeUnit; // import timeunit class from java utils concurrent

public class Input123 {
    // "throws InterruptedException" if thread is interrupted, then clear the interrupted status and execute the process. This operation was used when using the TimeUnit class. 
    // public static void main(String[] loop) throws InterruptedException 
    public void loop() throws InterruptedException
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
