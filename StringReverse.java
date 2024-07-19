import java.util.Scanner;

public class StringReverse
{
    public static String reverseString(String str)
    {
        String rev = "";
        int len = str.length();

        for(int i = 0; i < len; i++)
        {
            char ch = str.charAt(i);
            rev = ch + rev;
        }
        return rev;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = sc.nextLine();
        String reverse = reverseString(word);
        System.out.println("Reverse = "+reverse);
        sc.close();
    }
}