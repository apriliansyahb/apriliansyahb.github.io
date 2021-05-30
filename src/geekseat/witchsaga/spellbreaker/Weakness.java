package geekseat.witchsaga.spellbreaker;

public class Weakness {

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
		String killNumbers="";
		for (int i = 1; i <= year; i++) {
			int killOfYear = fibonacciSequenceGenerator(i);
			killNumbers+=killOfYear+"+";
			killCount += killOfYear;
			System.out.println(String.format("On the #%s year she kills %s = %s villagers", i,killNumbers.substring(0, killNumbers.length()-1),killCount));
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
