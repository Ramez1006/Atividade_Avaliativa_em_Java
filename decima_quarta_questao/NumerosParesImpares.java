package decima_quarta_questao;

import java.util.Scanner;

public class NumerosParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeNumeros = 10;
        int numerosPares = 0;
        int numerosImpares = 0;

        for (int i = 1; i <= quantidadeNumeros; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                numerosPares++;
            } else {
                numerosImpares++;
            }
        }

        System.out.println("Quantidade de números pares: " + numerosPares);
        System.out.println("Quantidade de números ímpares: " + numerosImpares);
    }
}