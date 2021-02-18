package atividade1;

public class exercicio09 {
	
	public static void main(String[] args) {
        int num = 1;
        System.out.print("Soma recursiva dos impares de 1 a 300 é: " + somaImpar(num));
    }

    private static int somaImpar(int num) {

        while (num != 301) {
            if ( num % 2 != 0 ) {
                return num + (somaImpar(num+1));
            } else {
                return somaImpar(num+1);
            }
        }
        return 0;
    }
    
}
