package MSU.OOP.Assignment2; // Set current working directory.
import MSU.OOP.Assignment2.classes.evodClass; // Import enoNumber class from local directory.

public class Q_03 // Construct java main class for OOP A2 Question 3
{
    public static void main(String[] args) // Compile and execute the java program.        
    {
        evodClass mainENO = new evodClass(); // Assign mainENO as a enoNumber class variable and instantiate a new object to a enoNumber class constructor which initializes the new object.
        mainENO.EvOdNumber(); // Call the class method EvOdNumber() from mainENO variable. This will run the whole process of enoNumber class.
    }
}