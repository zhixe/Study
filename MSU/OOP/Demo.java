package MSU.OOP;

public class Demo 
{
    public static void main(String[] args)
    {
        Customer oneCust = new Customer(124,123.4);
        preferredCust p = new preferredCust(125, 3456.7, 0.15);
        oneCust.display();
        p.display();
    }
}
