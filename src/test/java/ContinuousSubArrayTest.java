import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ContinuousSubArrayTest {

    @Test
    void isExistTest() {
        assertEquals(true, ContinuousSubArray.isExist(new int[]{1, 2, 3, 4, 5, 8, 100, 1},101));
        assertEquals(true, ContinuousSubArray.isExist(new int[]{1, 2, 3, 4, 7},7));
        assertEquals(false, ContinuousSubArray.isExist(new int[]{1, 2, 3, 4},8));
        assertEquals(true, ContinuousSubArray.isExist(new int[]{1, 2, 3, 4, 5, 8, 100, 1},108));
        assertEquals(true, ContinuousSubArray.isExist(new int[]{1, 2, 3, 4, 5, 8, 100, 1},1));
        assertEquals(true, ContinuousSubArray.isExist(new int[]{1, 2, 3, 4, 5, 8, 100, 1},13));
        assertEquals(true, ContinuousSubArray.isExist(new int[]{1, 2, 3, 4, 5, 8, 100, 1},3));
        assertEquals(true, ContinuousSubArray.isExist(new int[]{1, 2, 3, 4, 5, 8, 100, 150},150));

    }
}
