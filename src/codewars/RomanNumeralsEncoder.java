package codewars;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeralsEncoder {

	public static void main(String[] args) {

		// dividir por mil, se for divisível, divide e joga o M
		System.out.println(solution(473));
		//1491 = MCDLXXXI
		//473 = CDLXXIII
		int numero = 2008;
		System.out.println(numero / 1000);

	}

	public static String solution(int n) {

		Map<Integer, String> roman = new LinkedHashMap<>();
		 
		roman.put(1000, "M");
		roman.put(900, "CM");
		roman.put(500, "D");
		roman.put(400, "CD");
		roman.put(100, "C");
		roman.put(90, "XC");
		roman.put(50, "L");
		roman.put(40, "XL");
		roman.put(10, "X");
		roman.put(9, "IX");
		roman.put(5, "V");
		roman.put(4, "IV");
		roman.put(1, "I");

		StringBuilder romanForm = new StringBuilder();
		int aux = 0;

		for (Integer key : roman.keySet()) {
			aux = n / key;

			if (aux > 0) {

				for (int i = 0; i < aux; i++) {
					romanForm.append(roman.get(key));
				}

			}

			n %= key;
		}

		return romanForm.toString();

	}

}
