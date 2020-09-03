import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Opgave 1: ArrayList (StringFound)
        //Opretter ArrayList af String og tilføjer elementer
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Rasmus");
        arr.add("Tobias");
        //Oprette objekt af klasse og kalder metoden på objektet
        StringFound sf = new StringFound();
        sf.doesArraylistContainString(arr, "Rasmus");
        
        //Opgave 2: Bog/Bibliotek
        //Opretter ArrayList af String og tilføjer elementer
        ArrayList<Bog> arr2 = new ArrayList<>();
        arr2.add(new Bog(1234567, "B1", 2020));
        arr2.add(new Bog(1234568, "B2", 2020));
        arr2.add(new Bog(1234569, "B3", 2020));
        //Oprette objekt af klasse og kalder metoderne på objektet samt printer ArrayList
        Bibliotek bib = new Bibliotek();
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
        //Vi opretter et objekt af klassen Proper
        Proper p = new Proper();
        //Vi gemmer bruger input i en String
        String userInput = sc.nextLine();
        //Vi kalder metoden
        p.ændreString(userInput);
        //Vi printer den ændrede String
        System.out.println(p.ændreString(userInput));

        //Opgave 6: Sortering
        //Opretter et objekt af Sortering klassen
        Sortering s = new Sortering();
    
        //Kalder sorterOrd metoden
        s.sorterOrd();
        
        //Opgave 7: Søgning
        //Opretter String Array og elementer
        String[] stringArray = {"Abe", "Bil", "Ko", "Glad"};
        //Opretter objekt af Søgning klassen
        Søgning søg = new Søgning();
        //Kalder søgningIArray metoden på objektet
        søg.søgningIArray(stringArray, "Abe");
    }
    
    
}