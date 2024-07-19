import java.util.Scanner;

public class Palindrome extends StringReverse
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = sc.nextLine();
        sc.close();
        String rev = reverseString(word);

        if (word.equals(rev))
            System.out.println("It is a palindrome");
        else
            System.out.println("It is not a palindrome");
    }
}