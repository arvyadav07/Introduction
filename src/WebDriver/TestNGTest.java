package WebDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTest {
    @Test
    void  setup() {
        System.out.println("This is setup method.");
    }
    @Test
    void login() {
        System.out.println("This is login method.");
    }
}
