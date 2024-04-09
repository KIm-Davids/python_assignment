import java.util.Scanner;
	public class StudentSCore {
		public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);

		
		
		int studentFailed = 0;
		int studentPassed = 0;
		
		for(int counter = 1; counter <= 15; counter++) {
			System.out.print("Enter a score for student");
			int userInput = input.nextInt();	


			if(userInput < 45) {
			studentFailed++;
			}
			
			if(userInput >= 45) {
			studentPassed++;
			}
		}
			System.out.println("These are the students that failed " +studentFailed);
			System.out.print("These are the students that passed " +studentPassed);
	}
}