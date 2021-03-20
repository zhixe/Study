package MSU.OOP.Assignment2; // Set current working directory.
import MSU.OOP.Assignment2.classes.calculateClass; // Import calculateClass class from local directory.

public class Q_01 // Construct java main class for OOP A2 Question 1
{
    public static void Q1() throws InterruptedException       
    {
        calculateClass mainCalNum = new calculateClass(); // Assign mainCalNum as a calculateClass class variable and instantiate a new object to a calculateClass class constructor which initializes the new object.
        mainCalNum.calNumbers(); // Call the class method calNumbers() from mainCalNum variable. This will run the whole process of calculateClass class.
    }
}