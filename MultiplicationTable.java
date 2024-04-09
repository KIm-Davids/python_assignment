import java.util.Scanner;
	public class MultiplicationTable {
		public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		int multiplication = 0;
		System.out.print("Enter a number ");
		int userInput = input.nextInt();

		for(int counter = 1; counter <= 10; counter++) {
	
		multiplication = userInput * counter;
	
		System.out.println(userInput + " x " + counter + " = " + multiplication);
		
				}
			}
		}