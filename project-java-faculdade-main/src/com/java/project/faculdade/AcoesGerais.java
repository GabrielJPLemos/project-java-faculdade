package com.java.project.faculdade;

import java.util.Scanner;


import java.util.ArrayList;
import java.util.Random;


public abstract class AcoesGerais {

	static Faculdade faculdade = new Faculdade();
		
	static Scanner sc = new Scanner(System.in);
	
	static Random random = new Random();
	
	
	public static void mockStart() {
		
		ArrayList<Professor> professor = new ArrayList<>();
		ArrayList<Materia> materia = new ArrayList<>();
		ArrayList<Aluno> aluno = new ArrayList<>();
		
		
		materia.add(new Materia("História", 2, 99.2));
		materia.add(new Materia("Matemática", 6, 300.50));
		faculdade.setMateria(materia);
		
		professor.add(new Professor("Oliveira", 25, 7109, "UVA" + random.nextInt(1000) + "BR", "Manhã", "História", "Oliveira123"));
		professor.add(new Professor("Leminho", 25, 7109, "UVA" + random.nextInt(1000) + "BR", "Noite", "Matematica", "Leminho123"));
	
		faculdade.setProfessor(professor);
		
	
		aluno.add(new Aluno("Gabriel", 20, 71044459, "Gabriel123","Gabriel" + random.nextInt(1000) + "UVA","História", true));
		aluno.add(new Aluno("Irineu", 30, 71823442, "Irineu123", "Irineu" + random.nextInt(1000) + "UVA" ,"História", true));
		aluno.add(new Aluno("José", 59, 6192392, "José123","José" + random.nextInt(1000) + "UVA", "Matemática", true));
		faculdade.setAlunos(aluno);
	}
		
	
	



	public static void menu() {
		
		mockStart();

		int escolha = -1;
		System.out.println("PORTAL DA FACULDADE UVA");
		
		while (escolha != 0) {
			
			System.out.println("( 0 ) FECHAR");
			System.out.println("( 1 ) LOGIN ADMIN");
			System.out.println("( 2 ) LOGIN PROFESSOR");
			System.out.println("( 3 ) LOGIN ALUNO");
			System.out.print("ESCOLHA: ");
			
			escolha = sc.nextInt();
			
			switch(escolha) {
			case 0:
				System.exit(0);
			case 1:
				menuAdmin();
				break;
			case 2:
				menuProfessor();
				break;
			case 3:
				menuAluno();
				break;
			default:
				System.out.println("ERRO NA ESCOLHA");
			}
			
			
		}
	}
	
//////////////////////////////////////////////EVENTOS ADMIN/////////////////////////////////////////////////////	
	public static void menuAdmin() {
		int escolha = -1;
		int ok = 0;

		while (escolha != 0) {
			while (ok != 1) {
				ok = LoginMethods.adminLoginCheck();
			}
			System.out.println("( 0 ) VOLTAR ");
			System.out.println("( 1 ) MENU DE ADESÃO");
			System.out.println("( 2 ) MENU DE EXCLUSÃO");
			System.out.println("( 3 ) FINANCEIRO");
			System.out.println("( 4 ) LISTAR ALUNOS");
			System.out.println("( 5 ) LISTAR PROFESSORES");
			System.out.println("( 6 ) LISTAR MATERIAS");
			System.out.print("ESCOLHA: ");
			
			escolha = sc.nextInt();
			
			switch(escolha) {
			case 0:
				break;
			case 1:
				menuAdminAdesao();
				break;
			case 2: 
				menuAdminExclusao();
				break;
			case 3:
				financeiro();
				break;
			case 4:
				listarAlunos();
				break;
			case 5: 
				listarProfessores();
				break;
			case 6:
				listarMaterias();
				break;
			default:
				System.out.println("ERRO NA ESCOLHA");
			}
		}
			
	}
	
