import java.util.Scanner;

/**
 * 
 * 
 * 
 * @author Noah Burnette
 * @date 5 February, 2021
 * @version 1.0
 * 
 * Problem:
 * You have a single 3D printer, and would like to use it to produce n statues. 
 * However, printing the statues one by one on the 3D printer takes a long time, 
 * so it may be more time-efficient to first use the 3D printer to print a new printer. 
 * That new printer may then in turn be used to print statues or even more printers. 
 * Print jobs take a full day, 
 * and every day you can choose for each printer in your possession to have it print a statue, 
 * or to have it 3D print a new printer (which becomes available for use the next day).
 *
 * What is the minimum possible number of days needed to print at least n statues?
 * 
 */

public class statuesAndPrinters {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		// TODO Auto-generated method stub
		/*
		 * input:# of statues needed
		 * output: # of days it will take
		 * 
		 * create a day counting variable.
		 * while loop{
		 * Make printers everyday until (# of printers * 2 > # of statues needed)
		 * Then add two days because it will only take that amount of time to make all the statues
		 * }
		 */
		int statuesNeed = keyboard.nextInt();
		int statuesHave = 0;
		int printersHave = 1;
		int numOfDays = 1;
		
		while (statuesNeed >= statuesHave && printersHave != statuesNeed ) {
			if(printersHave * 2 > statuesNeed) {
				numOfDays += 1;
				statuesHave = printersHave * 2;
				
			}
			else {
				printersHave = printersHave * 2;
				numOfDays += 1;
			}
			
		}
		System.out.println(numOfDays);
	}

}
