package Tasks_S;

import java.util.Scanner;

public class Task2 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Введите последовательность цифр: ");
        int value = scanner.nextInt();
        int mirror = 0;
        while (value != 0) {
            mirror = mirror * 10 + (value % 10);
            value = value / 10;
        }
        System.out.print("Введите обраную последовательность цифр: " + mirror);
	}
}
