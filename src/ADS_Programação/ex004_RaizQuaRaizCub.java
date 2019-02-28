package ADS_Programação;

import java.util.Scanner;

public class ex004_RaizQuaRaizCub {
    public static void main (String[] args) {
        //Programa que lê tres numeros reias, soma eles e mostra a raiz quadrada e a raiz cubica dessa soma
        //Variaveis
        double num1, num2, num3, soma, raizQ, raizC;
        //Entrada
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        num3 = sc.nextDouble();
        //Processamento
        soma = num1 + num2 + num3;
        raizQ = Math.sqrt(soma);
        raizC = Math.cbrt(soma);
        //Saida
        System.out.println("Soma: "+soma);
        System.out.println("Raíz quadrada: "+raizQ);
        System.out.println("Raiz cubica: "+raizC);
    }
}
