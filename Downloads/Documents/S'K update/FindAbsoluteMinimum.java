import java.util.Arrays;
public class FindAbsoluteMinimum {
	public  int findAbsolute(int[] collectInput, int firstNumber, int secondNumber) {
		
		int movedNumber = 0;
		int number = 0;		
		int absolute = 0;
		
		for(int counter = 0; counter < collectInput.length; counter++){
				if(firstNumber == collectInput[counter] ){
					 movedNumber = counter;	
				}
				if(secondNumber == collectInput[counter]){
					 number= counter;
				}
				absolute = Math.abs(movedNumber - number);

				if(Math.abs(movedNumber - number)<absolute){
					absolute = Math.abs(movedNumber - number);
				}
				
			}
			 	return absolute;
	}				
}		