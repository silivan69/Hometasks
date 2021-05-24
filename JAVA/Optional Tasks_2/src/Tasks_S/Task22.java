package Tasks_S;

public class Task22 {
	 public static void main(String[] args) {
		 
	        int a = 30;
	        int b = 10;
	        int c = 20;
	        int sum = a + b + c;
	        int i = 0;
	        while (i != sum) {
	            if (i == a || i == b || i == c) {
	                System.out.println(i);
	            }
	            i++;
	        }
}
}