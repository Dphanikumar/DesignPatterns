import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {
		int less60 = 0;
		int greater60 = 0;
		StringBuilder lessThan60 = new StringBuilder();
		StringBuilder greaterThan60 = new StringBuilder();

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 9; i++) {
			System.out.print("Enter a grade for student " + (i + 1) + ":");

			int grade = scanner.nextInt();
			if (grade < 60) {
				less60++;
				lessThan60.append("!");
			} else if (grade > 60 && grade <= 100) {
				greater60++;
				greaterThan60.append("!");
			}
	}

		System.out.println();
		System.out.println();

		System.out.println(less60 + " grades less than 60:          " + lessThan60);
		System.out.println(greater60 + " greater than or equal to 60: " + greaterThan60);

	}

}
