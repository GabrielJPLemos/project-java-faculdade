package com.java.project.faculdade;

import java.util.ArrayList;

public class Faculdade {
	
	private final String nomeFaculdade = "Universidade UVA";
	private final String endereçoRua = "Rua da Videira";
	private final int endereçoNum = 01;
	private ArrayList<Materia> materia;
	private ArrayList<Aluno> alunos;
	private ArrayList<Professor> professor;
	
	
	public Faculdade() {
		
	}
	
	
	public String getNomeFaculdade() {
		return nomeFaculdade;
	}
	public String getEndereçoRua() {
		return endereçoRua;
	}
	public int getEndereçoNum() {
		return endereçoNum;
	}
	
	public ArrayList<Materia> getMateria() {
		return materia;
	}

	public void setMateria(ArrayList<Materia> materia) {
		this.materia = materia;
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

	public ArrayList<Professor> getProfessor() {
		return professor;
	}

	public void setProfessor(ArrayList<Professor> professor) {
		this.professor = professor;
	}
}
