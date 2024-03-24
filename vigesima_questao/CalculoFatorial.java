package vigesima_questao;



import java.util.Scanner;

public class CalculoFatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um número inteiro positivo (menor que 16) para calcular o fatorial (ou -1 para sair): ");
            int numero = scanner.nextInt();

            if (numero == -1) {
                System.out.println("Programa encerrado. Obrigado!");
                break;
            } else if (numero >= 0 && numero < 16) {
                long fatorial = calcularFatorial(numero);
                System.out.println(numero + "! = " + fatorial);
            } else {
                System.out.println("Número inválido. Por favor, insira um número positivo menor que 16.");
            }
        }
    }

    // Função para calcular o fatorial
    public static long calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long resultado = 1;
            for (int i = 2; i <= n; i++) {
                resultado *= i;
            }
            return resultado;
        }
    }
}