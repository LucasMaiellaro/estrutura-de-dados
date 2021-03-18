package atividade5.exercicio02;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String args[]){
		int escolha = 1;
		int posicao = 0;
		Double valor;
		
		while (escolha != 0) {
			
			escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do metodo que deseja executar:"
					+ "\n1 - Verificar se a lista esta vazia"
					+ "\n2 - Adicionar uma temperatura no inicio da lista"
					+ "\n3 - Adicionar uma temperatura no final da lista"
					+ "\n4 - Asicionar uma temperatura em uma posicao especifica da lista"
					+ "\n5 - Remover uma temperatura do inicio da lista"
					+ "\n6 - Remover uma temperatura do final da lista"
					+ "\n8 - Apresentar lista"
					+ "\n0 - Sair"));
			
			switch (escolha) {
			case 1: 
				System.out.println(TemperaturaController.estaVazio());
				break;
				
			case 2:
				valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da temperatura"));
				TemperaturaController.addInicio(valor);
				break;
				
			case 3:
				valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da temperatura"));
				TemperaturaController.addFinal(valor);
				break;
			
			case 4:
				posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao que quer adicionar"));
				valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da temperatura"));
				TemperaturaController.addPosicao(valor, posicao);
				break;
			
			case 5:
				TemperaturaController.removeInicio();
				break;
				
			case 6:
				TemperaturaController.removeFinal();
				break;
			
			case 8:
				TemperaturaController.apresentarLista();
				break;
			
			default:
				break;
			}
		}
			
	}

}