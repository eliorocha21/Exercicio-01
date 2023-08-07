package main.java.exercicio01.questao12;

import java.util.Scanner;

/*12. Imprima o resultado da divisão por 2 de todos os múltiplos de 3, entre 1 e 100, usando os tipos de
dados int e double . */
public class questao12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <=100 ; i++) {
            if (i %3 == 0){
                System.out.println((double)i/2);
            }

        }

    }
}
