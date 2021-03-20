package MSU.OOP;

public class Customer 
{
    public class Customer
    {
        int id;
        double balanceOwed;

        public Customer(int ID, double b, double rate)
        {
            id = ID;
            balanceOwed = b;
        }

        public void display()
        {
            System.out.println("Customer" + id + balanceOwed);
        }
    }
}
