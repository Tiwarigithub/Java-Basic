import java.util.*;
public class multiArray{
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the rows of multiarray: ");
    int rows = sc.nextInt();
    System.out.print("Enter the cols of multiarray: ");
    int cols = sc.nextInt();

    int number [][] = new int[rows][cols];
    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<cols;j++)
        {
            System.out.print("Enter the elements in the array: ");
            number[i][j]=sc.nextInt();
        }
    }
     for(int i=0;i<rows;i++)
    {
        for(int j=0;j<cols;j++)
        {
            System.out.print(number[i][j]+ " ");
        }
        System.out.println();
    }

    

}
}