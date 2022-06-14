package persistencia;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import lombok.Data;

@Data
public class PersistenciaCvs {


    private CSVReader cvs;

    private List<String> headers;
    private List<String[]> datos;

    private int numeroDatos;

    public PersistenciaCvs(String archivo) throws CsvValidationException, IOException
    {
        try {
            cvs = new CSVReader(new FileReader(new File(archivo)));

            headers = new ArrayList<String>(Arrays.asList(cvs.readNext()));

            datos = new ArrayList<String[]>();

            String[] respuesta;

            while((respuesta = cvs.readNext())!= null)
            {
                datos.add(respuesta);
            }

            numeroDatos = datos.size();

        } catch (FileNotFoundException e) {
            cvs = new CSVReader(new FileReader(new File("datos.cvs")));

            headers = new ArrayList<String>(Arrays.asList(cvs.readNext()));

            datos = new ArrayList<String[]>();

            String[] respuesta;

            while((respuesta = cvs.readNext())!= null)
            {
                datos.add(respuesta);
            }

            numeroDatos = datos.size();
        }

    }
    
}
