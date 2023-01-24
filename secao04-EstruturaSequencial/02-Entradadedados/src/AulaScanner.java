import java.util.Scanner;
// import java.util.Scanner;
// faça sc.close() quando não precisar mais do objeto sc
public class AulaScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x;
		
		System.out.println("Digite alguma frase:");
		x = sc.nextLine();
		System.out.println("Você digitou:");
		System.out.println(x);
		sc.close();
	}

}
