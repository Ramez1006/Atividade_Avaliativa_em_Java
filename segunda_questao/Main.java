package segunda_questao;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o nome de usuário: ");
            String nomeUsuario = scanner.nextLine();

            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();

            if (senha.equals(nomeUsuario)) {
                System.out.println("Erro: A senha não pode ser igual ao nome de usuário.");
            } else {
                System.out.println("Senha válida! Bem-vindo, " + nomeUsuario + "!");
                break;
            }
        }
    }
}