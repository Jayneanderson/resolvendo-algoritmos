package codewars;

public class Isograms {

	public static void main(String[] args) {
		System.out.println(isIsogram("Dermatoglyphics"));

	}

	public static boolean isIsogram(String str) {
		long size = str.length();
		return str.toLowerCase().chars().distinct().count() == size;
//		Map<Character, Boolean> letras = new LinkedHashMap<>();
//		
//		str = String.format("%s", str.toLowerCase());
//
//		for (int i = 0; i < str.length(); i++) {
//
//			char letra = str.charAt(i);
//
//			if (letras.containsKey(letra)) {
//				letras.put(letra, false);
//			} else {
//				letras.put(letra, true);
//			}
//		}
//
//		System.out.println(letras);
//		
//		return !letras.containsValue(false);
	}
}
