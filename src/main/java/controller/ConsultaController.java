package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.opencsv.exceptions.CsvValidationException;

import persistencia.FiltroCvs;
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

            //RequestDispatcher rd = request.getRequestDispatcher("respuesta.jsp");

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
		
        int numcampos = Integer.parseInt(request.getParameter("numcampos"));

        List<String[]> valores = gbd.getDatos();

        List<String> headers = gbd.getHeaders();

        for(int i = 0; i < numcampos; i++)
        {

            String campo = "Campo" + i, respuesta = "respuesta" + i;

            String head = request.getParameter(campo);
            String res = request.getParameter(respuesta);

            int index = headers.indexOf(campo);

            valores = FiltroCvs.filtro(valores, index, res);

        }

        float percent = valores.size()/ gbd.getNumeroDatos();

        request.setAttribute("headers", headers);
        request.setAttribute("valores", valores);
        request.setAttribute("numactual", valores.size());
        request.setAttribute("percent", percent);
        request.setAttribute("numinicial", gbd.getNumeroDatos());
        
        RequestDispatcher rd = request.getRequestDispatcher("respuesta.jsp");

        rd.forward(request, response);

	}
    
}

