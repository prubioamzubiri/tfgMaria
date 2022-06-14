package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.opencsv.exceptions.CsvValidationException;

import persistencia.PersistenciaCvs;

public class CamposController extends HttpServlet{

    PersistenciaCvs gbd;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CamposController() {
        super();

		try {
            gbd = new PersistenciaCvs("/usr/local/tomcat/webapps/datos.csv");
        } catch (CsvValidationException | IOException e) {
            try {
                gbd = new PersistenciaCvs("datos.csv");
            } catch (CsvValidationException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            
        }

    }

    /**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int numcampos = Integer.parseInt(request.getParameter("numcampos"));

        request.setAttribute("numcampos", numcampos);
		
        request.setAttribute("campos", gbd.getHeaders());    
        
        RequestDispatcher rd = request.getRequestDispatcher("campos.jsp");

        rd.forward(request, response);




	}

    



    
}
