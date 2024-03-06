package Exercicio05;

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String inputString = scanner.nextLine();

        // Invertendo a string
        String reversedString = inverterString(inputString);

        // Exibindo o resultado
        System.out.println("String original: " + inputString);
        System.out.println("String invertida: " + reversedString);

        scanner.close();
    }

    // Método para inverter a string
    private static String inverterString(String input) {
        char[] charArray = input.toCharArray();
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            // Trocar os caracteres nas posições start e end
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Movendo para os próximos caracteres
            start++;
            end--;
        }

        return new String(charArray);
    }
}

