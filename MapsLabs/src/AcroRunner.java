
public class AcroRunner {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Acronyms a = new Acronyms();
		
		String[] sent1 = "I drove my PU to TSO to get a HD My CPU has a virus.\r\n".split(" ");
		String[] sent2 = "I sometimes SO when trying to kick a FG  I had 2 RBI".split(" ");
		String[] sent3 = "at the game.  I saw 2 PDA infractions in the hall.".split(" ");
		
		a.putEntry(a.listcreate());
		a.convert(sent1);
		a.convert(sent2);
		a.convert(sent3);
	}

}
