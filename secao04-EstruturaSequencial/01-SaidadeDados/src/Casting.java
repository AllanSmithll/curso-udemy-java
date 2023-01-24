public class Casting {

	public static void main(String[] args) {
		int a, b; // Valores inteiros
		double result; // resultado aceita números com ponto flutuante
		double result2;

		a = 5;
		b = 2;

		result = a / b; // Divisão de dois números inteiros não aceita ponto flutuante
		result2 = (double) a / b; // Com o uso de "Casting", eu converto o resultado para double

		System.out.println(result); // => 2.0
		System.out.println(result2); // => 2.5

	}

}
