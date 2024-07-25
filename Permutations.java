import java.util.Scanner;

public class Permutations
{
    public static void printPermutations(String str, String perm, int i)
    {
        if(str.length() == 0)
        {
            System.out.println(perm);
            return;
        }
        for(i = 0; i < str.length(); i++)
        {
            char current = str.charAt(i);
            String rem_part = str.substring(0, i) + str.substring(i+1);

            printPermutations(rem_part, perm+current, i+1);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = sc.next();
        System.out.println();
        printPermutations(word, "", 0);
        sc.close();
    }
}