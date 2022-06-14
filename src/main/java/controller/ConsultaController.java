package controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.opencsv.exceptions.CsvValidationException;

import persistencia.PersistenciaCvs;

public class ConsultaController extends HttpServlet{


    PersistenciaCvs gbd;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultaController() {
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        try {

            //gbd.insertData();

            //RequestDispatcher rd = request.getRequestDispatcher("conf-datosInsertados.jsp");

            //rd.forward(request, response);
            
        } catch (Exception e) {
            
            //request.setAttribute("message", e.getMessage());

            //RequestDispatcher rd = request.getRequestDispatcher("error-insercion-datos.jsp");

            //rd.forward(request, response);

        }


		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
	}
    
}

