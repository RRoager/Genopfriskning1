public class Proper
{
    public String ændreString(String brugerString)
    {
        //Tom lokal variable til den kommende formaterede String
        String formattedString="";
        //Laver String Array og splitter vores bruger String op ved mellemrum
        String[] ord = brugerString.split(" ");
        //For each løkke som kører igennem Array
        for(String s : ord)
        {
            //Den opdelte bruger stregen bliver tvunget til uppercase
            //Hvis en del af stregen var uppercase i forvejen, forbliver den uppercase ved udskrift
            if(s.toUpperCase().equals(s))
            {
                formattedString = formattedString + s + " ";

                continue;
            }
            //Hvis en eller flere dele af stregen er større end 3 benyttes dette if statement
            //Alle stregen større end 3 får uppercase på index 0
            if(s.length()>3)
            {
                formattedString = formattedString + s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase()+ " ";

            }
            //Hvis strengen er 3 eller mindre, bliver alle index være lowercase
            else
            {
                formattedString = formattedString + s.toLowerCase() + " ";
            }
        }
        //Returnere den nye formatterede streg
        return formattedString;
    }
}
