public class TowerOfHanoi
{
    public static void Move(int n, String src, String dest, String helper)
    {
        if(n == 1)
        {
            System.out.println("Moved 1 from "+src+ " to "+dest);
            return;
        }

        //Move n-1 disks from source to the helper rod by using destination rod as the helper rod
        Move(n-1, src, helper, dest);

        //After that , move the n'th disk from source to destination as it is the only one left after moving the other disks
        System.out.println("Moved " +n+ " from "+src+ " to "+dest);

        //Then , move those n-1 disks from the helper rod to the destination rod by using the source rod as the helper rod
        Move(n-1, helper, dest, src);
    }
    public static void main(String args[])
    {
        int n = 10;
        Move(n,"A","C","B");
    }
}