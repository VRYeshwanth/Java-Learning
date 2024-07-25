import java.util.Scanner;

public class Palindrome extends StringReverse
{
    //This code checks for palindromes by checking the first and last characters of the string. After that , it takes a substring of the string which does not contain the initial first and last characters and checks them again untill only one character is left, at which point it returns true
    public static boolean isPalindrome(String str)
    {
        if(str.length() <= 1)
            return true;
        
        if(str.charAt(0) != str.charAt(str.length()-1))
            return false;

        return isPalindrome(str.substring(1,str.length()-1));
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = sc.nextLine();
        sc.close();
        boolean ans = isPalindrome(word);
        if(ans)
            System.out.println(word+ " is a palindrome");
        else
            System.out.println(word+ " is a palindrome");
        // String rev = reverseString(word);

        // if (word.equals(rev))
        //     System.out.println("It is a palindrome");
        // else
        //     System.out.println("It is not a palindrome");
    }
}