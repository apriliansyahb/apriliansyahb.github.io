package geekseat.witchsaga.spellbreaker.unitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import geekseat.witchsaga.spellbreaker.RepelTheWitch;
import geekseat.witchsaga.spellbreaker.models.Person;

class WitchSagaUnitTest {

	@Test
	void fibTest() {
		RepelTheWitch rtw = new RepelTheWitch();
		BigInteger fibResult = rtw.fiboOnO1BigInt(new BigInteger("6"));
		assertEquals(new BigInteger("8"), fibResult);
	}

	@Test
	void killCountTest() {
		RepelTheWitch rtw = new RepelTheWitch();
		BigInteger killCount = rtw.witchKillCountOfNYearBI(new BigInteger("6"));
		assertEquals(new BigInteger("20"), killCount);
	}

	@Test
	void killCountTestPrinted() {
		RepelTheWitch rtw = new RepelTheWitch();
		BigInteger killCount = rtw.witchKillCountOfNYearPrintedBI(new BigInteger("372").subtract(new BigInteger("69")));
		assertEquals(new BigInteger("2464593359921179141398048006246675396881836888835835456250887804"), killCount);
	}

	@Test
	void saveTheVillagerTest() {
		RepelTheWitch ktw = new RepelTheWitch();
		List<Person> villagers = new ArrayList<Person>();
		villagers.add(new Person(new BigInteger("10"), new BigInteger("12")));
		villagers.add(new Person(new BigInteger("13"), new BigInteger("17")));
		villagers.add(new Person(new BigInteger("10"), new BigInteger("14")));
		villagers.add(new Person(new BigInteger("69"), new BigInteger("372")));

		Double saveTheVillager = 0d;
		saveTheVillager = ktw.saveTheVillager(villagers);
		BigInteger th = new BigInteger("2464593359921179141398048006246675396881836888835835456250887804");
		Double ave = th.add(new BigInteger("16")).doubleValue() / 4;
		System.out.println(new BigDecimal(ave));
		assertEquals(ave, saveTheVillager);
	}

}
