package com.java.project.faculdade;

import java.util.Scanner;

public class LoginMethods extends AcoesGerais{
	
	static Scanner sc = new Scanner(System.in);
	static Admin admin = new Admin();
	
	public static int adminLoginCheck () {
		System.out.println("PARA RETORNAR AO MENU PRINCIPAL, DIGITE [ 0 ] NO LOGIN");
		System.out.print("LOGIN ADMINISTRADOR: ");			
		String login = sc.next();
		
		if (login.equals("0")) {
			AcoesGerais.menu();
			return 0;
		}
				
		System.out.print("SENHA: ");
		String password = sc.next();
		
		

		if (login.equals(admin.getLogin()) && password.equals(admin.getSenha())) {
			return 1;
		}
		else {
			System.out.println("LOGIN OU SENHA INCORRETOS");
			return 0;
		}
	}
	
	
	
	public static int professorLoginCheck() {
		int index = -1;
		System.out.println("PARA RETORNAR AO MENU PRINCIPAL, DIGITE [ 0 ] NO LOGIN");
		System.out.print("DIGITE O SEU NOME: ");
		String login = sc.next();

		if (login.equals("0")) {
			AcoesGerais.menu();
			return index;
		}
		
		System.out.print("DIGITE A SUA SENHA: ");
		String senha = sc.next();
		
		if (faculdade.getProfessor() == null || faculdade.getProfessor().isEmpty()) {
			System.out.println("lOGIN OU SENHA INCORRETO");
			return index;
		}
		else {
			for (int c = 0; c<faculdade.getProfessor().size(); c++) {
				if (faculdade.getProfessor().get(c).getNome().equals(login) &&
						faculdade.getProfessor().get(c).getSenha().equals(senha)) {
					index = c;
					return index;
				} 
				
			}
		}
		return index;

	}
	
	public static int alunoLoginCheck() {
		int index = -1;
		System.out.println("PARA RETORNAR AO MENU PRINCIPAL, DIGITE [ 0 ] NO LOGIN");
		System.out.print("DIGITE O SEU NOME: ");
		String login = sc.next();

		if (login.equals("0")) {
			AcoesGerais.menu();
			return index;
		}
		
		System.out.print("DIGITE A SUA SENHA: ");
		String senha = sc.next();
		
		if (faculdade.getAlunos() == null || faculdade.getAlunos().isEmpty()) {
			System.out.println("lOGIN OU SENHA INCORRETO");
			return index;
		}
		else {
			for (int c = 0; c<faculdade.getAlunos().size(); c++) {
				if (faculdade.getAlunos().get(c).getNome().equals(login) &&
						faculdade.getAlunos().get(c).getSenha().equals(senha)) {
					index = c;
					return index;
				} 
				
			}
		}
		return index;

	}

}
