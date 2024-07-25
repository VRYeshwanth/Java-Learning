public class Selection_Sort
{
    public static void main(String args[])
    {
        int arr[] = {1,4,2,7,89,707,84,37,987,969};
        System.out.println("\nArray before selection sort :- ");
        for(int num : arr)
            System.out.print(num+ " ");
        System.out.println();

        for(int i = 0; i < arr.length-1; i++)
        {
            int small = i;
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[small] > arr[j])
                    small = j;
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Array after selection sort :- ");
        for(int num : arr)
            System.out.print(num+ " ");
    }
}