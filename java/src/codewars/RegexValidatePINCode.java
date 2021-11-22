package codewars;

public class RegexValidatePINCode {

	public static void main(String[] args) {

		System.out.println(validatePin("33147"));

	}

	public static boolean validatePin(String pin) {
//		final Pattern pattern = Pattern.compile("[^0-9]");
//
//		if(pattern.matcher(pin).find()) {
//			return false;
//		}
//		
//		long size = pin.chars().count();
//		
//		return size == 4 || size == 6;
		
		return pin.matches("[0-9]{4}|\\d{6}");
	}
}
