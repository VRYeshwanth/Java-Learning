import java.util.HashSet;

public class Subsequences
{
    //This function finds subsequences in the following way
    //For each character in the string, it decides whether to add the string or not, which fnds all the possible subsets
    public static void findAllSubsequences(String str, int i, String nstr, HashSet<String> set)
    {
        if(i == str.length())
        {
            if(set.contains(nstr))
                return;
            else
            {
                set.add(nstr);
                System.out.println(nstr);
                return;
            }
        }
        char current = str.charAt(i);

        //This call adds the character to the new string
        findAllSubsequences(str, i+1, nstr+current, set);

        //This call doesn't add the character to the new string
        findAllSubsequences(str, i+1, nstr, set);
    }
    public static void main(String args[])
    {
        HashSet<String> set = new HashSet<>();
        String str = "hello";
        findAllSubsequences(str, 0, "", set);
    }
}