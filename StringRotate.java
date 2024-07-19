import java.util.Scanner;

public class StringRotate
{
    public static void rotateString(String str, int num)
    {
        int len = str.length();
        String leftStr, rightStr;
        String left1,left2,right1,right2;

        left1 = str.substring(0,num);
        left2 = str.substring(num);
        leftStr = left2 + left1;

        right1 = str.substring(len - num);
        right2 = str.substring(0, len - num);
        rightStr = right1 + right2;

        System.out.println("String after "+num+ " left rotations :- ");
        System.out.println(leftStr);
        System.out.println("String after "+num+ " right rotations :- ");
        System.out.println(rightStr);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = sc.nextLine();
        System.out.println("Enter the number of rotations : ");
        int n = sc.nextInt();
        rotateString(word, n);
        sc.close();
    }
}