package test;

import static org.junit.jupiter.api.Assertions.*;

import MyCollection.MyArrayList;
import org.junit.jupiter.api.Test;

public class MyArrayListTest {

    MyArrayList myArrayList = new MyArrayList();

    @Test
    public void testThatMyArrayListIsEmpty(){
        assertTrue(myArrayList.isEmpty());
    }

    @Test
    public void testThatMyArrayListCanAdd(){

    }


}
