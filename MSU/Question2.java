package MSU;
import java.io.PrintStream;


public class Question2
{
    private static PrintStream out = System.out;

    public static void main (String[]args)
    {
        // Flush out the previous console screen
        out.print("\033[H\033[2J");  // "\033[H" It moves the cursor at the top left corner of the screen or console. "\033[2J" It clears the screen from the cursor to the end of the screen.
        out.flush();  

        // Print the input
        out.println ("\nDoggo");
        out.println ("32");
        /* Hello there my friend! Khajit has a little problem..
        You see... Khajit has this Java codes stole from someone else.
        Khajit doesn't know what it means and doesn't care about it.
        But, Khajit wants to know how to execute these Java codes.
        Could you help me please? */
    }
}

