import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double total = 0;
		double average;
		double maximum = Double.MIN_VALUE;
		double minimum = Double.MAX_VALUE;
			
		int count = 0;
		while (count < 5) {
			System.out.print("Enter a floating-point value: ");
			if (scanner.hasNextDouble()) {
				double value = scanner.nextDouble();
				total += value;
				if (value > maximum) {
					maximum = value;
				}
				if (value < minimum) {
					minimum = value;
				}
				count++;
			} else {
				System.out.println("Invalid input. Please enter a valid floating-point value.");
				scanner.next();
			}
		}
		average = total /5;
		double interest = total * 0.20;
		System.out.println("TOtal: " + total);
		System.out.println("Average: " + average);
		System.out.println("Maximum: " +maximum);
		System.out.println("Minimum: " +minimum);
		System.out.println("Interest on total at 20%: " + interest);
			
		scanner.close();
	}
}

