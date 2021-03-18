package atividade5.exercicio02;

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
		
		while (item.getProximo() != null)
			item = item.getProximo();
			
	}
	
	public static void apresentarLista() {
		if (estaVazio()) {
			JOptionPane.showMessageDialog(null, "A lista esta vazia");
			return;
		}
		
		Temperatura item = primeiroItem;
		
		while (item != null) {
			 System.out.println(item.getValor());
			 item = item.getProximo();
		}		
	}
	
}
