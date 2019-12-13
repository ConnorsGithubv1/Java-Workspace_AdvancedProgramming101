package blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class deck {

public static final int NUMFACES = 13;

public static final int NUMSUITS = 4;

public static final int NUMCARDS = 52;

public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};

public static final String FACES[] = {"ONE","ACE","TWO","THREE","FOUR",
		"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

private int topCardIndex;

static ArrayList<Card> stackOfCards;

// constructor

public deck() {

//initialize the instance variables
	stackOfCards = new ArrayList<>();
	topCardIndex = NUMCARDS - 1;

//one loop to go through all SUITS
	for(int i = 0; i < NUMSUITS; i++) {
		//one loop to go through all FACES
		for(int c = 0; c < NUMFACES; c++) {
			BlackJackCard bjc = new BlackJackCard();
			System.out.println(bjc);
			stackOfCards.add(bjc);
	}
	}
//add in each new Card() to the Deck
	System.out.println(stackOfCards.size());
	
}

public int size() { return 0; }

public int numCardsLeft(){

return 0;

}

public static void shuffle(){

//add code to shuffle deck – Collections has a shuffle
	Collections.shuffle(stackOfCards);  
	System.out.println(stackOfCards);
	System.out.println(stackOfCards.size());

}

public Card nextCard(){ return stackOfCards.get(topCardIndex--); }

public String toString(){

return stackOfCards + " topCardIndex = " + topCardIndex;

}

}