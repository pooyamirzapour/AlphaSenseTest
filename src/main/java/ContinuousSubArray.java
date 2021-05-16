import java.util.Arrays;

public class ContinuousSubArray {

    public static void main(String[] args) {
        System.out.println(isExist(new int[]{1, 2, 3, 4}, 8));
    }

    public static boolean isExist(int[] array, int target) {
        if (array == null || array.length == 0 || Arrays.stream(array).anyMatch(p -> p < 0)) {
            throw new IllegalArgumentException("The given array is not valid");
        }
        if (target == 0) {
            return (Arrays.stream(array).anyMatch(p -> p == 0));
        }

        int sum = 0;
        int backIndex = 0;
        int frontIndex = 0;
        for (int index = 0; index <= array.length; index++) {
            if (sum == target)
                return true;
            if (index <= array.length - 1 && array[index] == target)
                return true;
            if (sum > target) {
                index = backIndex + 1;
                sum = sum - array[backIndex];
                backIndex++;
            } else {
                if (frontIndex <= array.length - 1)
                    sum = sum + array[frontIndex];
                frontIndex = index + 1;
                if (frontIndex > array.length)
                    return false;
            }
        }
        return false;
    }


}
