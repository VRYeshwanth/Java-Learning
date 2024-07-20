import java.util.Scanner;

public class Bit_Manipulation
{
    public static void getBit(int n, int pos)
    {
        int bitMask = 1 << pos;
        int res = bitMask & n;
        if (res == 0)
            System.out.println("The bit at position "+pos+ " is 0");
        else
            System.out.println("The bit at position "+pos+ " is 1");
    }
    public static void setBit(int n, int pos)
    {
        int bitMask = 1 << pos;
        int res = bitMask | n;
        System.out.println("After setting bit at position "+pos+ ", "+n+" becomes "+res);
    }
    public static void clearBit(int n, int pos)
    {
        int bitMask = 1 << pos;
        int newBitMask = ~bitMask;
        int res = newBitMask & n;

        System.out.println("After clearing bit at position "+pos+ ", "+n+" becomes "+res);
    }
    public static void updateBit(int n, int pos, int value)
    {
        if(value == 1)
        {
            int bitMask = 1 << pos;
            int res = bitMask | n;
            System.out.println("After updating bit at position "+pos+ ", "+n+" becomes "+res);
        }
        else if(value == 0)
        {
            int bitMask = 1 << pos;
            int newBitMask = ~bitMask;
            int res = newBitMask & n;

            System.out.println("After updating bit at position "+pos+ ", "+n+" becomes "+res);
        }
        else
        {
            System.out.println("Invalid value");
            System.exit(0);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("\n1) Get Bit");
        System.out.println("2) Set Bit");
        System.out.println("3) Clear Bit");
        System.out.println("4) Update Bit");
        int ch = sc.nextInt();
        int p;
        switch (ch) {
            case 1:
                System.out.println("Enter the position : ");
                p = sc.nextInt();
                getBit(n, p);
                break;
            case 2:
                System.out.println("Enter the position : ");
                p = sc.nextInt();
                setBit(n, p);
                break;
            case 3:
                System.out.println("Enter the position : ");
                p = sc.nextInt();
                clearBit(n, p);
                break;
            case 4:
                System.out.println("Enter the position : ");
                p = sc.nextInt();
                System.out.println("Enter the value to be updated : ");
                int val = sc.nextInt();
                updateBit(n, p, val);
                break;

            default:
                break;
        }
        sc.close();
    }
}