package MSU.OOP.Assignment1; // set current directory
import java.util.Scanner; // import scanner class from java utils
import java.util.concurrent.TimeUnit; // import timeunit class from java utils concurrent
import MSU.OOP.Assignment1.classes.Admission_NestedIf; // import Admission class from local directory
import MSU.OOP.Assignment1.classes.Admission_SwitchCase; // import Admission_SwitchCase class from local directory

public class Q_04 {
   public static void Q4() throws InterruptedException 
   {
      System.out.print("\033[H\033[2J"); // moves the cursor at the top left corner of the screen or console and clears the screen from the cursor to the end of the screen.
      System.out.flush(); // flush out the previous console screen.
      Scanner scan = new Scanner(System.in);
      System.out.println("[OOP ASSIGNMENT 1]: QUESTION 4\n");
      System.out.print("Choose type of program to run:\n");
      System.out.print("[1] Nested If Statement\n");
      System.out.print("[2] Switch Case Statement\n");
      System.out.print("[3] Exit Cheap App\n");
      int inputMain = scan.nextInt();

      switch 
      (
         (inputMain == 1) ? 1 :
         (inputMain == 2) ? 2 :
         (inputMain == 3) ? 3 : 3
      )
      {
         case 1:
         Admission_NestedIf first = new Admission_NestedIf(); // assign first to BMI class as the new operator instantiates the BMI method
         System.out.print("\033[H\033[2J"); // moves the cursor at the top left corner of the screen or console and clears the screen from the cursor to the end of the screen.
         System.out.flush(); // flush out the previous console screen.
         System.out.println("[OOP ASSIGNMENT 1]: QUESTION 4 - Nested If Statement\n\nWelcome my friend..\nThis cheap program will calculate your college's admission status."); // print out the main display for Nested If Statement.
         TimeUnit.SECONDS.sleep(4); // set the console to sleep for 4 seconds.
         first.ifNested(); // invoke variable of first and execute the ifNested method from BMI class.
         TimeUnit.SECONDS.sleep(3); // set the console to sleep for 3 seconds.
         break;

         case 2:
            Admission_SwitchCase second = new Admission_SwitchCase(); // assign second to BMI_SwitchCase class as the new operator instantiates the BMI_SwitchCase method
            System.out.print("\033[H\033[2J"); // moves the cursor at the top left corner of the screen or console and clears the screen from the cursor to the end of the screen.
            System.out.flush(); // flush out the previous console screen.
            System.out.println("[OOP ASSIGNMENT 1]: QUESTION 4 - Switch Case Statement\n\nWelcome my friend..\nThis cheap program will calculate your college's admission status."); // print out the main display for Switch Case Statement.
            TimeUnit.SECONDS.sleep(4); // set the console to sleep for 4 seconds.
            second.switchCase(); // invoke variable of second and execute the switchCase method from BMI_SwitchCase class.
            TimeUnit.SECONDS.sleep(3); // set the console to sleep for 3 seconds.
            break;
            
         case 3:
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Doggo: Goodbye my friend!");
            TimeUnit.SECONDS.sleep(10);
            break; 
      }
   scan.close();      
   }
}

