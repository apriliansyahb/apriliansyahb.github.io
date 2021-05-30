package geekseat.witchsaga.spellbreaker.unitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import geekseat.witchsaga.spellbreaker.Weakness;

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

	@Test
	void killCountTestPrinted() {
		Weakness ww = new Weakness();
		int killCount = ww.witchKillCountOfNYearPrinted(6);
		assertEquals(20, killCount);
	}

}