	public static void menuAdminAdesao() {
		int escolha = -1;
		
		while (escolha != 0) {
			System.out.println("( 0 ) VOLTAR ");
			System.out.println("( 1 ) CADASTRAR NOVO ALUNO");
			System.out.println("( 2 ) CADASTRAR NOVO PROFESSOR");
			System.out.println("( 3 ) CADASTRAR NOVA MATÉRIA");

			System.out.print("ESCOLHA: ");
			escolha = sc.nextInt();
			
			switch(escolha) {
			case 0:
				break;
			case 1:
				cadastrarNovoAluno();
				break;
			case 2: 
				cadastrarNovoProfessor();
				break;
			case 3:
				cadastrarNovaMateria();
				break;

			default:
				System.out.println("ERRO NA ESCOLHA");
				}
			
		}	
	}
	
	public static void menuAdminExclusao() {
		int escolha = -1;
		
		while (escolha != 0) {
			System.out.println("( 0 ) VOLTAR ");
			System.out.println("( 1 ) FECHAR MATRÍCULA ALUNO");
			System.out.println("( 2 ) DELETAR PROFESSOR");
			System.out.println("( 3 ) DELETAR MATÉRIA");
			System.out.print("ESCOLHA: ");
			
			escolha = sc.nextInt();
			
			switch(escolha) {
			case 0:
				break;
			case 1:
				fecharMatriculaAluno();
				break;
			case 2: 
				deletarProfessor();
				break;
			case 3:
				deletarMateria();
				break;
			default:
				System.out.println("ERRO NA ESCOLHA");
				}
				
		}	
	}
	
	
	public static void cadastrarNovoAluno() {
		
		System.out.println("CADASTRO DE NOVO ALUNO");
		sc.nextLine();
		System.out.println("NOME: ");
		String nome = sc.nextLine();
		System.out.println("IDADE: ");
		int idade = sc.nextInt();
		System.out.println("CPF: ");
		int cpf = sc.nextInt();
		System.out.println("SENHA: ");
		sc.nextLine();
		String senha = sc.nextLine();
		String idMatricula = nome + random.nextInt(1000) + "UVA";

		ArrayList<Aluno> faculdadeAlunos = faculdade.getAlunos();
		
		if (faculdadeAlunos == null || faculdadeAlunos.isEmpty()) {
			faculdadeAlunos = new ArrayList<>();
		}
		
		faculdadeAlunos.add(new Aluno(nome, idade, cpf,senha, idMatricula, true));
		
		faculdade.setAlunos(faculdadeAlunos);
		
		System.out.println("CADASTRADO COM SUCESSO");
		
	}
	
	public static void cadastrarNovoProfessor() {
		sc.nextLine();
		System.out.println("CADASTRO DE NOVO PROFESSOR");
		System.out.print("NOME: ");
		String nome = sc.nextLine();
		System.out.print("IDADE: ");
		int idade = sc.nextInt(); 
		System.out.print("CPF: ");
		long cpf = sc.nextLong();
		String idProf = "UVA" + random.nextInt(1000) + "BR";
		sc.nextLine();
		System.out.print("TURNO DE ENSINO: ");
		String turno = sc.nextLine();
		System.out.print("MATÉRIA DE ESPECIALIZAÇÃO: ");
		String materiaDeEspecializacao = sc.nextLine();
		System.out.print("SENHA: ");
		String senha = sc.nextLine();
		
		
		if (faculdade.getMateria() == null || faculdade.getMateria().isEmpty()) {
			System.out.println("NENHUMA MATÉRIA CADASTRADA NO SISTEMA DA FACULDADE");
		} else {
		for (int c = 0; c<faculdade.getMateria().size(); c++) {
			if (faculdade.getMateria().get(c).getNomeMateria().equals(materiaDeEspecializacao)) {
				ArrayList<Professor> faculdadeProfessor = faculdade.getProfessor();
				
				if (faculdadeProfessor == null || faculdadeProfessor.isEmpty()) {
					faculdadeProfessor = new ArrayList<>();
				}
				
				faculdadeProfessor.add(new Professor(nome, idade, cpf, idProf, turno, materiaDeEspecializacao, senha));
				faculdade.setProfessor(faculdadeProfessor);
				System.out.println("CADASTRADO COM SUCESSO");
				
				} 
			}  
		}
	}
	
