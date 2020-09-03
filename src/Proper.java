public class Proper
{
    public String ændreString(String brugerString)
    {
        String formattedString="";
        String[] ord = brugerString.split(" ");

        for(String s : ord)
        {
            if(s.toUpperCase().equals(s))
            {
                formattedString = formattedString + s + " ";

                continue;
            }
            if(s.length()>3)
            {
                formattedString = formattedString + s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase()+ " ";

            }
            else
            {
                formattedString = formattedString + s.toLowerCase() + " ";
            }
        }

        return formattedString;

    }

}
