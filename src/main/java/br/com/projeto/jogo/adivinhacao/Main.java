package br.com.projeto.jogo.adivinhacao;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        jogoAdivinhacao();
    }

    public static void jogoAdivinhacao() {
        Random random = new Random(); // Criação de Objeto Random
        Scanner scanner = new Scanner(System.in); // Criação de Objeto Scanner usado para receber a entrada do usuário pelo console

        int randomNumber = random.nextInt(21); // Gera um número aleatório entre 0 e 20
        int chosenNumber;
        int attempts = 0;

        do {
            attempts++;
            System.out.println("Digite um número:");
            chosenNumber = scanner.nextInt();

            if (randomNumber > chosenNumber) {
                System.out.println("O número " + chosenNumber + " é menor do que o número escolhido!");
            } else if (randomNumber < chosenNumber) {
                System.out.println("O número " + chosenNumber + " é maior do que o número escolhido!");
            } else {
                System.out.println("Parabéns, você acertou em " + attempts + " tentativa(s)!");
            }
            System.out.println();
        } while (randomNumber != chosenNumber);
    }
}
