public class Bubble_Sort
{
    public static void main(String args[])
    {
        int a[] = {1,4,2,7,89,707,84,37,987,969};
        System.out.println("Array before bubble sort :- ");
        for(int num : a)
            System.out.print(num+ " ");
        System.out.println();
        for(int i = 0; i < a.length-1; i++)
        {
            for(int j = 0; j < a.length-i-1; j++)
            {
                if(a[j] > a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("Array after bubble sort :- ");
        for(int num : a)
            System.out.print(num+ " ");
    }
}