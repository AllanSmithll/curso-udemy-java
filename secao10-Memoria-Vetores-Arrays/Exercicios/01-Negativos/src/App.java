/*
 * Exercicio 1 da Secao 10 de Comportamento de memoria, vetores e arrays - 25/07/2023
 * @author Allan Amâncio
 */
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantidade_numeros;
        int contador = 0;
        int posicao = 0;
        int novo_numero;

        System.out.print("Quantos numeros voce vai digitar? ");
        quantidade_numeros = sc.nextInt();
        int[] numeros = new int[quantidade_numeros];
        int[] numeros_negativos = new int[quantidade_numeros];

        while (contador < quantidade_numeros) {
            System.out.print("Digite um número: ");
            novo_numero = sc.nextInt();
            numeros[contador] = novo_numero;
            if (novo_numero < 0) {
                numeros_negativos[posicao] = novo_numero;
                posicao++;
            }
            contador++;
        }
        System.out.println("NUMEROS NEGATIVOS:");
        for (int num : numeros_negativos) {
            System.out.println(num);
        }
        sc.close();
    }
}
