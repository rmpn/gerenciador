package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class NovaEmpresaForm implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		return "forward:formNovaEmpresa.jsp";
	}
	
}
