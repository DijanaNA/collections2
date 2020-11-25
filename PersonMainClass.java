package collections2;

import java.util.ArrayList;

public class PersonMainClass {
	public static void main(String[] args) {
		Proffesion programmer = new Proffesion("Programmer", 11);
		Proffesion juniorProgrammer = new Proffesion("Programmer", 5);
		Proffesion midProgrammer = new Proffesion("Programmer", 13);
		Proffesion doctor = new Proffesion();
		Proffesion hirurg = new Proffesion("Doctor", 9);
		doctor.setTitle("Doctor");
		doctor.setExperience(20);

		// objekt od person
		// toj ima ime-string, prezime-string, godini-int i
		// profesija-objekt od Proffesion klasata
		Person p1 = new Person("Eli", "Stojanova", 27, programmer);
		Person p2 = new Person("Zan", "Mitrev", 58, doctor);
		Person p3 = new Person("Goran", "Kocev", 25, juniorProgrammer);
		Person p4 = new Person("Sashko", "Klimkarov", 27, midProgrammer);
		Person p5 = new Person("Ivan", "Naunov", 28, hirurg);

		ArrayList<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		// gi izminuvame site elementi vo listata
		for (Person p : list) {
			// povikaj go metodot za sekoj element
			printElement(p);

		}

		System.out.println("Remove person...");
		removePerson(list);

		printDoctors(list);
	}

	private static void printDoctors(ArrayList<Person> list) {
		for (Person person : list) {
			if (person.getProffesion().getTitle().equals("Doctor") && 
					person.getProffesion().getExperience() > 10) {
				System.out.println("Doktor so iskustvo nad 10 god: ");
				printElement(person);
			}
		}
	}

	private static void removePerson(ArrayList<Person> list) {
		for (int i = 0; i < list.size(); i++) {
			// elementot od listata vo momentalnata iteracija
			Person p = list.get(i);
			if (p.getYears() < 18) {
				list.remove(i);
			}
		}

		System.out.println(list);
	}

	/*
	 * printa ime i prezime
	 */
	private static void printElement(Person p) {
		// so get go zemame imeto i prezimeto
		System.out.println("Name: " + p.getName() + " Lastname: " + p.getlastname());

	}
}
