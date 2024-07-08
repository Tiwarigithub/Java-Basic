import java.util.*;
class selectionsort{
public static void printArray(int arr[]){
    for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]+" ");
    }
}

    public static void main(String args[]){
     int arr[] = {6,3,8,9,2,5,17,11};
        for(int i=0;i<arr.length-1;i++){
        int smallest = i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[smallest]>arr[j]){
                smallest = j;
            }

        }
        int temp = arr[smallest];
        arr[smallest] = arr[i];
        arr[i] = temp;
    }
    printArray(arr);
}
}
