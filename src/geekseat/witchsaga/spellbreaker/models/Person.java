package geekseat.witchsaga.spellbreaker.models;

import java.math.BigInteger;

public class Person {

	private BigInteger ageOfDeath;
	private BigInteger yearOfDeah;

	/**
	 * @return the ageOfDeath
	 */
	public BigInteger getAgeOfDeath() {
		return ageOfDeath;
	}

	/**
	 * @param ageOfDeath the ageOfDeath to set
	 */
	public void setAgeOfDeath(BigInteger ageOfDeath) {
		this.ageOfDeath = ageOfDeath;
	}

	/**
	 * @return the yearOfDeah
	 */
	public BigInteger getYearOfDeah() {
		return yearOfDeah;
	}

	/**
	 * @param yearOfDeah the yearOfDeah to set
	 */
	public void setYearOfDeah(BigInteger yearOfDeah) {
		this.yearOfDeah = yearOfDeah;
	}

	@Override
	public String toString() {
		return "Person [ageOfDeath=" + ageOfDeath + ", yearOfDeah=" + yearOfDeah + "]";
	}

	public Person(BigInteger ageOfDeath, BigInteger yearOfDeah) {
		super();
		this.ageOfDeath = ageOfDeath;
		this.yearOfDeah = yearOfDeah;
	}

}
