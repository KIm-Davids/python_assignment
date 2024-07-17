import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {4, 6, 9};
        ArrayList<Integer> factors = new ArrayList<>();

            for (int counter = 1; counter < numbers.length; counter++) {
               // if (numbers[counter] % counter == 1) {
                    factors.add(numbers[counter] / 2);
                //}
//            else{
//                factors[counter] = numbers[counter];
//            }
                System.out.println(factors);
            }

        }
    }