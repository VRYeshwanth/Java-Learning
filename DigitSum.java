import java.util.Scanner;

public class DigitSum
{
    public static int Sum(String n, int i)
    {
        if(i == n.length())
            return 0;
        char ch = n.charAt(i);
        return (ch-'0') + Sum(n, i+1);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number = ");
        String num = sc.next();
        sc.close();
        System.out.println(Sum(num, 0));
    }
}