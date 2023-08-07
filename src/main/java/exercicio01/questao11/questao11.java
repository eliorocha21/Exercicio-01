package main.java.exercicio01.questao11;

import java.util.Scanner;

/*. Utilize a estrutura if para fazer um programa que retorne o nome de um
produto a partir do código do mesmo. Considere os seguintes códigos:
001 ? Parafuso;
002 ? Porca;
003 ? Prego; */
public class questao11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o código do produto: ");
        String codigo = scan.nextLine();
        if (codigo.equals("001") == true){
            System.out.println("Parafuso");

        }else if(codigo.equals("002") == true){
            System.out.println("Porca");
        }else if(codigo.equals("003") == true){
            System.out.println("Prego");
        }else{
            System.out.println("Produtos Diversos");
        }

    }
}
