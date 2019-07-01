package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class AlteraEmpresa implements Acao {

	
	public String  executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramId = request.getParameter("id");
        Integer id = Integer.valueOf(paramId);
        String paramNome = request.getParameter("nome");
        String paramDataEmpresa = request.getParameter("data");
        
	    Date dataAbertura=null;
	    try {
	    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(paramDataEmpresa);
		} catch (ParseException e) {
		
			e.printStackTrace();
			throw new ServletException(e);
		}
	    
        Banco banco = new Banco();

        Empresa empresa = banco.buscarEmpresaPeloId(id);
        empresa.setNome(paramNome);
        empresa.setDataAbertura(dataAbertura);
        
        // response.sendRedirect("entrada?acao=ListaEmpresas");
        return ("redirect:entrada?acao=ListaEmpresas");
		
	}
	}
