package ch.gbssg.edu.franjic.franjo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

 

public class myCalculatorTest {
    
    @Test
    void test_sum() {
        Calculator myCalc = new Calculator();
        assertEquals(57,myCalc.sum(45, 12));
    }
    @Test
    void test_diff() {
        Calculator myCalc = new Calculator();
        assertEquals(33,myCalc.diff(45, 12));
    }
}