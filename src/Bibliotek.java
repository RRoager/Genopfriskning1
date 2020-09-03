import java.util.ArrayList;

public class Bibliotek
{
    
    public boolean findesBogen(ArrayList<Bog> arr2, int isbn)
    {
        //For each til at kører gennem ArrayList
        for (Bog bogen : arr2)
        {
            //Hvis ISBN er på ArrayList printet bekræftelse
            if (bogen.getIsbn() == isbn)
            {
                System.out.println("Bogen er allerede en del af biblioteket.");
                return true;
            }
            //Er ISBN ikke på ArrayList tilføjes den og bekræftelse printes
            else
            {
                System.out.println("Bogen var ikke en del af biblioteket og er derfor blevet tilføjet.");
                arr2.add(bogen);
                return false;
            }
        }
        return false;
    }
}