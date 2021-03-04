package atividade3;

public class Pilha {
	
	public static Integer adicionaElemento(Integer elemento, Integer[] array) {	
		for (int i = 0; i <= array.length; i++) {
			if (array[i] == null) {
				array[i] = elemento; 
				break;
			} else {
				System.out.println("A pilha esta cheia!");
			}
		}
		return null;
	}
	
	public static Integer removeElemento(Integer[] array) {
		Integer itemRemovido = 0;
		
		for (int i = 4; i >= 0; i--) {
			if (array[i] == null) {
				continue;	
			} else {
				itemRemovido = array[i];
				array [i] = null;
				break;
			}		
		}
		
		return itemRemovido;
	}

}
