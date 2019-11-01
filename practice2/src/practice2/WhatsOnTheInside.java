package practice2;

import static java.lang.System.*;

class Monster
{
	protected String myName = "long way to go for a toString()";

	public Monster()
	{
		myName = "Monster";    //uncomment and recompile and run
	}

	public Monster( String name )
	{
		myName = name;
		
	}

	public String toString( )
	{
		return myName;
	}
}

class Witch extends Monster
{
   public Witch( )	//GoodWitch will not compile without this constructor
   { 
   	//automatically calls super()
   }  

   public Witch( String name )
   {
	   super(name);
   }
}

class GoodWitch extends Witch
{
	public GoodWitch() {
		// TODO Auto-generated constructor stub
	}
   
   public GoodWitch( String name )
   {
 	  super(name);
   }
}

class zombie extends Monster{
	
	private String kind;
	
	public zombie(){
		
	}
	
	public zombie(String name) {
		super(name);
	}
	
	public zombie(String name, String k) {
		super.myName = name;
		kind = k;
	}
	
	public String toString() {
		return super.myName + ": " + kind;
	}
}

public class WhatsOnTheInside
{
	public static void main ( String[] args )
	{
		GoodWitch bad = new GoodWitch();		//why does this not compile
		out.println(bad);
		
		GoodWitch witch = new GoodWitch("Harriet");
		out.println(witch);
		
		zombie x = new zombie("martin", "runner");
		out.println(x);
	}
}