/**
 * @Description: leetcode80
 * @Author: wjh
 * @Date: 2025/4/15 上午8:50
 */
public class removeDuplicatesII {

    public static int Solution(int[] nums) {
        int stackSize = 2; // 栈的大小，前两个元素默认保留
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[stackSize - 2]) { // 和栈顶下方的元素比较
                nums[stackSize++] = nums[i]; // 入栈
            }
        }
        return Math.min(stackSize, nums.length);
    }



    public static int Solution2(int[] nums){


        return process(nums,2);
    }

    private static int process(int[] nums, int k) {
        int u = 0;
        for (int x : nums) {
            if (u < k || nums[u - k] != x) nums[u++] = x;
        }
        return u;
    }


    }

