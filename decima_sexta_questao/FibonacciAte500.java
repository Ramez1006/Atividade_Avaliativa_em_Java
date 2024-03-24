package decima_sexta_questao;

public class FibonacciAte500 {
    public static void main(String[] args) {
        int limite = 500;
        int termoAnterior = 0;
        int termoAtual = 1;

        System.out.println("Série de Fibonacci até que o valor seja maior que 500:");
        System.out.print(termoAnterior + " " + termoAtual + " ");

        while (termoAtual + termoAnterior <= limite) {
            int proximoTermo = termoAnterior + termoAtual;
            System.out.print(proximoTermo + " ");
            termoAnterior = termoAtual;
            termoAtual = proximoTermo;
        }
    }
}