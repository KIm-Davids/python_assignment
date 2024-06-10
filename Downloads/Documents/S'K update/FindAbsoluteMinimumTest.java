import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindAbsoluteMinimumTest {

	@Test
	public void testThatThenumberInputtedIsTheAbosluteMiinimum() {
		FindAbsoluteMinimum findMinimum = new FindAbsoluteMinimum();
		int[] array = {1,3,5,4,8,2,4,3,6,5,9};
		int x = 3;
		int y = 2; 
		
		int number = findMinimum.findAbsolute(array, x,y);
		int expectedAbsoluteNumber = 2;

		assertEquals(expectedAbsoluteNumber, number);
		
	}
}