public class SomaWhile {
    public static void main(String[] args) {
        int INDICE = 13, SOMA = 0, K = 0;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }
        //Ao final do processamento, qual será o valor da variável SOMA? Resultado final 91
        System.out.println(SOMA);
    }
}