	public static void cadastrarNovaMateria() {
		sc.nextLine();
		System.out.println("CADASTRO DE NOVA MATÉRIA");
		
		System.out.print("NOME: ");
		String nomeMateria = sc.nextLine();
		
		System.out.print("NÚMERO DE PERÍODOS: ");
		int numPeriodos = sc.nextInt();
		
		System.out.print("VALOR DA MENSALIDADE: ");
		double mensalidade = sc.nextDouble();
		
		ArrayList<Materia> faculdadeMateria = faculdade.getMateria();
		
		if (faculdadeMateria == null || faculdadeMateria.isEmpty()) {
			faculdadeMateria = new ArrayList<>();
		}
		
		faculdadeMateria.add(new Materia(nomeMateria, numPeriodos, mensalidade));
		
		faculdade.setMateria(faculdadeMateria);
		
		System.out.println("CADASTRADO COM SUCESSO");	
	}
	
	
	
	public static void listarAlunos() {
		faculdade.getAlunos().stream().filter(aluno -> aluno.isMatriculaAtiva()).forEach((filtered) -> {
			System.out.println("---------------------------------");
			System.out.println("NOME: " +filtered.getNome());
			System.out.println("ID MATRÍCULA: " + filtered.getIdMatricula());
			System.out.println("CURSO: " + filtered.getCurso());
			System.out.println("---------------------------------");
		});
	}
	
	
	public static void listarProfessores() {
		faculdade.getProfessor().stream().forEach((prof) -> {
			System.out.println("---------------------------------");
			System.out.println("NOME: " + prof.getNome());
			System.out.println("ID PROFESSOR: " + prof.getIdProf());
			System.out.println("MATÉRIA DE ESPECIALIZAÇÃO: " + prof.getMateriaDeEspecializacao());
			System.out.println("TURNO: " + prof.getTurno());
			
			System.out.println("---------------------------------");
		});
	}
	

