import java.util.Scanner;

public class Græs
{
    //Opretter scanner objekt for at tage brugerinput
    Scanner sc = new Scanner(System.in);
    
    //Metode der beregner dage til græsset skal slås
    public void beregnGræs()
    {
        //Lokale værdier der bruges til at gemme brugerinput
        double nuværende;
        double max;
        
        //Printer til bruger og gemmer brugerinput i lokal variabel
        System.out.println("Hvad er nuværende græs lægde?");
        nuværende = sc.nextDouble();
        System.out.println("\nHvor højt skal græsset være inden klipning?");
        max = sc.nextDouble();
        
        //Variabel til at tælle antal dage
        int count = 0;
        
        //Bergener antal fage til græsset skal slås
        for (double i=nuværende+0.8; i<=max; i=i+0.8)
        {
            count++;
            //System.out.println(i); // TEST
        }
        
        //Printer antal dage til græsset skal slås
        System.out.println("\nDu skal klippe dit græs om " + count + " dage.");
    }
}
