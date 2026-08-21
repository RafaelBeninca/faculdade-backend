package org.example;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Pergunta ao usuário quantos alunos serão cadastrados
        System.out.println("Digite quantos alunos serão cadastrados: ");
        int quantidade = leitor.nextInt();

        // Atribui a quantidade de alunos em cada array
        String[] nomes = new String[quantidade];
        double[] medias = new double[quantidade];

        // Limpa o enter para o nome inicial
        leitor.nextLine();

        // for loop que percorre cada aluno
        for (int i = 0; i < quantidade; i++) {

            // Pergunta o nome do aluno
            System.out.println("Digite o nome do " + (i + 1) + "º aluno: ");
            nomes[i] = leitor.nextLine();

            // Pergunta cada uma das três notas
            System.out.println("Digite a primeira nota: ");
            double nota1 = leitor.nextDouble();

            System.out.println("Digite a segunda nota: ");
            double nota2 = leitor.nextDouble();

            System.out.println("Digite a terceira nota: ");
            double nota3 = leitor.nextDouble();

            // Armazena a média dos alunos no array de médias
            medias[i] = (nota1 + nota2 + nota3) / 3;

            // Limpa o enter para o próximo nome
            leitor.nextLine();
        }

        System.out.println("Resultado:");
        for (int i = 0; i < quantidade; i++) {
            System.out.println("- - - - - - - - - - - -");
            System.out.println("Aluno: " + nomes[i]);
            System.out.println("Média: " + medias[i]);
        }
    }
}
