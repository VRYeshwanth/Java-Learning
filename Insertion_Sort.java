public class Insertion_Sort
{
    public static void main(String args[])
    {
        int arr[] = {1,4,2,7,89,707,84,37,987,969};

        System.out.println("Array before Insertion Sort :- ");
        for(int num : arr)
            System.out.print(num+ " ");
        System.out.println();

        for(int i = 1; i < arr.length; i++)
        {
            int current = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > current)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }

        System.out.println("Array after Insertion Sort :- ");
        for(int num : arr)
            System.out.print(num+ " ");
    }
}