package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WhichAreIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] a = {"arp", "live", "strong"};
		String[] a2 = {"lively", "alive", "harp", "sharp", "armstrong"};
		
		String[] n = inArray(a, a2);
		for (String string : n) {
			System.out.println(string);
		}
}
	//primeiro verificar
	//segundo deixar o array normal
	//ordenar o array
	
	public static String[] inArray(String[] array1, String[] array2) {
		 
		List<String> sentences = new ArrayList<String>();
		Arrays.sort(array1);
		
		
		for (String string : array1) {
			
			for (String sentence : array2) {
				if(sentence.indexOf(string) != -1) {
					sentences.add(string);
					break;
				}
			}
			
		}
		
		return sentences.toArray(new String[sentences.size()]);
	}

}
