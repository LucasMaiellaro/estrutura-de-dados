package atividade1;

import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {
        int num;
        Scanner sc= new Scanner(System.in);

        System.out.print("Entre com um numero: ");
        num= sc.nextInt(); 

        System.out.print("\nSerie de Fibonacci\n");

        for (int i = 0; i <= num; i++) {
            System.out.print(calcFib(i) + " - ");
        }

    }

    private static int calcFib(int num) {

        if (num < 2)
            return num;
        else
            return calcFib(num - 1) + calcFib(num - 2);
    }

}
