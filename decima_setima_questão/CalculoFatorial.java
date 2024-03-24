package decima_setima_questão;
import java.util.Scanner;

public class CalculoFatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();

        long fatorial = calcularFatorial(numero);
        
        System.out.println(numero + "! = " + fatorial);
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