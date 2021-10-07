import java.util.Scanner;
import java.lang.Math; 

public class Pot {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int len = keyboard.nextInt();
		int num = 0;
		int power = 0;
		int sum = 0;
		for(int i = 0; i < len; i ++) {
			num = keyboard.nextInt();
			power = num % 10;
			num /= 10;
			sum += (int) Math.pow(num,power);
			
			
			
			
		}
		System.out.println(sum);

	}

}
