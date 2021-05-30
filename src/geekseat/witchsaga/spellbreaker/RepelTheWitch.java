package geekseat.witchsaga.spellbreaker;

import java.util.List;

import geekseat.witchsaga.spellbreaker.models.Person;

public class RepelTheWitch {

	public double saveTheVillager(List<Person> villagers) {
		int totalNumberKilled = 0;
		Weakness ww = new Weakness();
		//Populating the total person killed at given years the witch start killing.
		for (Person p : villagers) {
			int personBornOnYear = p.getYearOfDeah() - p.getAgeOfDeath()  ;
			int killedOnThatYear = ww.witchKillCountOfNYear((int) personBornOnYear);
			totalNumberKilled += killedOnThatYear;
		}
		//return the average person gets killed by the witch.
		return (double)totalNumberKilled/ villagers.size();
	}

}
