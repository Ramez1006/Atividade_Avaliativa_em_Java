package decima_nona_questao;

import java.util.Scanner;

public class EstatisticasNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de números (N): ");
        int n = scanner.nextInt();

        int menorValor = 1000; // Inicializa com o maior valor possível
        int maiorValor = 0; // Inicializa com o menor valor possível
        int somaValores = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

            // Atualiza o menor valor
            if (numero < menorValor) {
                menorValor = numero;
            }

            // Atualiza o maior valor
            if (numero > maiorValor) {
                maiorValor = numero;
            }

            // Calcula a soma dos valores
            somaValores += numero;
        }

        System.out.println("Menor valor: " + menorValor);
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Soma dos valores: " + somaValores);
    }
}