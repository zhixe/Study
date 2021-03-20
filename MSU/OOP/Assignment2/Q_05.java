package MSU.OOP.Assignment2; // Set current working directory.
import MSU.OOP.Assignment2.classes.primeNumClass; // Import primeNumClass class from local directory.

public class Q_05 // Construct java main class for OOP A2 Question 5
{
    public static void Q5() throws InterruptedException        
    {
        primeNumClass mainPrimeNum = new primeNumClass(); // Assign mainPrimeNum as a primeNumClass class variable and instantiate a new object to a primeNumClass class constructor which initializes the new object.
        mainPrimeNum.PrimeNumber(); // Call the class method PrimeNumber() from mainPrimeNum variable. This will run the whole process of primeNumClass class.
    }
}