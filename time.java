import java.util.Scanner;
import java.lang.Math;
public class math {
	public static void main(String args[]){
		int hour = 0;
		int min = 0;
		int sec = 0;
	
		Scanner scnr = new Scanner(System.in);
		int userSec = scnr.nextInt();
		
		sec = userSec % 60;
		min = userSec / 60;
		hour = min / 60;
		min = min % 60;
		System.out.print(userSec + " is " + hour + ":" + min + ":" + sec);
	}
}
