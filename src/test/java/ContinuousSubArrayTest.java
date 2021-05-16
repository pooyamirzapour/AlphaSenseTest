import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContinuousSubArrayTest {

    @Test
    void isExistTest() {
        assertTrue(ContinuousSubArray.isExist(new int[]{1, 2, 3, 4, 5, 8, 100, 1}, 101));
        assertTrue(ContinuousSubArray.isExist(new int[]{1, 2, 3, 4, 7}, 7));
        assertFalse(ContinuousSubArray.isExist(new int[]{1, 2, 3, 4}, 8));
        assertTrue(ContinuousSubArray.isExist(new int[]{1, 2, 3, 4, 5, 8, 100, 1}, 108));
        assertTrue(ContinuousSubArray.isExist(new int[]{1, 2, 3, 4, 5, 8, 100, 1}, 1));
        assertTrue(ContinuousSubArray.isExist(new int[]{1, 2, 3, 4, 5, 8, 100, 1}, 13));
        assertTrue(ContinuousSubArray.isExist(new int[]{1, 2, 3, 4, 5, 8, 100, 1}, 3));
        assertTrue(ContinuousSubArray.isExist(new int[]{1, 2, 3, 4, 5, 8, 100, 150}, 150));
        assertTrue(ContinuousSubArray.isExist(new int[]{1, 2, 3, 4, 5}, 15));
        assertFalse(ContinuousSubArray.isExist(new int[]{1, 2, 3, 4, 5}, 0));
        assertTrue(ContinuousSubArray.isExist(new int[]{1, 2, 3, 0, 5}, 0));
        assertThrows(IllegalArgumentException.class, () -> ContinuousSubArray.isExist(null, 0));

    }
}
