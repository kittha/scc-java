import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {

    @Test
    @DisplayName("สวัสดี corgi")
    public void chkHello(){
        Hello hello = new Hello();
        String actualResult = hello.sayHi("corgi");
        assertEquals("Hello, corgi", actualResult);
    }
}
