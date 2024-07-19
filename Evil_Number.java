/*
 * This program checks if an input number is an evil number.
 * An Evil number is one whih has even number of 1's in it's binary form
 * Ex: 15 is Evil as 15 = 1111 has 4 1's
 * 16 is not Evil as 16 = 10000 has 1 one
 */

import java.util.Scanner;
public class Evil_Number
{
    public static String convertToBinary(long n)
    {
        String rem = "";
        String rev = "";
        while(n > 0)
        {
            long r =  n % 2;
            rem += r;
            n /= 2;
        }
        
        for(int i = 0; i < rem.length(); i++)
        {
            char ch = rem.charAt(i);
            rev = ch + rev;
        }
        return rev;
    }

    public static void checkEvil(long number)
    {
        //Converts String into long type
        long binNum = Long.parseLong(convertToBinary(number));

        int count = 0;
        while(binNum > 0)
        {
            if (binNum % 10 == 1)
            {
                count++;
                binNum /= 10;
            }
            else
                binNum /= 10;
        }

        System.out.println((count % 2 == 0)? number+ " is an Evil Number" : number+ " is not an Evil number");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        long num = sc.nextLong();
        sc.close();
        checkEvil(num);
    }
}