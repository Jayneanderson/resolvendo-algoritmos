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
				System.out.println("Verbo na 1� conjuga��o");
			} else if (conjugacao == 'e' || conjugacao == 'o') {
				System.out.println("Verbo na 2� conjuga��o");
			} else {
				System.out.println("Verbo na 3� conjuga��o");
			}
		} else {
			System.out.println("O verbo n�o est� no infinitivo");
		}
		sc.close();
	}

}
