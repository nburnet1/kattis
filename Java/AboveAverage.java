import java.util.Arrays;
import java.util.Scanner;
/**
 * 
 * @author Noah Burnette
 * @date 3/6/21
 * @version 1.0
 *
 */
public class AboveAverage {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		// First Input. Used to see how many test cases there are.
		int numCases = keyboard.nextInt();
		keyboard.nextLine();
		int x = 0;
		double[] outputArray = new double[numCases]; 
		//While loop splits the string of the second input into a double array
		while(x < numCases) {
			
			String students = keyboard.nextLine();
			String[] inputArray = students.split(" ");
			int[] inputArrayInt = Arrays.stream(inputArray).mapToInt(Integer::parseInt).toArray();
			int totalPoints = 0;
			
			// this for loop adds the total points of the students' grades.
			for(int i = 1; i < inputArrayInt.length; i++) {
				totalPoints += inputArrayInt[i];		
			}//for i < inputArrayInt.length
			
			double average = totalPoints/inputArrayInt[0];
			
			double aboveAverageStudents = 0;
			//Second for loop counts how many students are above the average of the grades
			for(int i = 1; i < inputArrayInt.length; i++) {
				
				if(inputArrayInt[i] > average) {
					aboveAverageStudents ++;
				}//Conditional(inputArrayInt[i] > average)
				
			}//for i < inputArrayInt.length (for aboveAverageStudents)
			
			double aboveAverageAverage = (aboveAverageStudents/inputArrayInt[0] * 100) ;
			outputArray[x] = aboveAverageAverage;
			x ++;
			
		}//while
		
		//Last for loop properly rounds and prints the percentage of students that are above average
		for(int i = 0; i < outputArray.length; i++) {
			outputArray[i] = outputArray[i] * 1000;
			outputArray[i] = Math.round(outputArray[i]);
			outputArray[i] = outputArray[i]/1000;
			System.out.printf("%1.3f",outputArray[i]);
			System.out.print("%\n");
		}//for i < outputArray
	}//main
}//class
