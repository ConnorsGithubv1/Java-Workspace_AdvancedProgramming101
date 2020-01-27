package blackjack;

public class BlackJackCard extends Card
{

	private int value;
	
   public BlackJackCard()
   {
	   
   }
   
   public int getValue()
   {   
	   //sets values for blackjack game
	   value = super.getValue();
	   
	   if(value >= 11) {
		   value = 10;
	   }
	   
	   if(value == 1) {
		   value = 11;
	   }
	   
	   if(value == 0) {
		   value = 1;
	   }
      //override the Card getValue to build BlackJack logic
      //enables you to build the value for the game into the card
      //this makes writing the whole program a little easier
      return value;
   }
}