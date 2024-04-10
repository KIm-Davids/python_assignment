public class MultiplesOf10 {
	public static void main(String[] args) {
		
	int count = 1;
	int sum = 1;
	for(count = 10; count <= 20000; count++) {
		if(count % 10 == 0){
		sum += count;	
	}	
	}
	System.out.print(sum);
}
}
