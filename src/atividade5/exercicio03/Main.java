package atividade5.exercicio03;

import javax.swing.JOptionPane;

public class Main {

	public static void main (String args[]) {
		int escolha = 1;
		int posicao = 0;
		int ra = 0;
		String nome;
		String turma;
		String semestre;
		
		while (escolha != 0) {
			
			escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do metodo que deseja executar:"
					+ "\n1 - Adicionar um aluno no final da lista"
					+ "\n2 - Adicionar um aluno no inicio da lista"
					+ "\n3 - Adicionar um aluno no meio da lista"
					+ "\n4 - Remover um aluno do final da lista"
					+ "\n5 - Remover um aluno do inicio da lista"
					+ "\n6 - Remover um aluno do meio da lista"
					+ "\n7 - Apresentar lista"
					+ "\n0 - Sair"));
			
			switch (escolha) {
			case 1: 
				ra = Integer.parseInt(JOptionPane.showInputDialog("Digite o RA"));
				nome = JOptionPane.showInputDialog("Digite o nome");
				turma = JOptionPane.showInputDialog("Digite a turma");
				semestre = JOptionPane.showInputDialog("Digite o semestre");
				AlunoController.addFinal(ra, nome, turma, semestre);
				break;
			
			case 2:
				ra = Integer.parseInt(JOptionPane.showInputDialog("Digite o RA"));
				nome = JOptionPane.showInputDialog("Digite o nome");
				turma = JOptionPane.showInputDialog("Digite a turma");
				semestre = JOptionPane.showInputDialog("Digite o semestre");
				AlunoController.addInicio(ra, nome, turma, semestre);
				break;
			
			case 3:
				ra = Integer.parseInt(JOptionPane.showInputDialog("Digite o RA"));
				nome = JOptionPane.showInputDialog("Digite o nome");
				turma = JOptionPane.showInputDialog("Digite a turma");
				semestre = JOptionPane.showInputDialog("Digite o semestre");
				AlunoController.addMeio(ra, nome, turma, semestre);
				
			case 4:
				AlunoController.removeFinal();
				break;
				
			case 5:
				AlunoController.removeInicio();
				break;
			
			case 6:
				AlunoController.removeMeio();
				break;
				
			case 7:
				AlunoController.apresentarLista();
				break;
				
			default:
				break;
			}				
		}	
	}
	
}
