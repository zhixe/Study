package MSU.OOP.Assignment2.classes;
import java.util.Scanner;

public class primeNumClass 
{
    public void PrimeNumber()
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Type any integer value to find the prime number[s]:");
        int n = scan.nextInt();

        scan.close();

        int i =0;
        int num =0;
        String primeNumbers = "";
        
        for (i = 1; i <= n; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                counter = counter + 1;
                }
            }
            if (counter ==2)
            {
            primeNumbers = primeNumbers + i + " ";
            }
        }

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("The prime numbers 1 to " + n + ":");
        System.out.println(primeNumbers);
    }
}
