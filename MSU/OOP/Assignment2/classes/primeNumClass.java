package MSU.OOP.Assignment2.classes; // Set current working directory.
import java.util.Scanner; // Import Scanner class from java utils.

public class primeNumClass // Construct evodClass class for OOP A2 Question 5
{
    public void PrimeNumber() // Declare a method to find the prime number[s].
    {
        Scanner scan = new Scanner(System.in); // Assign scan as a Scanner class variable and instantiate a new object to a Scanner class constructor which initializes the new object with parameter of System.in.

        System.out.print("\033[H\033[2J"); // Navigate the cursor to the terminal screen.
        System.out.flush(); // Clear the terminal screen.

        System.out.println("Type any integer value to find the prime number[s]:"); // Print out the instruction to the user.
        int num = scan.nextInt(); // Store the input given by the user from scan variable as a variable num and define it as integer data type.

        scan.close();

        int totalNum = 0; // Define totalNum as integer data type and set it to 0.
        String result = ""; // Define result as string data type and set it to empty string.
        
        for (int i = 1; i <= num; i++) // When i is set to 1 as integer data type, and equal or less than num variable, then i is increased.
        {
            int counter = 0; // Define counter as integer data type and set it to 0.
            for(totalNum = i; totalNum >= 1; totalNum--) // When totalNum is set to i variable, and equal or more than 1 value, then totalNum is decreased.
            {
                if(i % totalNum == 0) // When the remainder of i is totalNum variable and equal to 0, then counter variable added 1 value.
                {
                counter = counter + 1;
                }
            }
            if (counter == 2) // When counter variable is equal to 2 value, then result variable added i variable value and concatenate with whitespace string.
            {
                result = result + i + " ";
            }
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        System.out.println("The prime numbers 1 to " + num + ":");
        System.out.println(result); // Print out the prime number result.
    }
}