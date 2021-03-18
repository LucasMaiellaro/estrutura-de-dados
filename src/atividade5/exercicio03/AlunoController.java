package atividade5.exercicio03;

import javax.swing.JOptionPane;

import atividade5.exercicio02.Temperatura;

public class AlunoController {
	
	static Aluno primeiroItem = null;
	static int tamanhoLista = 0;

	public static Boolean estaVazio() {
		if (primeiroItem == null)
			return true;
		else
			return false;
	}
	
	public static void addFinal(int ra, String nome, String turma, String semestre) {
		Aluno item = primeiroItem;
		
		while (item.getProximo() != null)
			item = item.getProximo();
		
		Aluno aluno = new Aluno();
		aluno.setRA(ra);
		aluno.setNome(nome);
		aluno.setTurma(turma);
		aluno.setSemestre(semestre);
		aluno.setProximo(null);
		item.setProximo(aluno);
		tamanhoLista++;
	}
	
	public static void addInicio(int ra, String nome, String turma, String semestre) {
		Aluno aluno = new Aluno();
		aluno.setRA(ra);
		aluno.setNome(nome);
		aluno.setTurma(turma);
		aluno.setSemestre(semestre);
		aluno.setProximo(primeiroItem);
		primeiroItem = aluno;
		tamanhoLista++;
	}
	
	public static void addMeio(int ra, String nome, String turma, String semestre) {
		Aluno item = primeiroItem;
		int meio = (int) tamanhoLista / 2;
		
		for (int i = 1; i < meio; i++) {
			item = item.getProximo();
		}
		
		Aluno aluno = new Aluno();
		aluno.setRA(ra);
		aluno.setNome(nome);
		aluno.setTurma(turma);
		aluno.setSemestre(semestre);
		aluno.setProximo(item.getProximo());
		item.setProximo(aluno);
		tamanhoLista++;
	}
	
	public static void removeFinal() {
		if (estaVazio()) {
			JOptionPane.showMessageDialog(null, "A lista esta vazia");
			return;
		}
		
		Aluno item = primeiroItem;
		Aluno aux = null;
		
		while (item.getProximo() != null) {
			 aux = item;
			 item = item.getProximo();
		}
		
		aux.setProximo(null);
		tamanhoLista--;
	}
	
	public static void removeInicio() {
		if (estaVazio()) {
			JOptionPane.showMessageDialog(null, "A lista esta vazia");
			return;
		}
		
		primeiroItem = primeiroItem.getProximo();
		tamanhoLista--;
	}
	
	public static void removeMeio() {
		if (estaVazio()) {
			JOptionPane.showMessageDialog(null, "A lista esta vazia");
			return;
		}
		
		Aluno item = primeiroItem;
		Aluno aux = item;
		int meio = (int) tamanhoLista / 2;
		
		for (int i = 1; i < meio - 1; i++) {
			item = item.getProximo();
		}
		
		for (int i = 1; i <= meio; i++) {
			aux = aux.getProximo();
		}
		
		item.setProximo(aux);
	}
	
	public static void apresentarLista() {
		if (estaVazio()) {
			JOptionPane.showMessageDialog(null, "A lista esta vazia");
			return;
		}
		
		Aluno item = primeiroItem;
		
		while (item != null) {
			 System.out.println(item.getNome());
			 System.out.println(item.getRA());
			 System.out.println(item.getTurma());
			 System.out.println(item.getSemestre());
			 System.out.println("--------------------------------------");
			 item = item.getProximo();
		}		
	}
}
