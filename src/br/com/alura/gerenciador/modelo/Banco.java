package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	
	
	static {
		
        Empresa empresa = new Empresa("Alura");
        //empresa.setNome("Alura");
        System.out.println(empresa.getId() + " " + empresa.getDataAbertura());
        
        lista.add(empresa);
        //empresa.setDataAbertura(new Date(System.currentTimeMillis()));
        
        Empresa empresa2 = new Empresa("Caelum");
        //empresa2.setNome("Caelum");
        //empresa2.setDataAbertura(new Date(System.currentTimeMillis()));
        
        System.out.println(empresa2.getId() + " " +empresa2.getDataAbertura());
        
       
        lista.add(empresa2);
	}
	
	public void removeEmpresa(Integer id) { 

	    Iterator<Empresa> it = lista.iterator();

	    while(it.hasNext()) { 
	        Empresa emp = it.next();

	        if(emp.getId() == id ) {
	            it.remove();
	        }
	    }
	}
	
	public void removeEmpresaLista(Integer id) { 
	    for (Empresa empresa: lista) { 
	        if(empresa.getId() == id ) {
	            lista.remove(empresa);
	        }
	    }
	} 

	public Empresa buscarEmpresaPeloId(Integer id) { 
	    for (Empresa empresa: lista) { 
	        if(empresa.getId() == id ) {
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

}
