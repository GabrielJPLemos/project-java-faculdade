package com.java.project.faculdade;

public class Materia extends Faculdade{
	
	private String nomeMateria;
	private int periodos;
	private double mensalidade;
	private Provas provas;
	
	public Materia () {
		
	}
	
	public Materia(String nomeMateria, int numPeriodos, double mensalidade) {
		this.nomeMateria = nomeMateria;
		this.periodos = numPeriodos;
		this.mensalidade = mensalidade;
	}
	
	public String getNomeMateria() {
		return nomeMateria;
	}
	
	public void setNomeMateria(String nomeMateria) {
		this.nomeMateria = nomeMateria;
	}
	
	public int getPeriodos() {
		return periodos;
	}
	
	public void setPeriodos(int periodos) {
		this.periodos = periodos;
	}
	
	public double getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}
	
	public Provas getProvas() {
		return provas;
	}
	public void setProvas(Provas provas) {
		this.provas = provas;
	}
}
