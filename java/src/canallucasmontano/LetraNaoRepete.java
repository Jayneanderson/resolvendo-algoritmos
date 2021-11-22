package canallucasmontano;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

public class LetraNaoRepete {
	
//	Dada uma palavra, verifique qual é a primeira letra que não se repete.
//
//	Exemplo: Google

	public static void main(String[] args) {
		
		String palavra = "Dermatoglyphics".toLowerCase();
		
		
		//incremeta + 1 toda vez que achar um valor que se repete.
		
		Map<Character, Boolean> letras = new LinkedHashMap<>();
		
		char letra;
		char letraNaoRepetida;
		for (int i = 0; i < palavra.length(); i++) {
			
			letra = palavra.charAt(i);
			
			if(letras.containsKey(letra)) {
				letras.put(letra, false);		
			} else {
				letras.put(letra, true);
			}
		}
		
		System.out.println(letras);
		
		for(Character character: letras.keySet()) {
			
			if(letras.get(character)) {
				System.out.println(character);
				break;
			}
		}
//		
//		String palavra = "Thaliahtl".toLowerCase();
//		
//		//incremeta + 1 toda vez que achar um valor que se repete.
//		
//		Map<Character, Integer> letras = new LinkedHashMap<>();
//		
//		char letra;
//		char letraNaoRepetida;
//		for (int i = 0; i < palavra.length(); i++) {
//			
//			letra = palavra.charAt(i);
//			
//			if(letras.containsKey(letra)) {
//				letras.put(letra, 1+1);		
//			} else {
//				letras.put(letra, 1);
//			}
//		}
//		
//		System.out.println(letras);
//		
//		for(Character character: letras.keySet()) {
//			
//			if(letras.get(character) == 1) {
//				System.out.println(character);
//				break;
//			}
//		}
		
	}
}
