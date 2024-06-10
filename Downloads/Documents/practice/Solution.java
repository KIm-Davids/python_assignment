public class Solution {
    public static int searchInsert(int[] nums, int target) {
      
        int number = 0;
	int notIncludedNumber = 0;
        for(int counter = 0; counter < nums.length; counter++){
            if(target == nums[counter]){
                number = counter;
                return number;
            }
	}       
	for(int numbers = 0; numbers < nums.length; numbers++){
		 nums[numbers] = target;
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
			return notIncludedNumber;		
 }				
 						       
           



	public static void main(String[] args){
		
		int target = 2;
		int[] array = {1,3,5,6};
		System.out.print(searchInsert(array, target));
	}

}