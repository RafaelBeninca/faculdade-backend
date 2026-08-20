// Define o pacote ao qual esta classe pertence
package org.example;

// Importa a classe Scanner para leitura de dados do teclado
import java.util.Scanner;
import java.util.Arrays;

// Declara a classe principal do programa
public class Main {
    // Declara o método principal que contém a lógica do programa
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler entradas do usuário pelo teclado
        Scanner leitor = new Scanner(System.in);

        // Exibe uma mensagem pedindo ao usuário que digite o seu nome
        System.out.println("Digite o seu nome agora: ");

        // Lê a linha digitada pelo usuário e armazena na variável nome
        String nome = leitor.nextLine();

        System.out.println("Digite o seu sobrenome agora: ");
        // Lê a linha digitada pelo usuário e armazena na variável sobrenome
        String sobrenome = leitor.nextLine();

        // Declara uma variável inteira com o ano atual
        int ano = 2026;

        // Exibe uma saudação personalizada com o nome digitado
        System.out.println("Olá " + nome + " " + sobrenome + "!");
        // Exibe o ano atual na tela
        System.out.println("O ano atual é: " + ano);
        // Exibe a quantidade de caracteres do nome digitado
        System.out.println("O tamanho do seu nome é: " + (nome.length() + sobrenome.length()));

        // Verifica se o nome possui mais de 5 caracteres
        if ((nome.length() + sobrenome.length()) > 5) {
            // Exibe mensagem informando que o nome é longo
            System.out.println("Seu nome é longo");
        } else {
            // Exibe mensagem informando que o nome é curto
            System.out.println("Seu nome é curto");
        }

        // Controla o tamanho do array através de uma nova variável
        System.out.println("Digite o tamanho do array: ");
        // Inserção do valor
        Integer valor = leitor.nextInt();

        // Cria um array de inteiros (Integer) com capacidade para 3 elementos
        // Integer[] notas = new Integer[4];
        Integer[] notas = new Integer[valor];

        // Atribui o valor 10 à primeira posição do array
        //notas[0] = 10;
        // Atribui o valor 8 à segunda posição do array
        //notas[1] = 8;
        // Atribui o valor 6 à terceira posição do array
        //notas[2] = 6;
        // Atribui o valor 4 à terceira posição do array
        //notas[3] = 4;
        // Atribui o valor 2 à terceira posição do array
        //notas[4] = 2;
        // Atribui o valor 2 à terceira posição do array

        // Novo método de definição dos valores inicais, mais conveniente e não resulta em erro caso
        // o tamanho do array for menor que 5
        int[] valoresIniciais = {10, 8, 6, 4, 2};

        // For loop que cicla pelo array de notas, atribuindo valores de acordo com o tamanho do array
        for (int i = 0; i < notas.length; i++) {
            // Caso o valor do loop atual (i) for menor que o tamanho do array, é movido o valor de valoresIniciais
            // da posição i para notas na mesma posição
            if (i < valoresIniciais.length) {
                notas[i] = valoresIniciais[i];
            // Caso o array for maior que a quantidade de valores iniciais, valores nulos se tornam 0
            } else
                notas[i] = 0;
        }

        // Inicializa a variável soma com zero para acumular os valores das notas
        int soma = 0;

        // Laço que percorre as 4 posições do array de notas
        for (int i = 0; i < notas.length; i++) {
            // Acumula o valor da nota atual na variável soma
            soma = soma + notas[i];
        }
        // Exibe a média das notas dividindo a soma pelo número de notas
        System.out.println("Média final: " + (soma / notas.length));

        // Inicializa a variável notaFinal com zero
        int notaFinal = 0;
        // Laço que incrementa notaFinal enquanto for menor que 10
        while(notaFinal < 10) {
            // Incrementa notaFinal em 1 a cada iteração
            notaFinal += 1;
        }
        // Exibe o valor final de notaFinal após o laço
        System.out.println("Nota Final: " + notaFinal );

        // Chama o método exercicio01
        exercicio01();
    }

    // Declara o método exercicio01 que exibe uma mensagem simples
    static void exercicio01() {
        // Exibe a mensagem "Nova mensagem" na tela
        System.out.println("Nova mensagem");
    }
}
