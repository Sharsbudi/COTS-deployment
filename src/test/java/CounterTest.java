package src.test.java;

import static org.junit.Assert.*;
import src.main.java.*;
import org.junit.Test;

public class CounterTest {

    @Test
    public void testReset() {
        Counter testCounter = new Counter();
        
        for (int i = 0; i < 10; i++) {
            testCounter.increment();
        }
        
        testCounter.reset();
        
        assertEquals(testCounter.getCount(), 0);
    }

    @Test
    public void testIncrement() {
        Counter testCounter = new Counter();
        
        for (int i = 1; i < 10; i++) {
            testCounter.increment();
            assertEquals(testCounter.getCount(), i);
        }
    }

    @Test
    public void testDecrement() {
        Counter testCounter = new Counter();
        
        for (int i = 1; i < 10; i++) {
            testCounter.decrement();
            assertEquals(testCounter.getCount(), -i);
        }
    }

    @Test
    public void testIncreaseBy() {
        Counter testCounter = new Counter();
        testCounter.increaseBy(5);
        assertEquals(testCounter.getCount(), 5);
    }

    @Test
    public void testDecreaseBy() {
        Counter testCounter = new Counter();
        testCounter.decreaseBy(3);
        assertEquals(testCounter.getCount(), -3);
    }

    @Test
    public void testMultiplyBy() {
        Counter testCounter = new Counter();
        testCounter.increment();
        testCounter.multiplyBy(2);
        assertEquals(testCounter.getCount(), 2);
    }

    @Test
    public void testPowerBy() {
        Counter testCounter = new Counter();
        testCounter.increaseBy(2);
        testCounter.powerBy(3);
        assertEquals(testCounter.getCount(), 8);
    }

    @Test
    public void testIsCountEven() {
        Counter testCounter = new Counter();
        assertTrue(testCounter.isCountEven());
        testCounter.increment();
        assertFalse(testCounter.isCountEven());
    }
}
