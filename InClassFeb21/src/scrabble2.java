import java.util.Scanner;

public class scrabble2 
{
static Scanner input = new Scanner(System.in);


	public static void main(String[] args) {
		System.out.print("What is your set of tiles?");
		String tiles = input.next();
		System.out.print("What word would you like to check?");
		String word = input.next();
		int j;
		
		for (j = 0; j < word.length(); j++) {
			
	
		
//		System.out.println("The character "+ word.charAt(j) + " appears " + wordLetterCount(word) + " in "+ word);
//		System.out.println("The character " + word.charAt(j) + " appears " + tilesLetterCount(tiles, word.charAt(j))+ " in "+tiles );
		if (              tilesLetterCount(tiles, word.charAt(j)) < wordLetterCount(word)         ) { 
			System.out.print(" The word " + word +  " cant be spelt with the tile pool provided");
		}else { 
			System.out.print("For the letter " + word.charAt(j) + " there is enough in tiles ");
		}

		
		
		}
		
	}
	
	
	
	
	public static int wordLetterCount(String str) {
		char letter = str.charAt(0);
		int i, count = 0; 
		for (i = 0; i < str.length(); i++) { 
			if (letter == str.charAt(i)) {
				count ++;
				
			}
		}
		return count;
	}
	
	
	
	
	
	public static int tilesLetterCount(String tiles, char a) 
	{
		int i, count1 = 0; 
		for (i = 0; i < tiles.length(); i++) 
		{ 
			if (a == tiles.charAt(i)) 
			{
				count1 ++;
				
			}
			
		}return count1;
	}
	

}

