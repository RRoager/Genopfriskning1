import java.util.ArrayList;

public class Bibliotek
{
    
    public boolean findesBogen(ArrayList<Bog> arr2, int isbn)
    {
        for (Bog bogen : arr2)
        {
            if (bogen.getIsbn() == isbn)
            {
                System.out.println("Bogen er allerede en del af biblioteket.");
                return true;
            }
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