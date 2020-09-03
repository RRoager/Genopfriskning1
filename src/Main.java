import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Opgave 1: ArrayList (StringFound)
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Rasmus");
        arr.add("Tobias");
        
        StringFound sf = new StringFound();
        
        sf.doesArraylistContainString(arr, "Rasmus");
        
        //Opgave 2: Bog/Bibliotek
        ArrayList<Bog> arr2 = new ArrayList<>();
        Bibliotek bib = new Bibliotek();
        arr2.add(new Bog(1234567, "B1", 2020));
        arr2.add(new Bog(1234568, "B2", 2020));
        arr2.add(new Bog(1234569, "B3", 2020));
        
        bib.findesBogen(arr2,1234567);
        bib.findesBogen(arr2,1234537);
        System.out.println(arr2);
    
        //Opgave 3: Hvor tit skal græsset slås (Græs)
        //Opretter objekt af Græs klassen
        Græs g = new Græs();
    
        //Kalder bergenGræs metoden
        g.beregnGræs();
    
        //Opgave 4: Kvadrat
        //Opretter et objekt af Kvadrat klassen
        Kvadrat k = new Kvadrat();
    
        //Kalder metoden (kvadratets størrelse)
        k.kvadratPrinter(5);

        //Opgave 5: ProperCase
        Proper p = new Proper();
        String userInput = sc.nextLine();
        p.ændreString(userInput);
        System.out.println(p.ændreString(userInput));

        //Opgave 6: Sortering
        //Opretter et objekt af Sortering klassen
        Sortering s = new Sortering();
    
        //Kalder sorterOrd metoden
        s.sorterOrd();
    }
    
    
}