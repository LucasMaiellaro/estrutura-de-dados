package atividade3;

public class Fila {
	
	public static Integer adicionaElemento(Integer elemento, Integer[] array) {	
		
		
		for (int i = 0; i <= array.length; i++) {
			if (array[i] == null) {
				array[i] = elemento;
				break;
			} else {
				System.out.println("A fila esta cheia!");
			}
			
		}
		return null;

	}
	
	public static Integer removeElemento(Integer array[]) {
		Integer itemRemovido = 0;
		
		itemRemovido = array[0];
		array[0] = null;
		
		for (int j = 1; j <= array.length; j++) {
			array[j] = array[j - 1];
		}
		
		return itemRemovido;	
	}
	
}
