public class ContinuousSubArray {

    public static void main(String[] args) {
        int[] ints = new int[]{1, 2, 3, 4, 5, 8, 100, 1};
         System.out.println(isExist(ints, 18));
    }

    public static boolean isExist(int[] array, int target) {
        int sum = 0;
        int backIndex = 0;
        int frontIndex = 0;
        for (int index = 0; index <= array.length; index++) {
            if (sum == target)
                return true;
            if (sum > target) {
                index = backIndex + 1;
                sum = sum - array[backIndex];
                backIndex++;
            } else {
                sum = sum + array[frontIndex];
                frontIndex=index+1;

            }
        }
        return false;
    }

    public static boolean isExistWhile(int[] array, int target) {
        int start = 0, end = 0;

        int currSum = 0;

        while (start < array.length && end <= array.length) {
            if (currSum == target) {

                if (end <= array.length - 1) {
                    currSum += array[end];
                }
                end++;

            } else {

                if (currSum > target) {
                    currSum -= array[start];
                    start++;
                } else {

                    if (end <= array.length - 1) {
                        currSum += array[end];
                    }
                    end++;
                }
            }
        }
        return true;
    }
}
