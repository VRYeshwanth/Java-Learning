public class Recursion_Sorted
{
    public static boolean checkSorted(int arr[], int i)
    {
        if(i == arr.length-1)
            return true;
        
        if(arr[i] < arr[i+1])
            return checkSorted(arr, i+1);
        else
            return false;
    }
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6,8,8};
        System.out.println(checkSorted(arr, 0));
    }
}