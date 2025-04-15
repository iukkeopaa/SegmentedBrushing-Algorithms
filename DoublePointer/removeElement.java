/**
 * @Description:
 * @Author: wjh
 * @Date: 2025/4/15 上午8:22
 */
public class removeElement {

    public static int Solution(int[] nums, int val){

        int j = nums.length - 1;
        for (int i = 0; i <= j; i++) {
            if (nums[i] == val) {
                swap(nums, i--, j--);
            }
        }
        return j + 1;
    }
    static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }


    }

