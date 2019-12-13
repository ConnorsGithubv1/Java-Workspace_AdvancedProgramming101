package blackjack;

import java.util.ArrayList;

public class player

{

private ArrayList<Card> hand;

private int winCount;

public player ()

{

}

public player (int score)

{
	System.out.println(score);
}

public void addCardToHand( Card temp )

{
	BlackJackCard bjc = new BlackJackCard();
	System.out.println(bjc);
	hand.add(bjc);
	System.out.println(hand);
}

public void resetHand( )

{

}

public void setWinCount( int numwins )

{

}

public int getWinCount() { return 0; }

public int getHandSize() { return 0; }

public int getHandValue()

{

return 0;

}

public boolean hit( )

{

return false;

}

public String toString()

{

return "";

}

}