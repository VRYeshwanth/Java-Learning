import java.util.Scanner;
public class Reverse {

    public static void reverseArray(int arr[])
    {
        int len = arr.length;
        for(int i = 0; i < (len / 2); i++)
        {
            int temp = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i - 1] = temp;
        }
        for(int num : arr)
            System.out.println(num);
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("How many values : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" numbers : ");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        reverseArray(arr);
    }
}
