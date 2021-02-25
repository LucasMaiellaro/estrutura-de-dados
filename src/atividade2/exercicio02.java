package atividade2;

public class exercicio02 {
	
	public static Boolean isEmpty(char[] array) {
		if (array.length == 0)
			return true;
		else
			return false;	
	}
	
	public static Boolean isFull(char[] array) {
		for (int i = 0; i <= array.length; i++) {
			if (array[i] == 0)
				return false;
		}
		return true;
	}
	
	public static void addInitialChar(char[] array, char character) {
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
	
	public static void addEndChar(char[] array, char character) {
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
	
	
	public static void addChar(char[] array, char character, Integer position) {
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
	
	public static void deleteInitialChar(char[] array) {
		if (array[0] == 0) {
			System.out.println("A posicao esta vazia");
		}
		
		System.out.println("caracter removido: " + array[0]);
		array[0] = 0;
	}
	
	public static void deleteChar(char[] array, Integer position) {
		if (array[position] == 0) {
			System.out.println("A posicao esta vazia");
			return;
		}
		
		System.out.println("caracter removido: " + array[position]);
		array[position] = 0;
	}
	
	public static String concatenateArray(char[] array) {
		String concatenatedArray = "";
		
		for (int i = 0; i <= array.length; i++) {
			concatenatedArray += " " + array[i];
		}
		
		return concatenatedArray;
	}
}
