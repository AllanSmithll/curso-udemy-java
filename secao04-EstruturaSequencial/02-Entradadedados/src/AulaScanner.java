// 26/01/2023

import java.util.Scanner;
// faça sc.close() quando não precisar mais do objeto sc
public class AulaScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Declarando variáveis
		String x;
		int y;
		double z;
		char zx;

		// Trabalhando com strings
		System.out.print("Digite alguma frase: ");
		x = sc.nextLine();
		System.out.println("Você digitou: " + x); // Concatenação

		// Trabalhando com inteiros
		System.out.print("Agora digite algum número inteiro: ");
		y = sc.nextInt();
		System.out.print("Você digitou: ");
		System.out.println(y); // Devolvendo a variavel na mesma linha

		// Trabalhando com double
		System.out.print("Agora um Double: "); // Se o estiver programado para o Locale BR, só é aceito , com separador de casas decimais
		z = sc.nextDouble();
		System.out.printf("Você digitou: %.2f%n", z); // Formatando em duas cas flutuantes
		
		// Trabalhando com caracteres
		System.out.print("Digite qualquer caracter: ");
		zx = sc.next().charAt(0); // Qualquer tecla e frase, mas apenas o primeiro caractere
		System.out.println("Pegamos apenas o primeiro caracter hehehe: " + zx);
		
		// Trabalhando com vários tipos
		System.out.println("Digite uma string, um inteiro e um double por linha:"); // Tudo na mesma linha
		x = sc.next(); // string
		y = sc.nextInt(); // Inteiro
		z = sc.nextDouble(); // Double
		System.out.print("Você digitou: " + x + ", " + y + ", " + z + ".");
		
		sc.close(); // Descarta o objeto do tipo Scanner
	}

}
