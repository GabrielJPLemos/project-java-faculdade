package com.java.project.faculdade;


public class Professor extends Humano{
	
	//FAZER CHAMADA
	//CADASTRAR PROVA
	
	
	private String idProf;
	private String turno;
	private String materiaDeEspecializacao;
	private String senha;
	
	public Professor () {
		
	}
	
	public Professor(String nome, int idade, long cpf, String idProf, String turno, String materiaDeEspecializacao, String senha) {
		super(nome, idade, cpf);
		this.idProf = idProf;
		this.turno = turno;
		this.materiaDeEspecializacao = materiaDeEspecializacao;
		this.senha = senha;
		
	}
	

	public String getIdProf() {
		return idProf;
	}

	public void setIdProf(String idProf) {
		this.idProf = idProf;
	}
	
	public String getTurno() {
		return turno;
	}
	
	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getMateriaDeEspecializacao() {
		return materiaDeEspecializacao;
	}

	public void setMateriaDeEspecializacao(String materiaDeEspecializacao) {
		this.materiaDeEspecializacao = materiaDeEspecializacao;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
