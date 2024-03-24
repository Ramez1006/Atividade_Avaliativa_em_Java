package decima_quinta_questao;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de n para gerar a série de Fibonacci: ");
        int n = scanner.nextInt();

        System.out.println("Série de Fibonacci até o " + n + "º termo:");
        for (int i = 1; i <= n; i++) {
            int fibonacciTerm = calcularFibonacci(i);
            System.out.print(fibonacciTerm + " ");
        }
    }

    // Função para calcular o termo de Fibonacci
    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            int termoAnterior = 0;
            int termoAtual = 1;
            for (int i = 2; i <= n; i++) {
                int proximoTermo = termoAnterior + termoAtual;
                termoAnterior = termoAtual;
                termoAtual = proximoTermo;
            }
            return termoAtual;
        }
    }
}