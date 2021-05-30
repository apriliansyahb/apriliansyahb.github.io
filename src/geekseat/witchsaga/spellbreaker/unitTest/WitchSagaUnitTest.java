package geekseat.witchsaga.spellbreaker.unitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import geekseat.witchsaga.spellbreaker.RepelTheWitch;
import geekseat.witchsaga.spellbreaker.Weakness;
import geekseat.witchsaga.spellbreaker.models.Person;

class WitchSagaUnitTest {


	@Ignore
	void fibTest() {
		Weakness ww = new Weakness();
		int fibResult = ww.fibonacciSequenceGenerator(2);
		assertEquals(1, fibResult);
	}

	@Ignore
	void killCountTest() {
		Weakness ww = new Weakness();
		int killCount = ww.witchKillCountOfNYear(6);
		assertEquals(20, killCount);
	}

	@Ignore
	void killCountTestPrinted() {
		Weakness ww = new Weakness();
		int killCount = ww.witchKillCountOfNYearPrinted(6);
		assertEquals(20, killCount);
	}

	@Test
	void saveTheVillagerTest() {
		RepelTheWitch ktw = new RepelTheWitch();
		List<Person> villagers = new ArrayList<Person>();
		villagers.add(new Person(10, 12));
		villagers.add(new Person(13, 17));
		villagers.add(new Person(10, 14));
		
		Double saveTheVillager = ktw.saveTheVillager(villagers);
		assertEquals((double)16/3, saveTheVillager);
	}

}
