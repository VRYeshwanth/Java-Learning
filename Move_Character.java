public class Move_Character
{
    public static void MoveCharacter(int index, int count , String str, String newStr, char var)
    {
        if(index == str.length())
        {
            for(int i = 0; i < count; i++)
                newStr += var;
            System.out.println(newStr);
            return;
        }

        char current = str.charAt(index);
        if(current == var)
        {
            count++;
            MoveCharacter(index+1, count, str, newStr, var);
        }
        else
        {
            newStr+= current;
            MoveCharacter(index+1, count, str, newStr, var);
        }
    }
    public static void main(String args[])
    {
        //This program moves all character occurrences in a string to the end
        String s = "abcdefxxxbdhxmxmxxxhrxxxjuxxrde";
        MoveCharacter(0,0,s,"",'x');
    }
}