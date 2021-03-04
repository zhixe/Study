package MSU.Assignment1;

import java.util.concurrent.TimeUnit;
import MSU.Assignment1.classes.Admission;
import MSU.Assignment1.classes.Admission_SwitchCase;

public class Q_04 {
   public static void Q4() throws InterruptedException 
   {
      // call BMI class -- uses nested if statement.
      Admission first = new Admission(); // assign first to BMI class as the new operator instantiates the BMI method
      System.out.print("\033[H\033[2J"); // moves the cursor at the top left corner of the screen or console and clears the screen from the cursor to the end of the screen.
      System.out.flush(); // flush out the previous console screen.
      System.out.println("[OOP ASSIGNMENT 1]: QUESTION 4 - Nested If Statement\n\nWelcome my friend..\nThis cheap program will calculate your college's admission status."); // print out the main display for Nested If Statement.
      TimeUnit.SECONDS.sleep(4); // set the console to sleep for 4 seconds.
      first.ifNested(); // invoke variable of first and execute the ifNested method from BMI class.
      TimeUnit.SECONDS.sleep(3); // set the console to sleep for 3 seconds.

      // call BMI class -- uses switch case statement.
      Admission_SwitchCase second = new Admission_SwitchCase(); // assign second to BMI_SwitchCase class as the new operator instantiates the BMI_SwitchCase method
      System.out.print("\033[H\033[2J"); // moves the cursor at the top left corner of the screen or console and clears the screen from the cursor to the end of the screen.
      System.out.flush(); // flush out the previous console screen.
      System.out.println("[OOP ASSIGNMENT 1]: QUESTION 4 - Switch Case Statement\n\nWelcome my friend..\nThis cheap program will calculate your college's admission status."); // print out the main display for Switch Case Statement.
      TimeUnit.SECONDS.sleep(4); // set the console to sleep for 4 seconds.
      second.switchCase(); // invoke variable of second and execute the switchCase method from BMI_SwitchCase class.
      TimeUnit.SECONDS.sleep(3); // set the console to sleep for 3 seconds.
   }
}

































// System.out.print("\033[H\033[2J");
// System.out.flush();

// System.out.println("[OOP ASSIGNMENT 1]: QUESTION 4\n\nWelcome my friend..\nThis cheap program will calculate your college's admission status.");
// TimeUnit.SECONDS.sleep(6);

// // Call Admission class
// Admission.main(args);