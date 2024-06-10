import java.util.Arrays;
import java.util.ArrayList;
public class SolutionDebug {
	public static void main(String[] args){
      
	int target = 2;
	int[] nums = {1,3,5,6};
	ArrayList<Integer> newNumber = new ArrayList<Integer>();
	int number = 0;
	int notIncludedNumber = 0;


	for(int addNumberToArray = 0; addNumberToArray < nums.length; addNumberToArray++){
		if(target != nums[addNumberToArray]){
		 	newNumber.add(target);
			int result = newNumber.get(addNumberToArray)
			System.out.print(result);
		}
	}
  
        for(int counter = 0; counter < nums.length; counter++){
            if(target == nums[counter]){
                number = counter;
                System.out.println("The number is; " + number);
            }
	}       

	for(int numbers = 0; numbers < nums.length; numbers++){
	    for(int index = 0; index < nums.length - 1; index++){
		if(nums[index] < nums[numbers]){
			int temp = nums[numbers];
			nums[numbers] = nums[index];
			nums[index] = temp;
		}
		if(target == nums[index]){
			notIncludedNumber = numbers;
		}
	    }
       }		
			System.out.print(notIncludedNumber);
     }	
 }				
 						       
           




		