// 30/01/2023
import java.util.Scanner;

public class AulaScanner2 {
    public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite algumas coisas por linha:");
		
		sc.nextLine(); // O nextLine consome um espaço vazio, por isso estou deixando aqui, no caso de haver um string vazio
		String s1 = sc.nextLine(); // nextLine aceita dados até a quebra de linha
		String s2 = sc.nextLine(); // Pode ser um string vazio
		String s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}

}
