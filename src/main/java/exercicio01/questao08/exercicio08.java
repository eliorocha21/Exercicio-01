package main.java.exercicio01.questao08;

import java.util.Scanner;

public class exercicio08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Escreva um número: ");
        numero = scan.nextInt();

            if (numero %2 == 0){
                System.out.println(numero + " é par");

            }
            else {
                System.out.println(numero + " é impar");
            }

    }
}
