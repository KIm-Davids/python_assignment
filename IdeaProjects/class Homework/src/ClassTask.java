import java.util.Arrays;
import java.util.HashSet;

public class ClassTask {

    public static Object[] removeDuplicates(int[] collectInput) {
       HashSet<int[]> set = new HashSet<>();
       int[] newArray = new int[collectInput.length];
       set.add(collectInput);

        return set.toArray();
    }
    public static void main(String[] args) {
        int[] numbers = {1,1,2,3,3,4};
        System.out.println(Arrays.toString(removeDuplicates(numbers)));
    }
}
