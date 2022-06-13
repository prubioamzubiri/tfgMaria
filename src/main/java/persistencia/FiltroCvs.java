package persistencia;

import java.util.ArrayList;

public class FiltroCvs {


    public static ArrayList<String[]> filtro (ArrayList<String[]> datos, int campo, String filtro)
    {
        
        ArrayList<String[]> toReturn = new ArrayList<String[]>();

        for (String[] i: datos) {

            if(i[campo].contains(filtro))
            {
                toReturn.add(i);
            }

            
        }

        return toReturn;

    }


    
}
