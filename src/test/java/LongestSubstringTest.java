import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LongestSubstringTest {


    @Test
    void longestStringTest() {
        assertEquals(3, LongestSubstring.longest("abcabcbb"));
        assertEquals(1, LongestSubstring.longest("bbbbb"));
        assertEquals(3, LongestSubstring.longest("pwwkew"));
        assertEquals(3, LongestSubstring.longest("bbbbbaaabacab"));
        assertEquals(4, LongestSubstring.longest("aaaaaabacd"));
        assertEquals(3, LongestSubstring.longest("aaaaaabaaacd"));
        assertEquals(7, LongestSubstring.longest("abcdefga"));
        assertThrows(IllegalArgumentException.class, () -> LongestSubstring.longest(""));
        assertThrows(IllegalArgumentException.class, () -> LongestSubstring.longest(null));

    }


}
