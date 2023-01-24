import java.util.Locale;

// Aula de saída de dados
public class Saida {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // Para que a localização do programa seja os Estados Unidos. Serve para transformar a vírgula separadora de decimais em ponto flutuante
		
		int y = 32; // Inteiro
		double x = 10.7898; // Ponto flutuante
	
		System.out.println(y); // println faz quebra de linha
		System.out.println(x);
		System.out.printf("%.2f%n", x); // Este printf formatou o valor da variável x, que é double, para ter duas casas decimais
		System.out.println("RESULTADO = " + y + " metros."); // Concatenar vários elementos por meio do sinal de mais
		System.out.printf("RESULTADO = %.2f metros%n", y); // Quase a mesma coisa que a linha anteriot
		System.out.println("Olá Mundo! Aqui quem vos digitais é o Allan Amâncio.");
		System.out.print("Fim do programa."); // print() não tem quebra de linha
		
	}
	
}