	public static void listarMaterias() {
		faculdade.getMateria().stream().forEach((mat) -> {
			System.out.println("---------------------------------");
			System.out.println("MATÉRIA: " + mat.getNomeMateria());
			System.out.println("NÚMERO DE PERÍODOS: " + mat.getPeriodos());
			System.out.println("VALOR DA MENSALIDADE: R$" + mat.getMensalidade());
			System.out.println("---------------------------------");
		});
	}
	
	
	public static void financeiro() {
		int escolha;
		while(true) {
		System.out.println("FINANCEIRO");
		System.out.println("( 0 ) VOLTAR");
		System.out.println("( 1 ) EMITIR VIA DE PAGAMENTO PARA ALUNO");
		System.out.print("ESCOLHA: ");
		escolha = sc.nextInt();
		
		switch(escolha) {
		case 0:
			break;
		case 1:
			emitirBoleto();
			break;
		default:
			System.out.println("ERRO NA ESCOLHA");
			}
		if (escolha == 0) {
			break;
			}
		}	
	}
	
	
	public static void deletarMateria() {
	
		System.out.println("DELETAR MATÉRIA");
		
		if (faculdade.getMateria() == null || faculdade.getMateria().isEmpty()) {
			System.out.println("NENHUMA MATÉRIA CADASTRADA NO SISTEMA DA FACULDADE");
		} else {
			

				System.out.println("INDEX");
				for (int c = 0; c<faculdade.getMateria().size(); c++) {
				System.out.println("---------------------------------");
				System.out.println(c);
				System.out.println("    -    " + " NOME:  "+ faculdade.getMateria().get(c).getNomeMateria());
				System.out.println("    -    " + " PERÍODOS:  "+ faculdade.getMateria().get(c).getPeriodos());
				System.out.println("    -    " + " MENSALIDADE: R$ " + faculdade.getMateria().get(c).getMensalidade());
				System.out.println("---------------------------------");
			}
				
				System.out.println("ESCOLHA POR INDEX A MATÉRIA QUE SERÁ DELETADA: ");				
				int index  = sc.nextInt();
				
				try {
					faculdade.getMateria().remove(index);
					System.out.println("MATÉRIA DELETADA COM SUCESSO!");
				} catch (IndexOutOfBoundsException e) {
					System.out.println("ERROR NO INDEX PASSADO!");
				}
			}
		}
	
	
	public static void deletarProfessor() {
		
		System.out.println("DELETAR PROFESSOR");
		
		if (faculdade.getProfessor() == null || faculdade.getProfessor().isEmpty()) {
			System.out.println("NENHUM PROFESSOR CADASTRADO NO SISTEMA");
		} else {
				System.out.println("INDEX");
				for (int c = 0; c<faculdade.getMateria().size(); c++) {
				System.out.println("---------------------------------");
				System.out.println(c);
				System.out.println("    -    " + " NOME:  "+ faculdade.getProfessor().get(c).getNome());
				System.out.println("    -    " + " ID PROFESSOR:  "+ faculdade.getProfessor().get(c).getIdProf());
				System.out.println("    -    " + " MATÉRIA DE ESPECIALIZAÇÃO:  " + faculdade.getProfessor().get(c).getMateriaDeEspecializacao());
				System.out.println("---------------------------------");
				
				System.out.println("ESCOLHA POR INDEX O PROFESSOR QUE SERÁ DELETADO: ");	
				int index  = sc.nextInt();
				
				if (index == -1) {
					
				} else {
					try {
						if (faculdade.getProfessor().get(index).getMateriaDeEspecializacao().length() > 1) {
							System.out.println("NÃO É POSSÍVEL DELETAR UM PROFESSOR COM UMA MATÉRIA CADASTRADA");
					} else {
						try {
							faculdade.getProfessor().remove(index);
							System.out.println("PROFESSOR DELETADO COM SUCESSO!");
						} catch (IndexOutOfBoundsException e) {
							System.out.println("ERROR NO INDEX PASSADO!");
							}
						}
						
					} catch (IndexOutOfBoundsException e) {
						System.out.println("ERROR NO INDEX PASSADO!");
						}
				}
			}
		}
	}
	
	public static void fecharMatriculaAluno() {
		
		System.out.println("FECHAR MATRÍCULA ALUNO");

		if (faculdade.getAlunos() == null || faculdade.getAlunos().isEmpty()) {
			System.out.println("NENHUM ALUNO CADASTRADO NO SISTEMA");
		} else {
			listarAlunos();
			System.out.print("DIGITE O NÚMERO DE ID DO ALUNO DESEJADO: ");
			String escolha = sc.nextLine();
			
			

		for (Aluno aluno : faculdade.getAlunos()) {
			
			if (aluno.getIdMatricula().equals(escolha)) {

				if (aluno.getBoleto() == null || aluno.getBoleto().isEmpty()) {
					aluno.setMatriculaAtiva(false);
					System.out.println("MATRÍCULA FECHADA COM SUCESSO!");
					break;
				} else {
					
					if (aluno.getBoleto().size() > 1) {
						System.out.println("ALUNO CONTÉM BOLETOS EM ATRASO, POR FAVOR, "
								+ "REGULARIZE A MENSALIDADE PARA CANCELAR A MATRÍCULA");
						break;
					} else {
						aluno.setMatriculaAtiva(false);
						System.out.println("MATRÍCULA FECHADA COM SUCESSO!");
						break;
						}	
					}
				}
			}
		}
	}
	
