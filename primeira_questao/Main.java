package primeira_questao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Digite uma nota entre zero e dez: ");
                double nota = Double.parseDouble(scanner.nextLine());

                if (nota >= 0 && nota <= 10) {
                    System.out.printf("Você digitou a nota %.2f.%n", nota);
                    break;
                } else {
                    System.out.println("Valor inválido! A nota deve estar entre zero e dez.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número válido.");
            }
        }
    }
}