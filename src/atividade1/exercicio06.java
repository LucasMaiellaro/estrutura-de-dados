package atividade1;

import java.util.Scanner;

public class exercicio06 {

    public static void main(String[] args) {

        int num;
        Scanner sc= new Scanner(System.in);

        System.out.print("Entre com um numero: ");
        num= sc.nextInt(); 

        System.out.print("Numero: " + num + " Fatorial: " + calculaFat(num));

    }

    private static int calculaFat(int num) {

        if (num == 0) {
            return 1;
        }
        else {
            return num * calculaFat(num - 1);
        }

    }

}