	public static void emitirBoleto() {
		
		System.out.println("EMITIR BOLETO");
		
		if (faculdade.getAlunos() == null || faculdade.getAlunos().isEmpty()) {
			System.out.println("NENHUM ALUNO CADASTRADO NO SISTEMA");
		} else {
			listarAlunos();
			sc.nextLine();
			System.out.print("DIGITE O NÚMERO DE ID DO ALUNO DESEJADO: ");
			String escolha = sc.nextLine();
			
			System.out.print("NÚMERO DO BOLETO: ");
			int numBoleto = sc.nextInt();
			
			System.out.println("DIA DO VENCIMENTO");
			int diaVencimento = sc.nextInt();
			
			System.out.println("MÊS DE VENCIMENTO: ");
			int mesVencimento = sc.nextInt();
			
			
			for (Aluno aluno : faculdade.getAlunos()) {
				if (aluno.getIdMatricula().equals(escolha)) {
					
					ArrayList<Boleto> boleto = aluno.getBoleto();
					
					if (boleto == null || boleto.isEmpty()) {
						boleto = new ArrayList<>();
					}
					
					boleto.add(new Boleto(numBoleto, diaVencimento, mesVencimento));
					aluno.setBoletos(boleto);
					System.out.println("BOLETO EMITIDO COM SUCESSO.");		
					
					for (Boleto boletos : aluno.getBoleto()) {
						System.out.println("BOLETO DE NÚMERO: " + boletos.getNumBoleto());
						
					}
					
					
				}
			}
		}
	}
	
//////////////////////////////////////////////EVENTOS PROFESSOR/////////////////////////////////////////////////
	
	
	public static void menuProfessor() {
		int escolha = -1;
		int index = -1;
		
		System.out.println("MENU PROFESSOR");
		
		while (escolha != 0) {
			while (index < 0) {
				index = LoginMethods.professorLoginCheck();	
			}
			
			System.out.println("( 0 ) FECHAR");
			System.out.println("( 1 ) EDITAR PERFIL ");
			System.out.println("( 2 ) CHAMADA ALUNOS ");
			System.out.println("( 3 ) MENU PROVA");
			System.out.print("ESCOLHA: ");
			escolha = sc.nextInt();
			
			switch(escolha) {
			case 0:
				break;
			case 1:
				edicaoDeDados(index);
				break;
			case 2:
				chamada(index);
				break;
			case 3:
				prova(index);
				break;
			default:
				System.out.println("ERRO NA ESCOLHA");
			}
			if (escolha == 0) {
				break;
			}
		}
	}
	
	
	public static void edicaoDeDados(int index) {
		int escolha;
		
		System.out.println("EDITAR DADOS");
		
		while (true) {
					
				System.out.println("( 0 ) FECHAR");
				System.out.println("( 1 ) EDITAR SENHA");
				System.out.println("( 2 ) EDITAR NOME");
				System.out.print("ESCOLHA: ");
				escolha = sc.nextInt();
				
				switch(escolha) {
				case 0:
					break;
				case 1:
					System.out.println("EDITAR SENHA");
					System.out.print("NOVA SENHA: ");
					sc.nextLine();
					String novaSenha = sc.nextLine();
					faculdade.getProfessor().get(index).setSenha(novaSenha);
					break;
				case 2:
					System.out.println("EDITAR NOME");
					sc.nextLine();
					String novoNome = sc.nextLine();
					faculdade.getProfessor().get(index).setNome(novoNome);
					break;
				default:
					System.out.println("ERRO NA ESCOLHA");
				}
				if (escolha == 0) {
					break;
				}
			}
	}
	
	
	public static void chamada(int index) {
		System.out.println("CHAMADA");
		faculdade.getAlunos().stream().filter(aluno -> aluno.isMatriculaAtiva())
		.filter(aluno1 -> aluno1.getCurso().equals(faculdade.getProfessor().get(index).getMateriaDeEspecializacao()))
		.forEach((filtered)->{
			System.out.print("NOME: "+filtered.getNome());
			System.out.println(" MATRICULA: "+filtered.getIdMatricula());
			System.out.println("--------------------------------------");
			});
	while(true) {
		System.out.print("DIGITE O ID DE MATRICULA DO ALUNO: ");
		String escolha = sc.nextLine();
		
		faculdade.getAlunos().stream().filter(aluno -> aluno.getIdMatricula().equals(escolha))
		.forEach((filtered) -> {
			filtered.setfalta(filtered.getfalta()+1);
			
		});   
		
		
		if (escolha.equals("0")) {
			break;
		}		
	}	

}
	
	
	public static void prova(int index) {
		System.out.println("MENU PROVA");
		faculdade.getAlunos().stream().filter(aluno -> aluno.isMatriculaAtiva())
		.filter(aluno1 -> aluno1.getCurso().equals(faculdade.getProfessor().get(index).getMateriaDeEspecializacao()))
		.forEach((filtered)->{
			System.out.print("NOME: "+filtered.getNome());
			System.out.println(" MATRICULA: "+filtered.getIdMatricula());
	
			System.out.print("DIGITE A NOTA DO "+filtered.getNome()+": ");
			double nota = sc.nextDouble();
			filtered.setNotaProva(nota);
			System.out.println("NOTA: "+filtered.getNotaProva());
			});
	
	}
	
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	public static void menuAluno() {
		int escolha = -1;
		int index = -1;
		
		System.out.println("MENU ALUNO");
		
		while (escolha != 0) {
			while (index < 0) {
				index = LoginMethods.alunoLoginCheck();
				if(index == -1) {
					System.out.println("NOME OU SENHA INVALIDOS");
				}
			}
		
			System.out.println("( 0 ) FECHAR");
			System.out.println("( 1 ) ESCOLHER CADEIRA ");
			System.out.println("( 2 ) PAGAR BOLETO");
			System.out.print("ESCOLHA: ");
			escolha = sc.nextInt();
			
			switch(escolha) {
			case 0:
				break;
			case 1:
				escolherMateriaParaEstudo(index);
				break;
			case 2:
				pagarFaculdade(index);
				break;
			default:
				System.out.println("ERRO NA ESCOLHA");
			}
			if (escolha == 0) {
				break;
			}
		}
	}
	
