import java.util.Arrays;
import java.util.Scanner;
/**
 * 
 * @author Noah Burnette
 * @date 3/7/21
 * @version 1.0
 *
 */
public class Shopaholic {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int itemsBought = keyboard.nextInt();
		keyboard.nextLine();
		String cost = keyboard.nextLine();
		String[] costArray = cost.split(" ");
		int[] costArrayInt = Arrays.stream(costArray).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(costArrayInt);
		int itemRemainder = itemsBought % 3;
		int moneySaved = 0;
		
		for(int i = itemRemainder; i < itemsBought; i += 3) {
			moneySaved += costArrayInt[i];
			
			
		}//for i < itemsBought
		System.out.println(moneySaved);
	}//main
}//class
