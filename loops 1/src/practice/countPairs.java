package practice;

public class countPairs {
	
	private String word;
	private int numpairs;

	public countPairs(String word2) {
		// TODO Auto-generated constructor stub
		word = word2;
		
	}

	public void findpairs() {
		// TODO Auto-generated method stub
		
		for(int i=0; i < word.length() - 1; i++) {
			
			if(word.charAt(i) == word.charAt(i + 1)) {
				numpairs ++;
				
			}
	
		}
		System.out.println(numpairs);
		
	}

}
