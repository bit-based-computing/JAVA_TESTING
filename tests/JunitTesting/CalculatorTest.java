package JunitTesting;

import org.junit.Assert;
import org.junit.Test;



public class CalculatorTest {

    @Test
    public void testAddIntInt(){
        Calculator calculator = new Calculator();
        int a = 6 , b = 10;
        int actual = calculator.add(a,b);
        Assert.assertEquals(16,actual);
    }

    @Test
    public void testAddIntArray(){
        int[] intArray = {1,2,3,4,5,6,7,8,9,10};
        Calculator calculator = new Calculator();
        int actual = calculator.add(intArray);
        Assert.assertEquals(55, actual);
    }
}