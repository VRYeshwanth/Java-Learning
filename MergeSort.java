import java.util.Scanner;
import java.lang.Math;

public class MergeSort
{
    public static void initailizeArray(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random() * 100);
        }
    }
    public static void printArray(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+ " ");
    }

    public static void divide(int[] arr, int start, int end)
    {
        if(start >= end)
            return;

        int mid = start + (end-start) / 2; // Used instead to start + end / 2 to avoid space complexity issues for large values

        divide(arr, start, mid);
        divide(arr, mid+1, end);

        mergeSort(arr, start, mid, end);
    }
    public static void mergeSort(int[] arr, int start, int mid, int end)
    {
        int merged[] = new int[end - start + 1];

        int index1 = start;
        int index2 = mid+1;
        int i = 0;

        while(index1 <= mid && index2 <= end)
        {
            if(arr[index1] <= arr[index2])
                merged[i++] = arr[index1++];
            else
                merged[i++] = arr[index2++];
        }

        while(index1 <= mid)
            merged[i++] = arr[index1++];
        
        while(index2 <= end)
            merged[i++] = arr[index2++];
        
        for(int j = 0,k=start; j < merged.length; j++,k++)
            arr[k] = merged[j];
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        sc.close();
        initailizeArray(arr);
        System.out.println();
        printArray(arr);
        System.out.println();
        divide(arr, 0, n-1);
        printArray(arr);
    }
}