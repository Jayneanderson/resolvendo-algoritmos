package codewars;

import java.util.Stack;

public class ValidBraces {

	public static void main(String[] args) {
		System.out.println(isBraces("([{}])"));

	}

	public static boolean isBraces(String braces) {
		
		if(braces.isEmpty()) {
			return false;
		}
		Stack<Character> pilha = new Stack<Character>();
		
		for (int i = 0; i < braces.length(); i++) {
			final char aux = braces.charAt(i);

			if (aux == '(' || aux == '{' || aux == '[') {
				pilha.push(aux);

			} else {
				
				if(pilha.isEmpty()) {
					return false;
				}
				
				char element = (char) pilha.pop();
				switch (aux) {
				case ')':
					if (element != '(') {
						return false;
					}
					break;
				case ']':
					if (element != '[') {
						return false;
					}
					break;
				default:
					if (element != '{') {
						return false;
					}
					break;
				}
			}

		}

		return !(pilha.contains('(') || pilha.contains('[') || pilha.contains('{'));
	}

}
