package ADS_Programação;

import java.util.Scanner;

public class ex003_AreaTriangulo {
    public static void main (String[] args) {
        //Programa que calcular a area do triangulo. o Usuário deve informar a area e a altura
        //Variaveis
        double base, altura, area;
        //Entrada
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a base: ");
        base = sc.nextDouble();
        System.out.println("Informe a altura: ");
        altura = sc.nextDouble();
        //Processamento
        area = (base * altura) / 2;
        //Saída
        System.out.println("A area do Trinagulo é igual a "+area+"m²");
    }
}
