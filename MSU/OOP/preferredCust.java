package MSU.OOP;

public class preferredCust extends Customer 
{
    double discountRate;
    public preferredCust(int id, double bal, double Rate)
    {
        super(id, bal);
        discountRate = Rate;
    }

    public void display()
    {
        super.display();
        System.out.println("Discount Rate is " + discountRate);
    }
}
