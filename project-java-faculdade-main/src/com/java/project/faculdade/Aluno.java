package com.java.project.faculdade;

import java.util.ArrayList;

public class Aluno  extends Humano{
	
	private String senha;
	private String idMatricula;
	private boolean matriculaAtiva;
	private String  curso;
	private ArrayList<Boleto> boleto;
	private int falta;
	private double notaProva;
	
	
	
	// ESCOLHER MATÉRIAS PARA ESTUDO (SOMENTE SE A MATÉRIA EXISTIR NO BANCO DA FACULDADE)
	// PAGAR FATURA / MENSALIDADE (SÓ PODERÁ PAGAR A DO MÊS ATUAL CASO A ÚLTIMA ESTEJA EM DIA)
	// FECHAR MATRÍCULA (SOMENTE SE A MENSALIDADE ESTIVER EM DIA E SOMENTE O ALUNO PODERÁ FECHAR A MATRÍCULA)
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, int idade, long cpf, String senha,  String idMatricula, boolean matriculaAtiva) {
		super(nome, idade, cpf);
		this.senha = senha;
		this.idMatricula = idMatricula;
		this.matriculaAtiva = matriculaAtiva;
		
	}
	public Aluno(String nome, int idade, long cpf, String senha,  String idMatricula, String curso, boolean matriculaAtiva) {
		super(nome, idade, cpf);
		this.senha = senha;
		this.idMatricula = idMatricula;
		this.curso = curso;
		this.matriculaAtiva = matriculaAtiva;
		
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	
	public String getIdMatricula() {
		return idMatricula;
	}
	
	public void setIdMatricula(String idMatricula) {
		this.idMatricula = idMatricula;
	}

	public boolean isMatriculaAtiva() {
		return matriculaAtiva;
	}

	public void setMatriculaAtiva(boolean matriculaAtiva) {
		this.matriculaAtiva = matriculaAtiva;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public ArrayList<Boleto> getBoleto() {
		return boleto;
	}

	public void setBoletos(ArrayList<Boleto> boleto) {
		this.boleto = boleto;
	}

	public int getfalta() {
		return falta;
	}

	public void setfalta(int falta) {
		this.falta = falta;
	}

	public double getNotaProva() {
		return notaProva;
	}

	public void setNotaProva(double notaProva) {
		this.notaProva = notaProva;
	}
}
