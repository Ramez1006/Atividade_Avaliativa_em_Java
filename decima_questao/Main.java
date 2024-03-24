package decima_questao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        for (int i = numero1; i <= numero2; i++) {
            System.out.println(i);

        }
      }
  }

