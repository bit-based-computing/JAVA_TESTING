package JunitTesting;

import org.junit.*;

public class UnitTestCase {
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Running before all method ");
    }

    @Before
    public void before(){
        System.out.println("Running before every method but after beforeClass");
    }

    @Test
    public void method1(){
        System.out.println("Method one running");
    }

    @Test
    public void method2(){
        System.out.println("Method two running");
    }

    @After
    public void after(){
        System.out.println("Running after every  method but before afterClass");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Running after all method");
    }
}
