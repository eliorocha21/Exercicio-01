package main.java.exercicio01.questao15;

import java.util.Scanner;

public class questao15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 1, aux =0;
        do{
            aux += sc.nextInt();
            contador++;

        }while(contador <=50);

        System.out.print((double)aux/50);
    }
}
