package collections2;

public class Person {
	private String name;
	private String lastname;
	private int years;
	private Proffesion proffesion;

	public Person() {

	}

	public Person(String name, String lastname, int years, Proffesion proffesion) {
		this.name = name;
		this.lastname = lastname;
		this.years = years;
		this.proffesion = proffesion;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getlastname() {
		return lastname;
	}

	public void setlastname(String lastname) {
		this.lastname = lastname;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public Proffesion getProffesion() {
		return proffesion;
	}

	public void setProffesion(Proffesion proffesion) {
		this.proffesion = proffesion;
	}

	@Override
	public String toString() {
		return " " + name +   " " + lastname + " " +  years +  " " + proffesion;
	}
	
	

}
