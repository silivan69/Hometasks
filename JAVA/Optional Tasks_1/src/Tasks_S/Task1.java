package Tasks_S;
import java.util.Scanner;

public class Task1 {
	public static void main(String args[]) {
		Scanner input =new Scanner(System.in);
		String name, txt;
		System.out.println("введите имя: ");
		name=input.nextLine();
		txt="Здравствуй "+name+"!";
		System.out.println(txt);
}
}

