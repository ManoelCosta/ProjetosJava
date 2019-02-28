package ADS_Programação;

import java.util.Scanner;

public class ex002_DivQuoRes {
    public static void main (String[] args){
       //Programa em java que le dois numeros inteiros (dividendo e divisor) e imprime o quociente e o resto da divisã
       //Declaracao de variaveis
        int num1, num2, quociente, resto;
       //Entrada de dados
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o primeiro numero: ");
        num1 = sc.nextInt();
        System.out.print("Informe o sengundo numero: ");
        num2 = sc.nextInt();
       //Processamento de Dados
        quociente = num1/num2;
        resto = num1 % num2;
       //Saida de dados
        System.out.println("Quociente: "+quociente);
        System.out.println("Resto da divisão: "+resto);
    }
}
