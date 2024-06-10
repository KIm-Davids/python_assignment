array = [1,3,5,4,8,2,4,3,6,5,9]
x = 3
y = 2
firstNumber = 0;
secondNumber = 0;
let result = 0;

for(counter = 0; counter < array.length; counter++){
	if(x == array[counter]){
		firstNumber = counter;
	}
	if(y == array[counter]){
		secondNumber = counter;
	}
		result = Math.abs(firstNumber - secondNumber);
}
		console.log(result);