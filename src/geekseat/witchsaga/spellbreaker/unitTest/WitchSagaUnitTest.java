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
		int killCount = ww.witchKillCountOfNYearPrinted(102 - 69);
		assertEquals(9227464, killCount);
	}

	@Test
	void saveTheVillagerTest() {
		RepelTheWitch ktw = new RepelTheWitch();
		List<Person> villagers = new ArrayList<Person>();
		villagers.add(new Person(10, 12));
		villagers.add(new Person(13, 17));
		villagers.add(new Person(10, 14));
		villagers.add(new Person(69, 102));

		Double saveTheVillager = 0d;
		saveTheVillager = ktw.saveTheVillager(villagers);
		double ave = (double) (16 + 9227464)/4;
		System.out.println(ave);
		assertEquals(ave, saveTheVillager);
	}

}
