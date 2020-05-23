package sai.dev.app;

public class Girl extends Person {
String[]accessoryList;

	public Girl(String name, String city, String[] accessoryList) {
	super(name, city);
	this.accessoryList = accessoryList;
}

	@Override
	void getSportsinterst() {
System.out.println("shuttle,throwball");
	}

	@Override
	String[] showHobbies() {
		return new String[] {"readingbooks,traveling with frnds"};
	}
	void showAccessoriestypes() {
		System.out.println("ear ringws,pouches,watch");
		System.out.println("accessoryList"+accessoryList);
	}

}
