import java.util.*;

public class StringFound
{
    public boolean doesArraylistContainString(ArrayList<String> arr, String str)
    {
        //Tjekker om ArrayList indeholder str og printer hvis dette er tilfældet
        if(arr.contains(str))
        {
            System.out.println("The String has been found");
            return true;
        }
        //Hvis ArrayList ikke indholder, tilføjes str til ArrayList og bekræftelse printes
        else
        {
            arr.add(str);
            System.out.println("String has been added");
            System.out.println(arr);
        }
        return false;
    }
}