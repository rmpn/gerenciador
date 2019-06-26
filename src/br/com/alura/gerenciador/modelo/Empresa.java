package br.com.alura.gerenciador.modelo;

import java.util.Date;

public class Empresa {

	private static int contador=0;
	private int id;
	private String nome;
	private Date dataAbertura;

	public Empresa() {
		
		this.id = ++Empresa.contador;

	}

	public Empresa(String nome) {

		
		this.id = ++Empresa.contador;
        //
		this.nome = nome;
		this.dataAbertura = new Date();

	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
