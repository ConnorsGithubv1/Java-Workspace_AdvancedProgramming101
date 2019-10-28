
package practice;

public class boxword {

	private String word;
	public boxword(String c) {
		// TODO Auto-generated constructor stub
		
		word = c;
	}

	public void convert() {
		// TODO Auto-generated method stub
		
		System.out.println(word);
		for( int i=1; i <= word.length() - 2; i++) {
			System.out.print(word.charAt(i));
			for( int b=1; b < word.length() - 1; b++){
				System.out.print(" ");	
			}
			System.out.println(word.charAt(word.length() - i - 1));
		}
		for( int n = word.length() - 1;  n >= 0; n--) {
			System.out.print(word.charAt(n));
		}
	}

}