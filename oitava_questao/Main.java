package oitava_questao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
		   int soma = 0;
		   
	for ( int i = 1; i <= 5; i++ )	{
		System.out.println(" Digite o" + i + "º numero: ");
	int numero = scanner.nextInt();
	soma += numero;
	
	}
    double media = (double) soma / 5;
    
    System.out.println("Soma dos numeros :" + soma );
    System.out.println("Media dos numeros :" + media);
    
    

	}

}
