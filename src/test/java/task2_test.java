import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task2_test {

    @Test
    public void test_min() {
        int[] numbers = {1, 5, 4, 3, 2};
        assertEquals(1, task2._min(numbers));
    }

    @Test
    public void test_max() {
        int[] numbers = {1, 5, 4, 3, 2};
        assertEquals(5, task2._max(numbers));
    }

    @Test
    public void test_sum() {
        int[] numbers = {1, 5, 4, 3, 2};
        assertEquals(15, task2._sum(numbers));
    }

    @Test
    public void test_mult() {
        int[] numbers = {1, 5, 4, 3, 2};
        assertEquals(120, task2._mult(numbers));
    }
}