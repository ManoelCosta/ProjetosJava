package ADS_Programação;

import java.util.Scanner;

public class ex001_NomeIdade {
    public static void main (String[] args){
        //Programa que ler o nome e idade de uma pessoa e mostra essas informações na tela
        //Declaração de variaveis
        String nome;
        int idade;
        //Entrada de dados
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o seu nome: ");
        nome = sc.nextLine();
        System.out.println("Informe sua idade: ");
        idade = sc.nextInt();
        //Saída de dados
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);

    }
}
