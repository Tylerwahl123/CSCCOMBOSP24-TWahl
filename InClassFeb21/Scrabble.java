import java.util.Scanner;

public class Scrabble {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter letters:");
		
		
		
		System.out.println("Enter the word you want to spell:");

		String tiles = input.next();

		System.out.println(canSpell(tiles, tiles));

		

		String word = input.next();

		System.out.println(canSpell(word, word));

	}
	
	

	private static String canSpell(String tiles, String word) {

		tiles = tiles.toLowerCase();

		String tilesCheck = "quijibo";

		String right = "Can be spelled";

		String wrong = "Cannot spell word";
		
		int i, j, b;
		
		
		String word1 = word;
		char letter1 = word1.charAt(0);
		int count1 = 1;
		for (i = 1; i < word1.length(); i++) {
			if (word1.charAt(i) == letter1) {
				count1 ++;
		
		
		
		
		char letter = word1.charAt(0);
		int count = 0;
		for (i = 0; i < tilesCheck.length(); i++) {
			if (tilesCheck.charAt(i) == letter) {
				count ++;
			}
		}
		
		if (count >= count1) {
			System.out.println("For the letter " +word1.charAt(0) + " there are enough");
		}else {
			System.out.println("For the letter" + word1.charAt(0) + " there are not enough)");
		}
		
		return word1;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		for (int i = 0; i < tiles.length(); i++) {
//
//			int count = 0;
//
//			for (int j = 0; j < tiles.length(); j++) {
//
//				for (int b = 0; b < tiles.length(); b++)
//
//					if (tiles.charAt(i) == tilesCheck.length()) {
//
//						count++;
//
//						if (tiles.charAt(j) == tilesCheck.length()) {
//
//							count++;
//
//							if (tiles.charAt(b) == tilesCheck.length()) {
//
//								count++;
//
//							}
//
//						}
//
//					}
//
//			}
//
//			if (tiles.indexOf(i) == 2) {
//
//				return wrong;
//
//			}
//
//		}
//
//		return right;

	}

}
