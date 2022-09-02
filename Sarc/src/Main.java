//Omar Alshafei
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScan = new Scanner (System.in);
		int distance = 20;
		int drive = 0;
		System.out.println(distance+" feet away");
		do {
			
		System.out.print("How far did you drive: ");
		drive = myScan.nextInt();
		
		if (drive > distance) {
			distance = drive - distance;
			System.out.println(distance+" feet away");
			drive = 0;
			
		}
		else if (drive < distance) {
			distance = distance - drive;
			System.out.println(distance+" feet away");
			drive = 0;
		}
					
	}while (drive != distance);
	
	System.out.println("You reched your destination");

		}	
}
