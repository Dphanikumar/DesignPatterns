import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysSort {

	public String toString() {

		String out = "[";

		List<Character> charsList = new ArrayList<Character>();

		charsList.add('a');
		charsList.add('z');

		charsList.add('c');

		charsList.add('f');

		charsList.add('r');

		charsList.add('g');

		charsList.add('k');

		charsList.add('o');

		charsList.add('q');

		charsList.add('p');

		// sorting the characters and adding to the new List of charcters
		List<Character> list = charsList.stream().sorted().collect(Collectors.toList());

		for (Character character : list) {
			out += character + " ";
		}

		return out.trim() + "]";

	}

	public static void main(String[] args) {

		ArraysSort arraysSort = new ArraysSort();
		System.out.println(arraysSort.toString());

	}

}
