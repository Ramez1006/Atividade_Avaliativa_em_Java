package decima_primeira_quesstao;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dois números inteiros
        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundoNumero = scanner.nextInt();

        // Verificação se o primeiro número é menor ou igual ao segundo
        if (primeiroNumero > segundoNumero) {
            int aux = primeiroNumero;
            primeiroNumero = segundoNumero;
            segundoNumero = aux;
        }

        // Soma dos dois números
        int soma = primeiroNumero + segundoNumero;

        // Impressão dos números no intervalo
        System.out.println("Números no intervalo: ");
        for (int i = primeiroNumero + 1; i < segundoNumero; i++) {
            System.out.print(i + " ");
        }

        // Impressão da soma dos dois números
        System.out.println("\nSoma dos números: " + soma);
    }
}