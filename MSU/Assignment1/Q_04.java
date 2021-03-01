package MSU.Assignment1;

import java.util.concurrent.TimeUnit;
import MSU.Assignment1.classes.Admission;

public class Q_04 {
   public static void main(String[] args) throws InterruptedException 
   {
      System.out.print("\033[H\033[2J");
      System.out.flush();

      System.out.println("[OOP ASSIGNMENT 1]: QUESTION 4\n\nWelcome my friend..\nThis cheap program will calculate your college's admission status.");
      TimeUnit.SECONDS.sleep(6);

      // Call Admission class
      Admission.main(args);
   }
}

