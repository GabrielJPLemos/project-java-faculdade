package com.java.project.faculdade;


public class Boleto{
	
	private int numBoleto;
	private int diaVencimento;
	private int mesVencimento;
	
	public Boleto() {
		
	}
	
	public Boleto(int numBoleto, int diaVencimento, int mesVencimento) {
		this.setNumBoleto(numBoleto);
		this.setDiaVencimento(diaVencimento);
		this.setMesVencimento(mesVencimento);
	}
	
	
	public int getNumBoleto() {
		return numBoleto;
	}

	public void setNumBoleto(int numBoleto) {
		this.numBoleto = numBoleto;
	}

	public int getDiaVencimento() {
		return diaVencimento;
	}

	public void setDiaVencimento(int diaVencimento) {
		this.diaVencimento = diaVencimento;
	}

	public int getMesVencimento() {
		return mesVencimento;
	}

	public void setMesVencimento(int mesVencimento) {
		this.mesVencimento = mesVencimento;
	}
}
