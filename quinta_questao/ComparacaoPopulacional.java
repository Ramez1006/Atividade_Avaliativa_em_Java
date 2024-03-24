package quinta_questao;

import java.util.Scanner;

public class ComparacaoPopulacional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada das populações e taxas de crescimento
        System.out.print("Informe a população do país A: ");
        int populacaoA = scanner.nextInt();

        System.out.print("Informe a taxa de crescimento anual do país A (%): ");
        double taxaCrescimentoA = scanner.nextDouble() / 100.0;

        System.out.print("Informe a população do país B: ");
        int populacaoB = scanner.nextInt();

        System.out.print("Informe a taxa de crescimento anual do país B (%): ");
        double taxaCrescimentoB = scanner.nextDouble() / 100.0;

        // Validação das entradas
        if (populacaoA <= 0 || populacaoB <= 0 || taxaCrescimentoA < 0 || taxaCrescimentoB < 0) {
            System.out.println("Valores inválidos. Populações devem ser positivas e taxas de crescimento não negativas.");
            return;
        }

        // Cálculo do número de anos
        int anos = 0;
        while (populacaoA <= populacaoB) {
            populacaoA += (int) (populacaoA * taxaCrescimentoA);
            populacaoB += (int) (populacaoB * taxaCrescimentoB);
            anos++;
        }

        // Saída
        System.out.println("Após " + anos + " anos, a população do país A ultrapassará ou igualará a população do país B.");
        System.out.println("População do país A: " + populacaoA);
        System.out.println("População do país B: " + populacaoB);
    }
}
