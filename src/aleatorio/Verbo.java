package aleatorio;
import java.util.Scanner;

public class Verbo {

	public static void main(String[] args) {
		// Algoritmo 128
		Scanner sc = new Scanner(System.in);
		String verbo;
		char conjugacao;

		System.out.println("Informe o verbo");
		verbo = sc.nextLine();
		conjugacao = verbo.charAt(verbo.length() - 2);

		if (verbo.charAt(verbo.length() - 1) == 'r') {
			if (conjugacao == 'a') {
				System.out.println("Verbo na 1ª conjugação");
			} else if (conjugacao == 'e' || conjugacao == 'o') {
				System.out.println("Verbo na 2ª conjugação");
			} else {
				System.out.println("Verbo na 3ª conjugação");
			}
		} else {
			System.out.println("O verbo não está no infinitivo");
		}
		sc.close();
	}

}
