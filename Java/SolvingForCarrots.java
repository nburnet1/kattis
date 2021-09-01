/**
 * 
 * @author Noah Burnette
 * @version 1.0
 * @date 8/19/21
 * @class CSCI202
 * 
 */

import java.util.Scanner;
public class SolvingForCarrots {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String[] input = keyboard.nextLine().split(" ");
		
		int[] inputInt = new int[2]; 
		for(int i = 0; i < input.length; i ++) {
			inputInt[i] = Integer.parseInt(input[i]);
		}
		
		for(int i = 0; i < inputInt[0]; i ++) {
			String strInput = keyboard.nextLine(); 
		}
		
		System.out.println(inputInt[1]);
		
		

	}

}
