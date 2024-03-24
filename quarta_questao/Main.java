package quarta_questao;

public class Main {

	public static void main(String[] args) {
	 

        // Populações iniciais
        int populacaoA = 80000;
        int populacaoB = 200000;

        // Taxas de crescimento
        double taxaA = 0.03;
        double taxaB = 0.015;

        // Ano inicial
        int ano = 0;

        // Loop para calcular o crescimento populacional
        while (populacaoA <= populacaoB) {
            // Cálculo do crescimento populacional anual
            populacaoA *= (1 + taxaA);
            populacaoB *= (1 + taxaB);

            // Incrementar o ano
            ano++;
        }

        // Imprimir o resultado
        System.out.println("Anos necessários para A ultrapassar B: " + ano);
        
        
           
	}
	
}
