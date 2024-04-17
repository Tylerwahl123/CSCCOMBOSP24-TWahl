
public class Card {
	private int rank;
	private int suit;
	
	public Card(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
	}
	Card threeOfClubs = new Card(3,0);
	
	public String toString() {
		
	String[] suits = new String[4];{
		
	suits[0] = "Clubs";
	suits[1] = "Diamonds";
	suits[2] = "Hearts";
	suits[3] = "Spades";
//		String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
		
}
	
	String[] ranks = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	
	String s = ranks[this.rank]+ " of " + suits[this.suit]; 
	
	
	}
}
