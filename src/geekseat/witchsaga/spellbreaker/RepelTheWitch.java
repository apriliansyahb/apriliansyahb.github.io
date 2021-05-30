package geekseat.witchsaga.spellbreaker;

import java.util.List;

import geekseat.witchsaga.spellbreaker.models.Person;

public class RepelTheWitch {

	public double saveTheVillager(List<Person> villagers) {
		int totalNumberKilled = 0;
		// Populating the total person killed at given years the witch start killing.
		for (Person p : villagers) {
			int personBornOnYear = p.getYearOfDeah() - p.getAgeOfDeath();
			if (personBornOnYear < 1)
				return -1d;
			int killedOnThatYear = witchKillCountOfNYear((int) personBornOnYear);
			totalNumberKilled += killedOnThatYear;
		}
		// return the average person gets killed by the witch.
		return (double) totalNumberKilled / villagers.size();
	}
	
	public int witchKillCountOfNYear(int year) {
		int killCount = 0;
		for (int i = 1; i <= year; i++) {
			int killOfYear = fibonacciSequenceGenerator(i);
			killCount += killOfYear;
		}
		return killCount;
	}

	public int witchKillCountOfNYearPrinted(int year) {
		int killCount = 0;
		String killNumbers = "";
		for (int i = 1; i <= year; i++) {
			int killOfYear = fibonacciSequenceGenerator(i);
			killNumbers += killOfYear + "+";
			killCount += killOfYear;
			System.out.println(String.format("On year #%s she kills %s = %s villagers", i,
					killNumbers.substring(0, killNumbers.length() - 1), killCount));
		}
		return killCount;
	}

	public int fibonacciSequenceGenerator(int sequence) {
		if (sequence <= 1) {
			return sequence;
		} else {
			return fibonacciSequenceGenerator(sequence - 1) + fibonacciSequenceGenerator(sequence - 2);
		}
	}

}
