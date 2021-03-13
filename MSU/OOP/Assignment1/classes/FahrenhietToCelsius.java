package MSU.OOP.Assignment1.classes; // set current directory.
import java.util.Scanner; // import scanner class from java utils.
import java.util.concurrent.TimeUnit; // import timeunit class from java utils concurrent.
public class FahrenhietToCelsius 
{
    // throws InterruptedException if thread is interrupted, then clear the interrupted status and execute the process. This operation is used for TimeUnit class.
    public void fahcel() throws InterruptedException 
    {
        System.out.print("\033[H\033[2J"); // moves the cursor at the top left corner of the screen or console and clears the screen from the cursor to the end of the screen.
        System.out.flush(); // flush out the previous console screen. 

        Scanner scan = new Scanner(System.in); // assign scan as Scanner class variable and construct a new Scanner which allows user to read value from the input stream source such as System.in class.
        System.out.println("Type any value of degree in Fahrenheit: "); // print out the main instruction to the user.

        double fahrenheit = scan.nextDouble(); // assign fahrenheit as double floating variable and set the entry to scan variable in nextDouble() method of Scanner class.
        double fahrenheit3 = fahrenheit; // assign fahrenheit3 as double floating variable and set the value to fahrenheit variable.
        double celsius = (( 5 *(fahrenheit - 32.0)) / 9.0); // assign celsius as double floating variable and set the value to formula: "(5 * (fahrenheit - 32.0)) / 9.0", to convert fahrenheit SI unit to celsius SI unit.
        double normal = (98.6); // assign normal as double floating variable and set the value to 98.6, the normal human body temperature in degrees of Fahrenheit.

        String fahrenheit2 = String.format("%.0f", fahrenheit); // assign fahrenheit2 as String class variable and construct String in format() method of String class to %.0f of fahrenheit source.
        String celsius2 = String.format("%.02f", celsius); // assign celsius2 as String class variable and construct String in format() method of String class to %.02f of celsius source.

        System.out.print("\033[H\033[2J"); // moves the cursor at the top left corner of the screen or console and clears the screen from the cursor to the end of the screen.
        System.out.flush(); // flush out the previous console screen.
        System.out.println(fahrenheit2 + " degree of Fahrenheit is equivalent to " + celsius2 + " in degree of Celsius");
        TimeUnit.SECONDS.sleep(6);

        System.out.print("\033[H\033[2J"); // moves the cursor at the top left corner of the screen or console and clears the screen from the cursor to the end of the screen.
        System.out.flush(); // flush out the previous console screen.
        if (fahrenheit3 > normal) // if else statement condition.
        {
            System.out.println("Therefore, " + fahrenheit3 + " degree of Fahrenheit is above the human body temperature, " + normal + " degree of Fahrenheit!"); // print out the statement and the output display if the fahrenheit3 temperature is above the normal temperature.
        } 
        else if (fahrenheit3 < normal) // if else statement condition.
        {
            System.out.println("Therefore, " + fahrenheit3 + " degree of Fahrenheit is below the human body temperature, " + normal + " degree of Fahrenheit!"); // print out the statement and output display if the fahrenheit3 temperature is below the normal temperature.
        } 
        else // if else statement condition.
        {
            System.out.println("Therefore, " + fahrenheit3 + " degree of Fahrenheit is matching with the human body temperature, " + normal + " degree of Fahrenheit."); // print out the statement and output display if the fahrenheit3 temperature is below the normal temperature.
        }
        scan.close(); // close the Scanner class to avoid resource leak warning.
    }
}

