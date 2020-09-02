import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sortering
{
    //Opretter Scanner objekt
    Scanner sc = new Scanner(System.in);
    //Opretter ArrayList objekt
    ArrayList<String> al = new ArrayList<>();
    
    public void sorterOrd()
    {
        //Modtager brugerinput og gemmer ord i ArrayList
        System.out.println("Indtast første ord:");
        String ord1 = sc.nextLine();
        al.add(ord1);
        System.out.println("Indtast andet ord:");
        String ord2 = sc.nextLine();
        al.add(ord2);
        System.out.println("Indtast tredje ord:");
        String ord3 = sc.nextLine();
        al.add(ord3);
        System.out.println("Indtast fjerde ord:");
        String ord4 = sc.nextLine();
        al.add(ord4);
        System.out.println("Indtast femte ord:");
        String ord5 = sc.nextLine();
        al.add(ord5);
        
        //Sortere ArrayList og vender den så den starter modsat "abc"
        al.sort(Collections.reverseOrder());
        
        //Printer den nu sorterede ArrayList
        System.out.println(al);
    }
}
