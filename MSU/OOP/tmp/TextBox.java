package MSU.OOP.tmp;

public class TextBox
{
    public static void main(String[] args)
    {
        Box box_A = new Box(7,8,9,"blue");
        printBox(box_A);
        colorBox(box_A,"black");
        printBox(box_A);
    }

    public static void colorBox(Box b, String s)
    {
        b.color = s;
    }

    public static void printBox(Box b)
    {
        System.out.println("The volume of the box " + b.computeVolume());
        System.out.println("The color of the box " + b.color);
    }
}

