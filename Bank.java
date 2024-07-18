import java.util.Scanner;

class Account
{
    String accName;
    double amount;

    public Account(String accName, double amount)
    {
        this.accName = accName;
        this.amount = amount;
    }

    public void display()
    {
        System.out.println("Name = " +this.accName);
        System.out.println("Amount = " +this.amount);
    }

    public void withdraw(double amt)
    {
        if (amt < amount)
        {
            this.amount -= amt;
            System.out.println(amt+ " withdrawed");
        }
        else
            System.out.println("Insufficient Funds");
    }
}

public class Bank
{
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our bank");
        System.out.print("How many accounts do you want to open : ");
        int n = sc.nextInt();
        System.out.println("----------------------------");
        sc.nextLine();
        Account accounts[] = new Account[n];

        String name="";
        double amt = 0;
        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter the name for Account ("+(i+1)+") : ");
            name = sc.nextLine();
            System.out.println("Enter the amount in the account : ");
            amt = sc.nextDouble();
            sc.nextLine();
            accounts[i] = new Account(name, amt);
            System.out.println("----------------------------");
        }
        System.out.println("Account Details :- ");
        System.out.println("---------------------------------------------");
        for(Account acc: accounts)
        {
            acc.display();
            System.out.println("----------------------------");
        }
        System.out.println("---------------------------------------------");
    }
}
