package geekseat.witchsaga.spellbreaker;

import java.math.BigInteger;
import java.util.List;

import geekseat.witchsaga.spellbreaker.models.Person;

public class RepelTheWitch {

	public Double saveTheVillager(List<Person> villagers) {
		BigInteger totalNumberKilled = BigInteger.ZERO;
		// Populating the total person killed at given years the witch start killing.
		for (Person p : villagers) {
			if (p.getYearOfDeah().signum() == -1 || p.getAgeOfDeath().signum() == -0)
				return -1d;
			BigInteger personBornOnYear = p.getYearOfDeah().subtract(p.getAgeOfDeath());
			if (personBornOnYear.signum() == -1)
				return -1d;
			BigInteger killedOnThatYear = witchKillCountOfNYearBI(personBornOnYear);
			totalNumberKilled = totalNumberKilled.add(killedOnThatYear);
		}
		// return the average person gets killed by the witch.
		return totalNumberKilled.doubleValue() / villagers.size();
	}

	public BigInteger witchKillCountOfNYearBI(BigInteger year) {
		BigInteger killCount = BigInteger.ZERO;
		for (BigInteger i = BigInteger.ONE; i.compareTo(year) <= 0; i = i.add(BigInteger.ONE)) {
			killCount = killCount.add(fiboOnO1BigInt(i));
		}
		return killCount;
	}

	public BigInteger witchKillCountOfNYearPrintedBI(BigInteger year) {
		BigInteger killCount = BigInteger.ZERO;
		String killNumbers = "";
		BigInteger killOfYear = BigInteger.ZERO;
		for (BigInteger i = BigInteger.ONE; i.compareTo(year) <= 0; i = i.add(BigInteger.ONE)) {
			killOfYear = fiboOnO1BigInt(i);
			killCount = killCount.add(killOfYear);
			killNumbers += killOfYear + "+";
			System.out.println(String.format("On year #%s she kills %s = %s villagers", i,
					killNumbers.substring(0, killNumbers.length() - 1), killCount));
		}
		return killCount;
	}

	public static int fibonacciSequenceGenerator(int sequence) {
		if (sequence <= 1) {
			return sequence;
		} else {
			return fibonacciSequenceGenerator(sequence - 1) + fibonacciSequenceGenerator(sequence - 2);
		}
	}

	public int fiboOnO1(int n) {
		int a = 0, b = 1, c;
		if (n == 0)
			return a;
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}

	public BigInteger fiboOnO1BigInt(BigInteger n) {
		BigInteger a = BigInteger.ZERO;
		BigInteger b = new BigInteger("1");
		BigInteger c = null;

		for (BigInteger i = new BigInteger("2"); i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
			c = a.add(b);
			a = b;
			b = c;
		}
		return b;
	}

}
