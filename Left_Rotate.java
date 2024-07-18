import java.util.Scanner;
public class Left_Rotate
{
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements : ");
        int n = 0;
        try {
            n = sc.nextInt();
        }
        catch(Exception e){
            System.out.println(e);
        }
        int arr[] = new int[n];
        System.out.println("Enter "+n+" numbers : ");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("How many rotations : ");
        int rotations = sc.nextInt();

        int[] rotatedArray = rotateLeft(arr, rotations);
        
        System.out.println("Array before rotations:- ");
        for(int i : arr)
            System.out.print(i+ " ");
        System.out.println();
        System.out.println("Array after "+rotations+ " left rotations :- ");
        for(int i : rotatedArray)
            System.out.print(i+ " ");
    }

    public static int[] rotateLeft(int[] a, int rot)
    {
        int len = a.length;
        int[] temp = new int[len];

        for(int i = 0; i < len; i++)
            temp[i] = a[i];

        int[] rotated = new int[len];
        rot %= len;
        while(rot > 0)
        {
            for(int i = 1; i <= len; i++)
            {
                if (i == len)
                    rotated[i-1] = temp[0];
                else
                    rotated[i-1] = temp[i];
            }
            
            for(int i = 0; i < len; i++)
                temp[i] = rotated[i];
            
            rot--;
        }
        temp = a;
        return rotated;
    }
}