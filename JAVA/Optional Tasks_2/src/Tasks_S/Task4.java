package Tasks_S;
import java.util.Scanner;
public class Task4 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целые числа: ");
        int value = scanner.nextInt();
        int sum = 0;
        int com = 1;
        while (value != 0) {  //подсчитать сумму чисел
            sum = sum + value % 10;
            value = value / 10;
        }
        System.out.println("Cумма введённых чисел: " + sum);
       /* while (value != 0) {   //подсчитать произведения чисел
            com *= value % 10;
            value = value / 10;
        }
        System.out.println("Произведение введённых чисел: " + com);*/

	}
}
