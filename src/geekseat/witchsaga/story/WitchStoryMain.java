package geekseat.witchsaga.story;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import geekseat.witchsaga.spellbreaker.RepelTheWitch;
import geekseat.witchsaga.spellbreaker.models.Person;

public class WitchStoryMain {

	public static void main(String[] args) {

		String story = "Somewhere far far away, there is a village which is controlled by a dark and cunning witch.\r\n"
				+ "Coincidentally, this witch is also a die-hard programmer.\r\n"
				+ "The witch has power to control death and life of the villager.\r\n"
				+ "The witch will kill a number of villagers each year.\r\n"
				+ "Since the witch is a die hard programmer, she follow a specific rule to decide the number of villagers\r\n"
				+ "she should kill each year.\r\n" + "On the 1st year she kills 1 villager\r\n"
				+ "On the 2nd year she kills 1 + 1 = 2 villagers\r\n"
				+ "On the 3rd year she kills 1 + 1 + 2 = 4 villagers\r\n"
				+ "On the 4th year she kills 1 + 1 + 2 + 3 = 7 villagers\r\n"
				+ "On the 5th year she kills 1 + 1 + 2 + 3 + 5 = 12 villagers\r\n" + "And so on...\r\n"
				+ "The villagers are furious with the witch and want to get rid of her and there is one way to get rid of\r\n"
				+ "her.\r\n"
				+ "The witch will only leave if there is a brave programmer in the villager who can create a program to\r\n"
				+ "solve this problem:\r\n"
				+ "If given two people whose age of death and year of death are known, find the average number of\r\n"
				+ "people the witch killed on year of birth of those people";
		System.out.println(story);

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Now, let's count how many villager who born after the witch takes control in your village?");
		int numberOfVillager = readLineNumber(reader);
		System.out.println(String.format(
				"Okay, there are %s villager, lets get their Age of Death and Year of Death for each villager.",
				numberOfVillager));
		List<Person> villagers = new ArrayList<Person>();
		for (int i = 0; i < numberOfVillager; i++) {
			System.out.println(String.format("Villager #%s", i + 1));
			System.out.println("Age of Death : ");
			int aod = readLineNumber(reader);
			System.out.println(String.format("Year of Death : "));
			int yod = readLineNumber(reader);
			villagers.add(new Person(aod, yod));
		}

		System.out.println("Okay, let's recap the villagers. so you have :");
		int p = 1;
		for (Person person : villagers) {
			System.out.println(String.format("Person #%s, with Age of Death = %s and Year of Death = %s", p,
					person.getAgeOfDeath(), person.getYearOfDeah()));
			p++;
			if(person.getYearOfDeah()-person.getAgeOfDeath()<1) {
				System.out.println("I guess you listed a person who born BEFORE the witch takes control, please redo the listing from the start.");
				System.exit(0);
			}
		}
		System.out.println("Calculating the average number of " + 
				"people the witch killed on year of birth of those people..");
		RepelTheWitch rtw = new RepelTheWitch();
		double average = rtw.saveTheVillager(villagers);
		System.out.println(String.format("Now, tell the witch that the average people the witch kills for this village will be %s!", average));

	}

	private static int readLineNumber(BufferedReader reader) {
		Integer result = null;
		while (result == null) {
			try {
				String line = reader.readLine();
				result = Integer.parseInt(line);
			} catch (NumberFormatException e) {
				System.out.println("Input can only be integer, please re-input the number.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;

	}

}
