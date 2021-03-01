package MSU.Assignment1.classes;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class FahrenhietToCelsius {
    public static void main(String[] Strings) throws InterruptedException 
    {
        System.out.print("\033[H\033[2J");
        System.out.flush(); 

        Scanner scan = new Scanner(System.in);
        System.out.println("Type any value of degree in Fahrenheit: ");

        double fahrenheit = scan.nextDouble();
        double fahrenheit3 = fahrenheit;
        double celsius = (( 5 *(fahrenheit - 32.0)) / 9.0);
        double normal = (98.6); //unit in degrees of Fahrenheit

        String fahrenheit2 = String.format("%.0f", fahrenheit);
        String celsius2 = String.format("%.02f", celsius);

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(fahrenheit2 + " degree of Fahrenheit is equivalent to " + celsius2 + " in Celsius");
        TimeUnit.SECONDS.sleep(6);

        System.out.print("\033[H\033[2J");
        System.out.flush();
        if (fahrenheit3 > normal)
        {
            System.out.println("Therefore, " + fahrenheit3 + " degree of Fahrenheit is above the human body temperature " + normal + " degree of Fahrenheit!");
        } else if (fahrenheit3 < normal)
        {
            System.out.println("Therefore, " + fahrenheit3 + " degree of Fahrenheit is below the human body temperature " + normal + " degree of Fahrenheit!"); 
        } else
        {
            System.out.println("Therefore, " + fahrenheit3 + " degree of Fahrenheit is matching with the human body temperature " + normal + " degree of Fahrenheit."); 
        }

        scan.close();  
    }
}

