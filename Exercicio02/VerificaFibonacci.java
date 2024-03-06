package Exercicio02;

import java.util.Scanner;

public class VerificaFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar um número ao usuário (ou você pode definir o número diretamente no código)
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        if (verificaFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " NÃO pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    // Função para verificar se um número pertence à sequência de Fibonacci
    public static boolean verificaFibonacci(int num) {
        int a = 0, b = 1;

        while (a <= num) {
            if (a == num) {
                return true; // O número pertence à sequência de Fibonacci
            }

            int temp = a + b;
            a = b;
            b = temp;
        }

        return false; // O número NÃO pertence à sequência de Fibonacci
    }
}
