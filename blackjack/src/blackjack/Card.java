package blackjack;

import java.util.Random;

public class Card
{
   public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
   
   public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};
   
   private String suit;
   private int num;
   private int face;
   

   public Card()
   {
	   //random card face (int)
	   Random randomGenerator = new Random();
	   int randomFace = randomGenerator.nextInt(13);
	   face = randomFace;
	   int randomSuit = randomGenerator.nextInt(4);
	   num = randomSuit;
	   
   }

   //set methods

   //get methods 



   public int getValue()
   {
	   return face;
   }

   
   //equals method



   public String toString()
   {
     return FACES[face] + " of " + getSuit() + " | value = " + getValue();
   }

private String getSuit() {
	// TODO Auto-generated method stub
	suit = SUITS[num];
	return suit;
}
 }
