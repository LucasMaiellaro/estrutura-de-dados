package atividade2;

public class exercicio03 {
	
	public static Boolean isEmpty(String[] array) {
		if (array.length == 0)
			return true;
		else
			return false;	
	}
	
	public static Boolean isFull(String[] array) {
		for (int i = 0; i <= array.length; i++) {
			if (array[i] == null)
				return false;
		}
		return true;
	}
	
	public static void addInitialChar(String[] array, String character) {
		int i = array.length;
		
		if (isFull(array) == true) {
			System.out.println("O array esta cheio"); 
			return;
		}
		
		while (i > 0) {
			array[i] = array[i + 1];
			i--;
		}
		
		array[i] = character;
			
	}
	
	public static void addEndChar(String[] array, String character) {
		int i = 0;
		
		if (isFull(array) == true) {
			System.out.println("O array esta cheio"); 
			return;
		}
		
		while (i < array.length) {
			array[i] = array[i - 1];
			i++;
		}
		
		array[i] = character;
	}
	
	
	public static void addChar(String[] array, String character, Integer position) {
		int i = 0;
		
		if (isFull(array) == true) {
			System.out.println("O array esta cheio"); 
			return;
		}
		
		while (i < position) {
			array[i] = array[i - 1];
			i++;
		}
		
		array[i] = character;
	}
	
	public static void deleteInitialChar(String[] array) {
		if (array[0] == null) {
			System.out.println("A posicao esta vazia");
		}
		
		System.out.println("caracter removido: " + array[0]);
		array[0] = null;
	}
	
	public static void deleteChar(String[] array, Integer position) {
		if (array[position] == null) {
			System.out.println("A posicao esta vazia");
			return;
		}
		
		System.out.println("caracter removido: " + array[position]);
		array[position] = null;
	}
	
	public static String concatenateArray(String[] array) {
		String concatenatedArray = "";
		
		for (int i = 0; i <= array.length; i++) {
			concatenatedArray += " " + array[i];
		}
		
		return concatenatedArray;
	}
}
