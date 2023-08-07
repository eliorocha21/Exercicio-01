package main.java.exercicio01.questao14;

import java.util.Scanner;

public class questao14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contador = 1, aux =0;
        while(contador <=50) {

            aux += sc.nextInt();

            contador++;
        }
        System.out.print((double)aux/50);
    }
    }

