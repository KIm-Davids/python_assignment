public class MultiplesOf10 {
	public static void main(String[] args) {
		
	int multiples = 1;
	int count = 1;
	int number_to_times = 10;	
	int number_to_check = 0;
	int sum = 1;
	for(count = 10; count <= 20000; count++) {
		if(count % 10 == 0){
		sum += count;	
	}	
	}
	System.out.print(sum);
}
}