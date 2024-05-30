import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AcTest{

  @Test
  public void testThatAcCanOn(){
    AcButtons onTheAc = new AcButtons();
    assertTrue(onTheAc.onButton());
  }
  @Test
  public void testThatTheAcIsOn(){
    AcButtons checkTheAcIsOn = new AcButtons();
    //check if the AC is on
      assertTrue(checkTheAcIsOn.onButton());
    assertTrue(checkTheAcIsOn.digitalDisplay(23));
  }

 @Test
 public void testThatTheAcCanIncrease(){
    AcButtons checkTheAcIsOn = new AcButtons();
    AcButtons plusButton = new AcButtons();
     assertTrue(checkTheAcIsOn.onButton());
    //median temperature is 23
    assertEquals(24, plusButton.increaseAc());
 }

 @Test
 public void testThatTheAcCanDeccrease(){
     AcButtons checkTheAcIsOn = new AcButtons();
    AcButtons minusButton = new AcButtons();
     assertTrue(checkTheAcIsOn.onButton());
    //median temperature is 23
    assertEquals(22, minusButton.decreaseAc());
  }

  @Test
  public void testAcMaximumLimit(){
      AcButtons checkLimit = new AcButtons();
      //check if Ac is on
      assertTrue(checkLimit.onButton());
     // check the limit
      assertNotEquals(31, checkLimit.increaseAc());
  }

  @Test
  public void testAcMinimumLimit(){
      AcButtons checkLimit = new AcButtons();
      //check if Ac is on
      assertTrue(checkLimit.onButton());
      // check the limit
      assertNotEquals(15,checkLimit.decreaseAc());
  }

  @Test
  public void testThatTheAcCanOff(){
      AcButtons checkOffButton = new AcButtons();
      //check if the Ac can off
      assertTrue(checkOffButton.offButton());
  }

}