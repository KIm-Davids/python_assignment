function evenIndex(collectInput){
	
	let evenIndexNumbers = []
	
	for(counter = 0; counter < collectInput.length; counter++){

		if(counter% 2 === 0){
		evenIndexNumbers.push(collectInput[counter]);

		}


		

	}
		return evenIndexNumbers;


}


sample_array = [1,5,3,3,5,6,7,8,9,10];

for(index = 0; index < 1; index++){
console.log(evenIndex(sample_array));
}