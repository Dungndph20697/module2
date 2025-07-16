package hoc;


import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        int x = 1;
        int y = 1;
        Calculator instance = new Calculator();
        int expResult = 2;
        int result = instance.add(x, y);
    }
}
