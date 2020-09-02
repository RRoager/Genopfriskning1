import java.util.*;

public class StringFound
{
    public boolean doesArraylistContainString(ArrayList<String> arr, String str)
    {
        if(arr.contains(str))
        {
            System.out.println("The String has been found");
            return true;
        }
        else
        {
            arr.add(str);
            System.out.println("String has been added");
            System.out.println(arr);
        }
        return false;
    }
}