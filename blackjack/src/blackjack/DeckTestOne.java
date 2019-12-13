package blackjack;

public class DeckTestOne {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deck d = new deck();
		for(int i = 0; i < 1; i++ ) {
			System.out.println(d);
			System.out.println("num cards left in the deck == " + deck.NUMCARDS);
			deck.shuffle();
		}
}
	}
