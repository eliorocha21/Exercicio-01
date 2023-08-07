package main.java.exercicio01.questao13;

/*13. Escreva uma classe que imprima todas as possibilidades de que no lançamento de dois dados tenhamos o valor 7
como resultado da soma dos valores de cada dado. */

public class questao13 {

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {{System.out.println(i +" "+ (i -7 )*(-1) +"\n"+ (i -7)*(-1)+" "+i);}}
    }
}
