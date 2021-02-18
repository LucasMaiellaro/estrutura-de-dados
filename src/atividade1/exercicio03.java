package atividade1;

import javax.swing.JOptionPane;

public class exercicio03 {
	
	public static void main(String args[]) {
		int[] numeros = new int[5];
		int[] ordem = new int[5];
		int maiorNumero = 0;
		
		for (int i = 0; i < 5; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com um numero"));
			if (numeros[i] > maiorNumero) {
				ordem[i] = maiorNumero;
				maiorNumero = numeros[i];
			} else {
				ordem[i] = numeros[i];
			}
			System.out.print(ordem[i]);
		}
	}

} 
