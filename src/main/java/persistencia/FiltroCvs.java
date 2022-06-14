package persistencia;

import java.util.ArrayList;
import java.util.List;

public class FiltroCvs {


    public static ArrayList<String[]> filtro (List<String[]> datos, int campo, String filtro)
    {
        
        ArrayList<String[]> toReturn = new ArrayList<String[]>();

        for (String[] i: datos) {


            if(i[campo].contains(filtro))
            {
                toReturn.add(i);
            }

            
        }

        System.out.println(toReturn.size());

        return toReturn;

    }


    
}
