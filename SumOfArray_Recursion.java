public class SumOfArray_Recursion
{
    public static void printArrayElements(int arr[], int startIndex)
    {
        if(startIndex == arr.length)
            return;
        System.out.print(arr[startIndex]+ " ");
        printArrayElements(arr, startIndex+1);
    }
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        printArrayElements(arr, 0);
    }
}