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
			int killOfYear = fiboOnO1(i);
			killCount += killOfYear;
		}
		return killCount;
	}

	public int witchKillCountOfNYearPrinted(int year) {
		int killCount = 0;
		String killNumbers = "";
		for (int i = 1; i <= year; i++) {
			int killOfYear = fiboOnO1(i);
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
	
	public int fiboOnO1(int n) {
		int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
	}
	
//	public static void main(String[] args) {
//		int n= 7;
//		System.out.println(fibonacciSequenceGenerator(n));
//		System.out.println(fib(n));
//		
//		double Phi = (1+Math.sqrt(5))/2;
//		double phi = (1-Math.sqrt(5))/2;
//		
//		int fib = (int) ((Math.pow(Phi, n) - Math.pow(phi, n))/Math.sqrt(5));
//		System.out.println(fib);
//	}

}
