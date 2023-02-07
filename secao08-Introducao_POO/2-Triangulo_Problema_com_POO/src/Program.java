// Programa para saber qual triângulo é o maior, 07/02/2023

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the Base and Height of the Triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the Base and Height of the Triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double p = (x.a + x.b + x.c) / 2;
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		
		double q = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(q * (q - y.a) * (q - y.b) * (q - y.c));
		
		System.out.printf("Triangle X area: %.3f%n", areaX);
		System.out.printf("Triangle Y area: %.3f%n", areaY);
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		sc.close();

	}

}
