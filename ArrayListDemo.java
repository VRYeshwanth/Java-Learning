import java.util.ArrayList;

public class ArrayListDemo
{
    public static void printArrayList(ArrayList<Integer> num)
    {
        for(int i : num)
            System.out.print(i+ " ");
        System.out.println();
    }
    public static void main(String args[])
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 10; i++)
            numbers.add(i+1);
        printArrayList(numbers);
        System.out.println("Initial Size of ArrayList = "+numbers.size());
        System.out.println("Adding 10 more numbers :- ");
        for(int i = 0; i < 10; i++)
            numbers.add(i+11);
        printArrayList(numbers);
        System.out.println("Size of ArrayList after adding 10 numbers = "+numbers.size());
        System.out.println("Replacing 5 with 50 from the ArrayList");
        numbers.set(4, 50);
        printArrayList(numbers);
        System.out.println("Removing 11 from the ArrayList");
        numbers.remove(10);
        printArrayList(numbers);
    }
}