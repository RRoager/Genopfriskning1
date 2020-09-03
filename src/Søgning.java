import java.util.Arrays;

public class Søgning
{
    //Methode til at finde String i Array
    public int søgningIArray(String[] stringArray, String str)
    {
        //Try/Catch til at fange exception ArrayOutOfBounds
        try
        {
            //Lokal variable der gemmer index pladsen
            int index =  0;
            //For loop der kører Arrayet igennem og melder hvis den finder et match
            for (int i = 0; i<=stringArray.length; i++)
            {
                if (stringArray[i].equals(str))
                {
                    System.out.println("Strengen findes på index: " + i);
                    break;
                }
            }
        }
        //Vi catcher exception hvis ikke String findes på listen
        catch (Exception e)
        {
            System.out.println("Strengen findes ikke");
        }
        return -1;
    }
}