	public static void escolherMateriaParaEstudo(int index) {
		listarMaterias();
		sc.nextLine();
		String escolha;
		System.out.println("ESCOLHA A MATERIA PARA ESTUDO: ");	
		escolha =sc.nextLine();
		
		if(faculdade.getMateria() == null || faculdade.getMateria().isEmpty()) {
			System.out.println("SEM CURSOS");
		}else {
			for(Materia materia:faculdade.getMateria()) {
				if(materia.getNomeMateria().equals(escolha)) {
					faculdade.getAlunos().get(index).setCurso(escolha);
					System.out.println("CURSO ADICIONADO");
				}
			}
		}
	}
	
	public static void pagarFaculdade(int index) {
		
		if(faculdade.getAlunos().get(index).getBoleto() == null || faculdade.getAlunos().get(index).getBoleto().isEmpty()) {
			System.out.println("NENHUM BOLETO EMITIDO");
		}else {
			System.out.println("NÚMERO DO BOLETO: " + faculdade.getAlunos().get(index).getBoleto().get(0).getNumBoleto());
			System.out.println("DIA VENCIMENTO: " +faculdade.getAlunos().get(index).getBoleto().get(0).getDiaVencimento() + " / " + faculdade.getAlunos().get(index).getBoleto().get(0).getMesVencimento());
			System.out.println("BOLETO PAGO COM SUCESSO! ");
			faculdade.getAlunos().get(index).getBoleto().remove(0);
			
			if (faculdade.getAlunos().get(index).getBoleto().size() > 0) {
				System.out.println("VOCÊ AINDA TEM UM TOTAL DE " + faculdade.getAlunos().get(index).getBoleto().size() + " BOLETOS ATRASADOS");
				
				faculdade.getAlunos().get(index).getBoleto().stream().forEach((boletos) -> {
					System.out.println("---------------------------------");
					System.out.println("NÚMERO DO BOLETO: " + boletos.getNumBoleto());
					System.out.println("DATA DE VENCIMENTO: " + boletos.getDiaVencimento() + " / " + boletos.getMesVencimento());
					System.out.println("---------------------------------");
				});
				
			} else {
				System.out.println("SUA MENSALIDADE ESTÁ EM DIA");
				}
			}
		}
	}

	
