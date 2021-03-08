import java.util.Scanner;
/**
 * 
 * @author Noah Burnette
 * @date 3/6/21
 * @version 1.0
 *
 */
public class AstrologicalSigns {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int numOfStudents = keyboard.nextInt();
		keyboard.nextLine();
		String[] astroSignArray = new String[numOfStudents];
		
		for (int i = 0; i < numOfStudents; i++) {
			String bDay = keyboard.nextLine();
			String[] bDayArray = bDay.split(" ");
			int bDayTotalMonth = 0;
			int bDayDay = Integer.parseInt(bDayArray[0]);
			
			switch(bDayArray[1]) {
			case "Feb" : bDayTotalMonth = 31; break;
			case "Mar" : bDayTotalMonth = 59; break;
			case "Apr" : bDayTotalMonth = 90; break;
			case "May" : bDayTotalMonth = 120; break;
			case "Jun" : bDayTotalMonth = 151; break;
			case "Jul" : bDayTotalMonth = 181; break;
			case "Aug" : bDayTotalMonth = 212; break;
			case "Sep" : bDayTotalMonth = 243; break;
			case "Oct" : bDayTotalMonth = 273; break;
			case "Nov" : bDayTotalMonth = 304; break;
			case "Dec" : bDayTotalMonth = 334; break;
			}//switch bDayArray[1]
			
			String astroSign = "";
			int totalDate = bDayTotalMonth + bDayDay;
			if(totalDate <= 20 || totalDate >= 356)
				astroSign = "Capricorn";
			else if(totalDate <= 50)
				astroSign = "Aquarius";
			else if(totalDate <= 79)
				astroSign = "Pisces";
			else if(totalDate <= 110)
				astroSign = "Aries";
			else if(totalDate <= 140)
				astroSign = "Taurus";
			else if(totalDate <= 172)
				astroSign = "Gemini";
			else if(totalDate <= 203)
				astroSign = "Cancer";
			else if(totalDate <= 234)
				astroSign = "Leo";
			else if(totalDate <= 264)
				astroSign = "Virgo";
			else if(totalDate <= 295)
				astroSign = "Libra";
			else if(totalDate <= 326)
				astroSign = "Scorpio";
			else if(totalDate <= 355)
				astroSign = "Sagittarius";
			
			astroSignArray[i] = astroSign;	
		}//for  i < numOfStudents
		for (int i = 0; i < numOfStudents; i ++) {
			System.out.println(astroSignArray[i].toString());
		}// for prints astrological signs

	}//main

}//class
