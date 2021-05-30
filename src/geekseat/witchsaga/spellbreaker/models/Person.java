package geekseat.witchsaga.spellbreaker.models;

public class Person {

	private int ageOfDeath;
	private int yearOfDeah;

	/**
	 * @return the ageOfDeath
	 */
	public int getAgeOfDeath() {
		return ageOfDeath;
	}

	/**
	 * @param ageOfDeath the ageOfDeath to set
	 */
	public void setAgeOfDeath(int ageOfDeath) {
		this.ageOfDeath = ageOfDeath;
	}

	/**
	 * @return the yearOfDeah
	 */
	public int getYearOfDeah() {
		return yearOfDeah;
	}

	/**
	 * @param yearOfDeah the yearOfDeah to set
	 */
	public void setYearOfDeah(int yearOfDeah) {
		this.yearOfDeah = yearOfDeah;
	}

	@Override
	public String toString() {
		return "Person [ageOfDeath=" + ageOfDeath + ", yearOfDeah=" + yearOfDeah + "]";
	}

	public Person(int ageOfDeath, int yearOfDeah) {
		super();
		this.ageOfDeath = ageOfDeath;
		this.yearOfDeah = yearOfDeah;
	}
	
	

}
