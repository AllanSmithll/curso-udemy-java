// 31/01/2023
// Uso da Biblioteca "Math"

public class MathFunctions {
    public static void main(String[] args) throws Exception {
        
        // Atribuindo valores às variáveis
			double x = 3.0;
			double y = 4.0;
			double z = -5.0;
			double A, B, C;
			
			// Função matemática de raiz quadrada
			A = Math.sqrt(x);
			B = Math.sqrt(y);
			C = Math.sqrt(25.0);
			
			// Resultados das raizes
			System.out.println("Raiz quadrada de " + x + " = " + A);
			System.out.println("Raiz quadrada de " + y + " = " + B);
			System.out.println("Raiz quadrada de 25 = " + C);
			
			// Função matemática de potência
			A = Math.pow(x, y);
			B = Math.pow(x, 2.0);
			C = Math.pow(5.0, 2.0);
			
			// Resultados das potências
			System.out.println(x + " elevado a " + y + " = " + A);
			System.out.println(x + " elevado ao quadrado = " + B);
			System.out.println("5 elevado ao quadrado = " + C);
			
			// Valor absoluto (módulo de um número), ou número positivo
			A = Math.abs(y);
			B = Math.abs(z);
			
			// Resultados dos valores absolutos
			System.out.println("Valor absoluto de " + y + " = " + A);
			System.out.println("Valor absoluto de " + z + " = " + B);

    }
}
