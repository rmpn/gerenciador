package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class ListaEmpresas {
	
//
//    if(paramAcao.equals("ListaEmpresas")) {
//        System.out.println("listando empresas");
//    } else if(paramAcao.equals("RemoveEmpresa")) {
//        System.out.println("removendo empresa");
//    } else if(paramAcao.equals("MostraEmpresa")) {
//        System.out.println("mostrando dados da empresa");
//    }
    
    
	public void executa(HttpServletRequest request, HttpServletResponse response) {
		Banco banco = new Banco();
        List<Empresa> lista = banco.getEmpresas();

        request.setAttribute("empresas", lista);

        RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas.jsp");
        try {
			rd.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
