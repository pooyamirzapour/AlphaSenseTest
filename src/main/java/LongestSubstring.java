import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

    public static int longest(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("The given string is not valid");
        }
        Map<Character, Integer> map = new HashMap<>();
        Integer maxDistance = 0;
        Integer validPosition = 0;
        for (int index = 0; index < str.length(); index++) {
            Integer position = map.get(str.charAt(index));
            map.put(str.charAt(index), index);
            if (position == null) {
                if (validPosition == 0)
                    maxDistance++;
                else {
                    int distance = index - validPosition + 1;
                    if (maxDistance < distance)
                        maxDistance++;
                }
            } else {
                validPosition = position + 1;
                int distance = index - validPosition;
                if (maxDistance < distance)
                    maxDistance = distance;
            }
        }
        return maxDistance;
    }

}

