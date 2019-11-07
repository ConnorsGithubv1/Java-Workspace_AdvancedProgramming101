package blackjack;

public class Card
{
   public static final String FACES[] = {"ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

   private String suit;
   private int face;
   

   public Card()
   {
	   //random card face (int)
	   face = Math.random()
	   
   }

   //set methods

   //get methods 



   public int getValue()
   {
	   return face+1;
   }

   
   //equals method



   public String toString()
   {
     return FACES[face] + " of " + getSuit() + " | value = " + getValue();
   }


   private String getSuit()
   {
	// TODO Auto-generated method stub
	return null;
   }

 }
