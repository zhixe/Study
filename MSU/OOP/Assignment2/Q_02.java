package MSU.OOP.Assignment2; // Set current working directory.
import MSU.OOP.Assignment2.classes.bmiClass; // Import bmi_main class from local directory.

public class Q_02 // Construct java main class for OOP A2 Question 2
{
    public static void Q2() throws InterruptedException        
    {
        bmiClass mainCal = new bmiClass(); // Assign mainCal as a bmi_main class variable and instantiate a new object to a bmi_main class constructor which initializes the new object.
        mainCal.bmi_class(); // Call the class method bmi_class() from mainCal variable. This will run the whole process of bmiClass class.
    }
}