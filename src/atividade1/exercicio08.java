package atividade1;

public class exercicio08 {
	
	 public static void main(String[] args) {
	        int num = 1;
	        System.out.print("Soma dos pares: " + somaPar(num));
	    }

	    private static int somaPar(int num) {

	        while (num != 201) {
	            if ( num % 2 == 0 ) {
	                return num + (somaPar(num + 1));
	            } else {
	                return somaPar(num + 1);
	            }
	        }
	        return 0;
	    }
	    
}
