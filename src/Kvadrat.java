import java.util.Scanner;

public class Kvadrat
{
    Scanner sc = new Scanner(System.in);
    
    //Metode til at printe en kvadrat
    public void kvadratPrinter(int tal)
    {
        //Anmoder om symbol der skal printes
        System.out.println("Vælg et symbol til print:");
        String symbol = sc.nextLine();
        System.out.println();
        
        //Kører loop det antal gange der er angivet i metode kaldet
        for (int i=0; i<tal; i++)
        {
            for (int j=0; j<tal; j++)
            {
                System.out.print(symbol + "  ");
            }
            System.out.println();
        }
    }
}
