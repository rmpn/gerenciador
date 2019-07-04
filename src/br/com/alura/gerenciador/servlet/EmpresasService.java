package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

@WebServlet("/empresas")
public class EmpresasService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Empresa> empresas = new Banco().getEmpresas();
		String valor = request.getHeader("Accept");
		String resposta=null;
		String app=null;
		
		if (valor.contains("xml")) {
			
			System.out.println("xml");
			//
			XStream xstream = new XStream();
			xstream.alias("empresa", Empresa.class);
			resposta = xstream.toXML(empresas);
			app="application/xml";
			response.setContentType("application/xml");
			response.getWriter().print(resposta);
			
			
		} else if(valor.endsWith("json")) {

			System.out.println("json");
			//
			Gson gson = new Gson();
			resposta = gson.toJson(empresas);
			app = "application/json";
			response.setContentType("application/json");
			response.getWriter().print(resposta);
			

		} else {
			
			response.setContentType("application/json");
			response.getWriter().print("{'message':'no content'}");
		}

//		response.setContentType(app);
//		response.getWriter().print(resposta);
	}

}
