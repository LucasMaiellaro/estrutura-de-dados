package atividade1;

public class exercicio07 {
	
	public static void main(String[] args) {
        int num = 1;
        System.out.print("Soma dos numeros: " + somaRange(num));
    }

    private static int somaRange(int num) {

        if (num == 100) {
            return 100;
        } 
        else {
            return (num + somaRange(num + 1));
        }
    }

}

