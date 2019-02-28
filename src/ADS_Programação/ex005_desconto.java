package ADS_Programação;

import java.util.Scanner;

public class ex005_desconto {
    public static void main(String[] args) {
        //programa que calcula e mostra o preço final de um produto,
        //Variaveis
        double novoPreco, preco, desconto, precoF;
        //Entrada
        Scanner sc = new Scanner(System.in);
        preco = sc.nextDouble();
        desconto = sc.nextDouble();
        //Processamento
        novoPreco = preco - (((preco * desconto) / 100));
        //Saída
        System.out.println(novoPreco);
    }
}
