public class ContinuousSubArray {

    public static boolean isExist(int[] array, int target) {
        int sum = 0;
        int backIndex = 0;
        int frontIndex = 0;
        for (int index = 0; index <= array.length; index++) {

            if (sum == target )
                return true;
            if ( index<= array.length-1 && array[index]==target)
                return true;
            if (sum > target) {
                index = backIndex + 1;
                sum = sum - array[backIndex];
                backIndex++;
            } else {
                sum = sum + array[frontIndex];
                frontIndex = index + 1;
                if (frontIndex > array.length)
                    return false;
            }
        }
        return false;
    }


}
