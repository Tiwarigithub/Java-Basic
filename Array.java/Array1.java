import java.util.*;
public class Array1{

public static void main(String args[])
{
    float sum = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    float marks [] = new float[size];
    for(int i =0;i<size;i++)
    {
        System.out.print("Enter the elements in the array: ");
        marks[i] = sc.nextFloat();
    }
    for(float element: marks)
    {
        sum = sum + element;
    }
        System.out.print("The sum of marks is:"+sum);
    

}
}