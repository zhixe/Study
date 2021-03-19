package MSU.OOP.Assignment2.classes;
import java.util.Scanner;

public class strClass 
{
    public void Str_class()
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Input the string: ");
        String str = scan.nextLine();

        if(isNumeric(str)) 
        {
            System.out.print("\033[H\033[2J"); 
            System.out.flush();
            System.out.println("Dude, you have entered an invalid character for string!\nPlease type any character and try again!!"); // print out the error message to the user.
            System.out.println("Program has ended.."); // print out the program termination message to the user.
            System.exit(0); // exit the program.
        }

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Number of Vowel[s] in the word: " + countVow(str));
        System.out.println("Number of Consonant[s] in the word: " + countCon(str));

        scan.close(); // Close the Scanner class to avoid resource leak warning.
    }

    public static int countVow(String str)
    {
        str = str.toLowerCase();
        int count1 = 0;

        for(int a = 0; a < str.length(); a++)
        { 
            if
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
        return count1;
    }

    public static int countCon(String str)
    {
        str = str.toLowerCase();
        int count2 = 0;

        for(int b = 0; b < str.length(); b++)
        {            
            if
            (
                (
                    str.charAt(b) != 'a' &&
                    str.charAt(b) != 'e' &&
                    str.charAt(b) != 'i' &&
                    str.charAt(b) != 'o' && 
                    str.charAt(b) != 'z'
                )
            ) 
            {
                count2++;
            }
        }
        return count2;
    }

    public static boolean isNumeric(String string) 
    {  
        System.out.println(String.format("Parsing string: \"%s\"", string));
            
        if(string == null || string.equals("")) 
        {
            System.out.println("String or words cannot be parsed, it is null or empty.");
            return false;
        }
        
        try 
        {
            int intValue = Integer.parseInt(string);
            return true;
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("String or words cannot be parsed to Integer.");
        }
        return false;
    }

}
