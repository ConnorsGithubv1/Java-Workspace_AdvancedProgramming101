package practice;

public class Dog {
	
	private String name;
	private int age;
	
	public Dog(String string) {
		// TODO Auto-generated constructor stub
		name = string;
		age = 1;
	}
	
	public Dog(String string, int i) {
		// TODO Auto-generated constructor stub
		name = string;
		age = i;
	}

	public int getPeopleAge(int c) {
		// TODO Auto-generated method stub
		return age * c;
	}

	public void increaseAgeByOne() {
		// TODO Auto-generated method stub
		age = age + 1;
	}

	public String getName() {
		// TODO Auto-generated method stub
		
		return name;
	}

}
