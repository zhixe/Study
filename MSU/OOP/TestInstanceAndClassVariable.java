package MSU.OOP;

public class TestInstanceAndClassVariable 
{
    public static void main(String[] arg)
    {
        Box box_A = new Box(7.0,8.0,9.0," blue");
        System.out.println("Box A");
        printBox(box_A);

        Box box_B = new Box(3.0,4.0,5.0," white");
        System.out.println("Box B");
        printBox(box_B);
    }

    public static void printBox(Box b)
    {
        System.out.println("The volume of the box" + b.computeVolume());
        System.out.println("The color of the box" + b.color);
    }
}

class Box
{
    double width = 5, height = 5;
    static double depth = 5;
    String color = "white";

    Box(double w, double h, double d, String s)
    {
        width = w;
        height = h;
        depth = d;
        color =s;
    }

    public Box()
    { }

    public double computeVolume()
    {
        return (width * height * depth);
    }
}