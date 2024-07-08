import java.util.*;
class Insertionsort{
public static void printArray(int arr[]){
    for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]+" ");
    }
}

    public static void main(String args[]){
     int arr[] = {6,3,13,45,5,17,11};

     for(int i=1;i<arr.length;i++)
     {
        int temp = arr[i];
        int j=i-1;

        while(j>=0 && arr[j]>temp)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = temp;
     }
     printArray(arr);
    }
}