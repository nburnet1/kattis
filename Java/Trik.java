import java.util.Scanner;

/**
 * 
 * @author Noah Burnette
 *
 */
public class Trik {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String input = keyboard.nextLine();
		String inptarr[] = input.split("");
		int position = 1;
		
		for(int i = 1; i < inptarr.length; i ++) {
			if(inptarr[i].equals("A") && inptarr[i-1].equals("A"))
				position = 1;
			else if(inptarr[i].equals("A"))
				position = 2;
			if(inptarr[i].equals("B") && inptarr[i-1].equals("B"))
				position = 2;
			else if(inptarr[i].equals("B"))
				position = 3;
			if(inptarr[i].equals("C") && inptarr[i-1].equals("C"))
				position = 1;
			else if(inptarr[i].equals("C"))
				position = 3;
			
		}
		System.out.println(position);

	}

}
