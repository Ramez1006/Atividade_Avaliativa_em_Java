package decima_terceira_questao;

import java.util.Scanner;

public class PotenciaSemFuncao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = scanner.nextInt();

        System.out.print("Digite o expoente: ");
        int expoente = scanner.nextInt();

        int resultado = calcularPotencia(base, expoente);
        System.out.println(base + " elevado a " + expoente + " é igual a " + resultado);
    }

    // Função para calcular a potência
    public static int calcularPotencia(int base, int expoente) {
        int resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}