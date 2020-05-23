package sai.dev.app;

public class Boy extends Person {

	public Boy(String name, String city) {
		super(name, city);
	}

	@Override
	void getSportsinterst() {
System.out.println("cricket,carroms");
	}

	@Override
	String[] showHobbies() {
		return new String[] {"writing stories,searching new in web"};
	}
	void StringToylist() {
		System.out.println("mickymouse,doreamon");
	}
	void showGaming() {
		System.out.println("pc gamming");
	}

}
