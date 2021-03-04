package atividade3;

import javax.swing.JOptionPane;

public class Teste {
	
	public static void main (String args[]) {
		Integer fila[] = new Integer[5];
		Integer pilha[] = new Integer[5];
		
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do metodo que deseja executar:"
				+ "1 - Adicionar um elemento na fila"
				+ "2 - Remover um elemento da fila e adicionar no topo da pilha"
				+ "3 - Adicionar um elemento na pilha"
				+ "4 - Remover um elemento da pilha"));
		
		switch (escolha) {	
		case 1: 
			Integer valorFila = 0;
			valorFila = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para adicionar na fila"));
			Fila.adicionaElemento(valorFila, fila);
			break;
		
		case 2:
			Pilha.adicionaElemento(Fila.removeElemento(fila), pilha);
			break;
			
		case 3:
			Integer valorPilha = 0;
			valorPilha = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para adicionar na fila"));
			Pilha.adicionaElemento(valorPilha, pilha);
			break;
		
		case 4:		
			Fila.adicionaElemento(Pilha.removeElemento(pilha), fila);
			break;	
		}
	}
	

	
	
}
