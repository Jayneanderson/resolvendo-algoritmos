package codewars;

public class ConvertStringToCamelCase {

	public static void main(String[] args) {

		System.out.println(toCamelCase("river_desert_Rockstar_Ninja_Lake_river_mountain_Lake_desert_right"));
		System.out.println(toCamelCase("the-stealth-warrior"));
		System.out.println(toCamelCase("The_Stealth_Warrior"));
	}

	static String toCamelCase(String s) {

		String newStrings[];
		if (s.indexOf("_") != -1) {
			newStrings = s.split("_");

		} else {
			newStrings = s.split("-");

		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < newStrings.length; i++) {

			if (i == 0) {
				sb.append(newStrings[i]);
			}
			
			else {
				sb.append(newStrings[i].toUpperCase().subSequence(0, 1) + newStrings[i].substring(1));				
			}

		}
		return sb.substring(0);
	}

}
