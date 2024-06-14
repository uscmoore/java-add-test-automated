import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testAddNumbers() {
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        int result = Main.addIntegers(a, b);
        System.out.println("Generated numbers: " + a + ", " + b + "\n" +
                "Should be: " + (a + b) + "\n" +
                "Got: " + result);
        assertEquals(a + b, Main.addIntegers(a, b));
    }
}
