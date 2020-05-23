package sai.dev.app;

public abstract class Person {
public String name;
public String city;
public Person(String name, String city) {
	super();
	this.name = name;
	this.city = city;
}
void DisplayDetails() {
	System.out.println("name"+name);
	System.out.println("city"+city);
	
}
abstract void getSportsinterst();
abstract String[]showHobbies();

}
