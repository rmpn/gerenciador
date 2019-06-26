package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)  throws IOException, ServletException {

		 System.out.println("Cadastrando nova empresa");
		 
		    String nomeEmpresa = request.getParameter("nome");
		    String paramDataEmpresa = request.getParameter("data");
		    Date dataAbertura=null;
		    
		    try {
		    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				dataAbertura = sdf.parse(paramDataEmpresa);
			} catch (ParseException e) {
			
				e.printStackTrace();
				throw new ServletException(e);
			}
		    
		    Empresa empresa = new Empresa();
		    empresa.setNome(nomeEmpresa);
		    empresa.setDataAbertura(dataAbertura);
		    
		    Banco banco = new Banco();
		   
		    banco.adiciona(empresa);
		    
		   
		    
//	        PrintWriter out = response.getWriter();
//	        out.println("<html><body>Empresa "+nomeEmpresa + " cadastrada com sucesso!</body></html>");
	
		    //chamar o JSP
		    
		    
		    //RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresaCriada.jsp");
//		    RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas");
//		    request.setAttribute("empresa", empresa.getNome());
//	        request.setAttribute("dataAbertura", empresa.getDataAbertura());
//		    rd.forward(request, response); 
		    response.sendRedirect("listaEmpresas");
	}
	
	


}
