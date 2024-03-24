package terceira_questao;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	while (true) {
		System.out.print("Digite um nome:");
	    String nome	= scanner.nextLine();
	
	if (nome.length()>3) {
		System.out.print("Nome valido!");
		
		break;
		
	} else {
		System.out.print(" Erro o nome deve ter mais de 3 caracteres");
	   }
	}	
		
	while(true) {
		System.out.print("Digite uma idade entre 0 e 150:");
		int idade = scanner.nextInt();
		
		if (idade >= 0 && idade <= 150) {
		System.out.print("Idade valida!");
		 break;
	} else {
		System.out.println(" Erro a idade deve estar entre 0 e 150");
	   }
	}
	 while(true) {
		 System.out.print("Digite um salario: ");
	double salario =  scanner.nextDouble();
	
	   if (salario>0) {
		 System.out.println("Salario valido");
		break;
	   } else {
		   System.out.println("Erro: O salario deve ser maior que zero");
	   }
	}  
	while(true) {
		
		System.out.println("Digite o sexo (F/M)");
		String sexo =
				
		
	   scanner.next().toUpperCase();
	
		if(sexo.equals("F") || sexo.equals("M"))
{
	System.out.println("Sexo valido!");
	break;
	
} else {
	
	System.out.println("Erro: digite 'F' para feminino e 'M' para masculino");
    }
 }
	
	while(true) {
		System.out.println("Digite um estado civil S/C/V/D:");
		
		String estadoCivil =
		scanner.next().toUpperCase();
		
	if (estadoCivil.equals("S") || estadoCivil.equals("C") || estadoCivil.equals("V") || estadoCivil.equals("D")) {
		System.out.println("Estado civil valido!");
		break;
	} else {
		System.out.println("Erro: Digite 'S' para solteiro, 'C' para casado.'V' de viuvo,'D' para divorciado");
		
			
		
		
	}
		        }
	     	}
	    }
		
		
	  
