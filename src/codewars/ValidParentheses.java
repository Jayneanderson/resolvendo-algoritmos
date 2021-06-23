package codewars;

import java.util.Stack;

public class ValidParentheses {
	
	public static void main(String[] args) {
		
	}
	
	public static boolean validParentheses(String parens)
	  {
		if(parens.isEmpty()) {
			return false;
		}
		Stack<Character> pilha = new Stack<Character>();
		
		for (int i = 0; i < parens.length(); i++) {
			final char aux = parens.charAt(i);

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
