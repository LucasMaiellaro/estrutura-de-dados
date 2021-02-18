package atividade1;

import javax.swing.JOptionPane;

public class exercicio02 {
	
	public static void main(String args[]) {
		int[] numeros = new int[5];
		int[] fatoriais = new int[5];
		
		
		for (int i = 0; i < 5; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com um valor"));
			fatoriais[i] = calculaFatorial(numeros[i]);
			System.out.print("\nFatorial de " + numeros[i] + ": " + fatoriais[i]);
		}
	}
	
	public static int calculaFatorial(int num) {
		int resultado = 1;
		
		for (int i = num; i > 0; i -= 1) {
			resultado = resultado * i;
		}
		
		return resultado;
	}
}
