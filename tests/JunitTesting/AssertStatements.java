package JunitTesting;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.fail;

public class AssertStatements {

    @Test
    public void testFail(){
        fail("to fail a test");
    }

    @Test
    public void testAssertTrue(){
        Assert.assertTrue("Yest this is true", 5 > 2);
    }

    @Test
    public void testAssertFalse(){
        Assert.assertFalse("Yes this is false", 5 > 10);
    }

    @Test
    public void testAssertEquals(){
        Assert.assertEquals("Yes this is equal", 2,2);
    }

    @Test
    public void testAssertNull(){
        Calculator calculator = null;
        Assert.assertNull("Yes this is null", calculator);
    }

    @Test
    public void testAssertNotNull(){
        Calculator calculator = new Calculator();
        Assert.assertNotNull("Yes this not null", calculator);
    }

    @Test
    public void testAssertSame(){
        Calculator calculator1 = new Calculator();
        Calculator calculator2 = calculator1;
        Assert.assertSame("Yes they refer same class referance", calculator1, calculator2);
    }

    @Test
    public void testAssertNotSame(){
        Calculator calculator1 = new Calculator();
        Calculator calculator2 = new Calculator();
        Assert.assertNotSame("Yes they are not same object", calculator1, calculator2);
    }


}
