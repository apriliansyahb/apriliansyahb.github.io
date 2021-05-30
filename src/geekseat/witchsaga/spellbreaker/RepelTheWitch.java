package geekseat.witchsaga.spellbreaker;

import java.util.List;

import geekseat.witchsaga.spellbreaker.models.Person;

public class RepelTheWitch {

	public double saveTheVillager(List<Person> villagers) {
		int totalNumberKilled = 0;
		Weakness ww = new Weakness();
		for (Person p : villagers) {
			int personBornOnYear = p.getYearOfDeah() - p.getAgeOfDeath()  ;
			int killedOnThatYear = ww.witchKillCountOfNYear((int) personBornOnYear);
			totalNumberKilled += killedOnThatYear;
		}
		return (double)totalNumberKilled/ villagers.size();
	}

}
