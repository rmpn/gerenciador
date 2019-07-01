package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	private static List<Usuario> listaUsuarios = new ArrayList<>();

	static {

		Empresa empresa0 = new Empresa("Pinto Neto");
		// empresa.setNome("Alura");
		System.out.println(empresa0.getId() + " " + empresa0.getDataAbertura());

		lista.add(empresa0);

		Empresa empresa = new Empresa("Alura");
		// empresa.setNome("Alura");
		System.out.println(empresa.getId() + " " + empresa.getDataAbertura());

		lista.add(empresa);
		// empresa.setDataAbertura(new Date(System.currentTimeMillis()));

		Empresa empresa2 = new Empresa("Caelum");
		// empresa2.setNome("Caelum");
		// empresa2.setDataAbertura(new Date(System.currentTimeMillis()));

		System.out.println(empresa2.getId() + " " + empresa2.getDataAbertura());

		lista.add(empresa2);

		Usuario u1 = new Usuario();
		u1.setLogin("nico");
		u1.setSenha("12345");
		listaUsuarios.add(u1);

		Usuario u2 = new Usuario();
		u2.setLogin("ana");
		u2.setSenha("12345");
		listaUsuarios.add(u2);

	}

	public void removeEmpresa(Integer id) {

		Iterator<Empresa> it = lista.iterator();

		while (it.hasNext()) {
			Empresa emp = it.next();

			if (emp.getId() == id) {
				it.remove();
			}
		}
	}

	public void removeEmpresaLista(Integer id) {
		for (Empresa empresa : lista) {
			if (empresa.getId() == id) {
				lista.remove(empresa);
			}
		}
	}

	public Empresa buscarEmpresaPeloId(Integer id) {
		for (Empresa empresa : lista) {
			if (empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}

	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);
	}

	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}

	public Usuario existeUsuario(String login, String senha) {
        
		for (Usuario usuario : listaUsuarios) {
			
			
			if (usuario.ehIgual(login, senha)) {
                return usuario;
                
			}
		}
		return null;
	}

}
