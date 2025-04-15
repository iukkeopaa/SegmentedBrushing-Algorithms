/**
 * @Description: leetcode581
 * @Author: wjh
 * @Date: 2025/4/15 上午8:46
 */
public class findUnsortedSubarray {


    public static int Solution(int[] nums){

        int n = nums.length;
        if (n <= 1) {
            return 0;
        }
        int left = 0, right = -1;
        int max = nums[0];
        int min = nums[n - 1];

        // 从左到右找右边界
        for (int i = 0; i < n; i++) {
            if (nums[i] < max) {
                right = i;
            } else {
                max = nums[i];
            }
        }

        // 从右到左找左边界
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] > min) {
                left = i;
            } else {
                min = nums[i];
            }
        }

        return right - left + 1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 6, 4, 8, 10, 9, 15};
        System.out.println("需要排序的最短连续子数组的长度为: " + findUnsortedSubarray(nums));
    }
}

