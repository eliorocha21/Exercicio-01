package main.java.exercicio01.questao07;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Resolucao07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b, auxiliar;

        System.out.println("Digite o valor de A: ");
        a = scan.nextInt();
        System.out.println("Digite o valor de B: ");
        b = scan.nextInt();

        auxiliar = a;
        a = b;
        b = auxiliar;

        System.out.println("a =" + a);
        System.out.println("b =" + b);


    }
}
