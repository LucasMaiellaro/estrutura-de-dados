package atividade6.exercicio02;

import javax.swing.JOptionPane;

public class TemperaturaController {
	
	static Temperatura primeiroItem = null;
	
	public static Boolean estaVazio() {
		if (primeiroItem == null)
			return true;
		else
			return false;
	}
	
	public static void addInicio(Double valor) {
		Temperatura temperatura = new Temperatura();
		temperatura.setValor(valor);
		temperatura.setProximo(primeiroItem);
		primeiroItem = temperatura;
	}
	
	public static void addFinal(Double valor) {
		Temperatura item = primeiroItem;
		
		while (item.getProximo() != null)
			item = item.getProximo();
		
		Temperatura temperatura = new Temperatura();
		temperatura.setValor(valor);
		temperatura.setProximo(null);
		item.setProximo(temperatura);
	}
	
	public static void addPosicao(Double valor, int posicao) {
		Temperatura item = primeiroItem;
		
		for (int i = 1; i < posicao - 1; i++) {
			item = item.getProximo();
		}
		
		Temperatura temperatura = new Temperatura();
		temperatura.setValor(valor);
		temperatura.setProximo(item.getProximo());
		item.setProximo(temperatura);
	}
	
	public static void removeInicio() {
		if (estaVazio()) {
			JOptionPane.showMessageDialog(null, "A lista esta vazia");
			return;
		}
		
		primeiroItem = primeiroItem.getProximo();
	}
	
	public static void removeFinal() {
		if (estaVazio()) {
			JOptionPane.showMessageDialog(null, "A lista esta vazia");
			return;
		}
		
		Temperatura item = primeiroItem;
		Temperatura aux = null;
		
		while (item.getProximo() != null) {
			 aux = item;
			 item = item.getProximo();
		}
		
		aux.setProximo(null);		
	}
	
	public static void removePosicao(int posicao) {
		if (estaVazio()) {
			JOptionPane.showMessageDialog(null, "A lista esta vazia");
			return;
		}
		
		Temperatura item = primeiroItem;
		Temperatura aux = item;
		
		for (int i = 1; i < posicao - 1; i++) {
			item = item.getProximo();
		}
		
		for (int i = 1; i <= posicao; i++) {
			aux = aux.getProximo();
		}
		
		item.setProximo(aux);
	}
	
	//função apresentarLista com recursividade
	public static void apresentarLista(Temperatura item) {	
		if (item == null) {
			return;
		} else {
			System.out.println(item.getValor());
			apresentarLista(item.getProximo());
		}
		
	}
	
}
