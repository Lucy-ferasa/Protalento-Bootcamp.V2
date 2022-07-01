package practicasemana15.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import practicasemana15.Formulario;
import practicasemana15.repository.RepositoryMap;

@WebServlet("/FormularioServlet")
public class FormularioServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
		String nombre = req.getParameter("nombre");
		String apellido = req.getParameter("apellido");
		String documento = req.getParameter("documento");
		String edad = req.getParameter("edad");
		String ocupacion = req.getParameter("ocupacion");
		String fechaNacimientoStr = req.getParameter("fechaNacimiento");
		
		List<String> requestValues = Arrays.asList(nombre,apellido,documento,edad,ocupacion,fechaNacimientoStr);
		int camposVacios = 0;
		String camposVaciosStr = "";
		
		int a = 0;
		for(String value:requestValues) {
			if(value.trim().isEmpty()) {
				camposVacios++;
				camposVaciosStr+=(a + " ");
			}
			a++;
		}
		
String target = "/practicasemana15/success.jsp";
		
		
		if(camposVacios > 0) {
			target = "/practicasemana15/error.jsp";
			
			req.setAttribute("camposVacios", camposVaciosStr);
		} else {
			
			String[] fechaArray = fechaNacimientoStr.split("-");
			String fecha = fechaArray[2]+"/"+fechaArray[1]+"/"+fechaArray[0];
			
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			Date fechaNacimiento = null;
			try {
				fechaNacimiento = format.parse(fecha);
			} catch (ParseException e) {
				e.printStackTrace();
			}

			Formulario form = new Formulario(nombre,apellido,Long.parseLong(documento),Integer.parseInt(edad),ocupacion,fechaNacimiento);
			RepositoryMap.addFormulario(form);
			
			req.setAttribute("formulario", form);
		
		}

		getServletContext().getRequestDispatcher(target).forward(req,resp);
	}
		
}
