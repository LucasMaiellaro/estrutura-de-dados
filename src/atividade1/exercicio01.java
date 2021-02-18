package atividade1;

import javax.swing.JOptionPane;

public class exercicio01 {
	
	public static void main(String args[]) {
		float[] saldos = new float[100];
		float somaSaldosPositivos = 0;
		float quantidadeSaldosPositivos = 0;
		float somaSaldos = 0;
		float quantidadeSaldos = 0;
		float somaSaldosNegativos = 0;
		
		for (int i = 0; i < 100; i++) {
			saldos[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Entre com um saldo"));
			somaSaldos += saldos[i];
			quantidadeSaldos += 1;
			
			if (saldos[i] >= 100 && saldos[i] <= 1000) {
				somaSaldosPositivos += saldos[i];
				quantidadeSaldosPositivos += 1;
			}
			if (saldos[i] < 0) {
				somaSaldosNegativos = somaSaldosNegativos + (saldos[i]);
			}
		}
		System.out.print("Media dos Positivos entre 100 e 1000: " + calculaMedia(somaSaldosPositivos, quantidadeSaldosPositivos));
		System.out.print("\nMedia dos Saldos: " + calculaMedia(somaSaldos, quantidadeSaldos));
		System.out.print("\nSoma dos negativos: " + somaSaldosNegativos);
	}

	public static float calculaMedia(float saldos, float quantidade) {
		return (saldos / quantidade);
	}
	
}