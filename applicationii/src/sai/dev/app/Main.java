package sai.dev.app;

public class Main {

	
	public static void main(String[] args) {
		Person person;
		person = new Girl("teddy","khammam",args);
		String[]acc = {"pouch"};
		person.showHobbies();
		String[]arr = person.showHobbies();
		for(String hobbies : arr) {
		System.out.println(hobbies);
		}
		person.DisplayDetails();
		person.getSportsinterst();
		Girl girl = (Girl)person;
		for (int i = 0; i < arr.length; i++) {
			String types = arr[i];
			girl.showAccessoriestypes();
		}

		
		person = new Boy("kushi","hyd");
		person.getSportsinterst();
		person.showHobbies();
		for(String hobbies : arr) {
		System.out.println(hobbies);
		}
		person.DisplayDetails();
		Boy bo = (Boy)person;
		bo.StringToylist();
		bo.showGaming();

	}

}
