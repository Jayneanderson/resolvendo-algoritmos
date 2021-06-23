package nubank;

public class Solution {

	public static void main(String[] args) {

		System.out.println(decode("23511011501782351112179911801562340161171141148"));

	}

	public static String decode(String encodedString) {
		StringBuilder convertedString = new StringBuilder();

		// verifica as condições iniciais da String
		if (encodedString.length() >= 1 && encodedString.length() <= 105) {
			String textReverse = "";

			// Ciclo para reverter
			for (int i = encodedString.length() - 1; i >= 0; i--) {
				textReverse += encodedString.charAt(i);
			}

			char c[] = textReverse.toCharArray();

			String tempChar = "";
			int tempNumber = 0;

			for (int i = 0; i < c.length; i++) {

				tempChar += c[i];
				if (tempChar.length() == 2) {

					tempNumber = Integer.parseInt(tempChar);
					System.out.println(tempNumber);
					if (tempNumber < 32) {
						i++;
						tempChar += c[i];
						tempNumber = Integer.parseInt(tempChar);
					}

					convertedString.append(new Character((char) tempNumber).toString());
					tempChar = "";
				}
			}

		}
		return convertedString.toString();
	}
}
