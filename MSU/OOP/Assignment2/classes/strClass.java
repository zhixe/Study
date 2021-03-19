package MSU.OOP.Assignment2.classes; // Set current working directory.
import java.util.Scanner; // Import Scanner class from java utils.
import java.util.regex.Pattern; // Import Pattern class from java utils.regex.

public class strClass // Construct strClass class for OOP A2 Question 4
{
    public void Str_class() // 1. Declare a method to print out the result of count number of vowel[s] and consonant[s].
    {
        Scanner scan = new Scanner(System.in); // Assign scan as a Scanner class variable and instantiate a new object to a Scanner class constructor which initializes the new object with parameter of System.in.
        
        System.out.print("\033[H\033[2J"); // Navigate the cursor to the terminal screen.
        System.out.flush(); // Clear the terminal screen.
        System.out.println("Type any words or a character to find the number of vowel[s] or consonant[s]:"); // Print out the instruction to the user.
        String str = scan.nextLine(); // Store the input given by the user from scan variable as a variable str and define it as string data type.

        if(isNumeric(str)) // When isNumeric(str) method found any integer value from the user's input, then print out the error message and terminate the program.
        {
            System.out.print("\033[H\033[2J"); 
            System.out.flush();
            System.out.println("Dude, you have entered an invalid character for string!\nPlease type any character and try again!!"); // Print out the error message to the user.
            System.out.println("Program has ended.."); // Print out the program termination message to the user.
            System.exit(0); // exit the program.
        }

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(str + "\n\nNumber of Vowel[s] in the word: " + countVow(str)); // Print out the result of vowel[s] count.
        System.out.println("Number of Consonant[s] in the word: " + countCon(str)); // Print out the result of consonant[s] count.

        scan.close(); // Close the Scanner class to avoid resource leak warning.
    }

    public static int countVow(String str) // 2. Declare a method to count number of vowel[s].
    {
        str = str.toLowerCase(); // Set str to lowercase character.
        int count1 = 0; // Define count1 as integer data type and set it to 0.

        for(int a = 0; a < str.length(); a++) // When a is set to 0 as integer data type, and less than str.length() length, then a is increased.
        { 
            if // When the condition matched with the vowels character, then count1 is increased.
            (
                str.charAt(a) == 'a' || 
                str.charAt(a) == 'e' || 
                str.charAt(a) == 'i' || 
                str.charAt(a) == 'o' || 
                str.charAt(a) == 'u'
            ) 
            { 
                count1++; 
            } 
        }
        return count1; // Return count1 value to countVow() method.
    }

    public static int countCon(String str) // 3. Declare a method to count number of consonant[s].
    {
        str = str.toLowerCase(); // Set str to lowercase character.
        int count2 = 0; // Define count2 as integer data type and set it to 0

        for(int b = 0; b < str.length(); b++) // When b is set to 0 as integer data type, and less than str.length(), then b is increased.
        {            
            if // When the condition matched with the consonants character, then count2 is increased.
            (
                str.charAt(b) == 'b' ||
                str.charAt(b) == 'c' ||
                str.charAt(b) == 'd' ||
                str.charAt(b) == 'f' ||
                str.charAt(b) == 'g' ||
                str.charAt(b) == 'h' ||
                str.charAt(b) == 'j' ||
                str.charAt(b) == 'k' ||
                str.charAt(b) == 'l' ||
                str.charAt(b) == 'm' ||
                str.charAt(b) == 'n' ||
                str.charAt(b) == 'p' ||
                str.charAt(b) == 'q' ||
                str.charAt(b) == 'r' ||
                str.charAt(b) == 's' ||
                str.charAt(b) == 't' ||
                str.charAt(b) == 'v' ||
                str.charAt(b) == 'w' ||
                str.charAt(b) == 'x' ||
                str.charAt(b) == 'y' ||
                str.charAt(b) == 'z'  
            ) 
            {
                count2++;
            }
        }
        return count2; // Return count2 value to countCon() method.
    }

    public static boolean isNumeric(String checkStr) // 4. Declare a method to check whether if the input from the user is an integer or not.
    {
        String regex = "[0-9]+[\\.]?[0-9]*"; // Define regex as a String data type and set it to integer value range 0-9 patten. 
        return Pattern.matches(regex, checkStr); // Return integer pattern to isNumeric() method.
    }
}