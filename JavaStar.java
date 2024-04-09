import java.util.Scanner; 
	public class JavaStar {
		public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
             int multipliedByOne = 1;		


		int number = 0;
		int column = 1 + 1;		

		System.out.print("Enter a number");
		number = input.nextInt();		

		for(int row = 1; row <= number; row++) {
			System.out.println(" ");
		
		for(column = 1; column <= row; column++) {
			
			System.out.print("* ");
			}
			}
		}
}