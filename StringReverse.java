import java.util.Scanner;

public class StringReverse
{
    public static String reverse(String str)
    {
        if(str.length() == 0)
            return "";

        String end_char = str.substring(str.length()-1);
        String rem_part = str.substring(0,str.length()-1);

        return end_char + reverse(rem_part);
    }
    
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
        String reverse = reverse(word);
        System.out.println("Reverse = "+reverse);
        sc.close();
    }
}