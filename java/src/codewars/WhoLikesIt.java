package codewars;

import java.util.ArrayList;
import java.util.List;

public class WhoLikesIt {

	/*
	 * You probably know the "like" system from Facebook and other pages. People can
	 * "like" blog posts, pictures or other items. We want to create the text that
	 * should be displayed next to such an item.
	 * 
	 * Implement a function likes :: [String] -> String, which must take in input
	 * array, containing the names of people who like an item. It must return the
	 * display text as shown in the examples:
	 * 
	 * likes {} // must be "no one likes this" likes {"Peter"} // must be
	 * "Peter likes this" likes {"Jacob", "Alex"} // must be
	 * "Jacob and Alex like this" likes {"Max", "John", "Mark"} // must be
	 * "Max, John and Mark like this" likes {"Alex", "Jacob", "Mark", "Max"} // must
	 * be "Alex, Jacob and 2 others like this"
	 * 
	 * For 4 or more names, the number in and 2 others simply increases.
	 */

	public static void main(String[] args) {

		System.out.println(whoLikesIt());

	}

	public static String whoLikesIt(String... names) {

		switch (names.length) {
		case 0:
			return String.format("no one likes this");
		case 1:
			return String.format("%s likes this", names[0]);
		case 2:
			return String.format("%s and %s like this", names[0], names[1]);
		case 3:
			return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
		}

		return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
	}

}
