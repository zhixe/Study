package MSU.OOP.Assignment1;

public class Box 
{
    double width = 5, height = 5, depth = 5;
    public String color = "white";

    public Box(double w, double h, double d, String s)
    {
        this.width = w;
        this.height = h;
        this.depth = d;
        this.color = s;
    }

    Box(){ }

    public double computeVolume()
    {
        return(width * height * depth);
    }
}