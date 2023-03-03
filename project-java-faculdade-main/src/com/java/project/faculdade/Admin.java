package com.java.project.faculdade;

public class Admin extends Humano{
	
	// CADASTRAR ALUNOS 
	// CADASTRAR / EXCLUIR PROFESSORES (SOMENTE SE HOUVER MATÉRIA DISPONÍVEL PARA AQUELE PROFESSOR)
	// CADASTRAR / EXCLUIR MATÉRIAS (EXCLUIR SOMENTE SE NÃO HOUVER UM PROFESSOR DESIGNADO A AQUELA MATÉRIA)
	
	
	private final String login = "admin";
	private final String senha = "admin123";
	private Faculdade faculdade;
	

	public Admin () {
		
	}
	
	public Admin (String nome, int idade, int cpf) {
		super(nome, idade, cpf);
	}
	
	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

	public Faculdade getFaculdade() {
		return faculdade;
	}

	public void setFaculdade(Faculdade faculdade) {
		this.faculdade = faculdade;
	}
}
