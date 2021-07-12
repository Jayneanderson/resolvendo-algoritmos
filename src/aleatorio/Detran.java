package aleatorio;

import java.util.Scanner;

public class Detran {

	public static void main(String[] args) {
		
/*Criar um algoritmo que ajude o DETRAN a saber o total de recursos que foram arrecadados
com a aplica��es de multas de tr�nsito.
O algoritmo deve ler as seguintes informações para cada motorista:
• número da carteira de motorista (de 1 a 4327),
• número de multas;
• valor de cada uma das multas.
Deve ser impresso o valor da dívida para cada motorista e ao final da leitura o total de
recursos arrecadados (somatório de todas as multas). O algoritmo dever� imprimir também
o n�mero da carteira do motorista que obteve o maior número de multas.
O algoritmo termina ao ler a carteira de motorista de valor O.*/
		
		Scanner sc = new Scanner(System.in); 
		int nCarteira = 0, nMultas = 0, maiorMulta = 0, carteiraMaior = 0;
		float valorMultas = 0, totalMultas = 0;
		
		System.out.println("Informe o nº da carteira de motorista");
		nCarteira = sc.nextInt();
		
		while(nCarteira != 0) {
			
			System.out.println("Qual a quantidade de multas?");
			nMultas = sc.nextInt();
			
			if(nMultas > maiorMulta) {
				maiorMulta = nMultas;
				carteiraMaior = nCarteira;
			}
			
			for(int i = 1; i <= nMultas; i++ ) {
				System.out.println("Qual é o valor da multa " + i + "?");
				valorMultas = sc.nextFloat();
				totalMultas += valorMultas; 
				
			}
			
			System.out.println("Número da carteira: " + nCarteira);
			System.out.println("Valor a se pagar: " + totalMultas);
			System.out.println("");
			
			System.out.println("Informe o n� da carteira de motorista");
			nCarteira = sc.nextInt();
		}
		
		System.out.println("A carteira " + carteiraMaior + " obteve o maior nº de multas");
		sc.close();
			
	}

}
