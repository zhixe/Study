package MSU.OOP;

public class TestCopyWitharrayCopy 
{
    public static void main(String[] args)
    {
        int[] sourceArray = {100,200,550,230,800};
        int[] targetArray = new int[sourceArray.length];

        System.out.print("\nSourceArray:");
        printArray(sourceArray);
        System.out.print("\nTargetArray:");
        printArray(targetArray);

        System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
        System.out.print("\nSourceArray:");
        printArray(sourceArray);
        System.out.print("\nTargetArray:");
        printArray(targetArray);      
    }

    static void printArray(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        System.out.print(" "+a[i]);
    }
}
