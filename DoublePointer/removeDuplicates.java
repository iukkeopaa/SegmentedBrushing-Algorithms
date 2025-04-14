/**
 * @Description: leetcode26
 * @Author: wjh
 * @Date: 2025/4/14 上午9:16
 */
public class removeDuplicates {

    public static int Solution1(int[] nums) {
        int left = 0;
        int right = 0;
        while (right < nums.length) {
            while (right + 1 < nums.length && nums[right] == nums[right + 1]) {
                right++;
            }
            if (right < nums.length) {
                nums[left++] = nums[right++];
            }
        }
        return left + 1;
    }



    public int Solution2(int[] nums) {

        int n = nums.length;

        int j = 0;

        for (int i = 0 ; i < n ; i++) {

            if ( i == 0 || nums[i] != nums[i - 1]) {


                j++;
            }
        }

        return j ;
    }

    public int Solution3(int[] nums) {
        int n = nums.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }

    public int Solution4(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int p = 0;
        int q = 1;
        while(q < nums.length){
            if(nums[p] != nums[q]){
                nums[p + 1] = nums[q];
                p++;
            }
            q++;
        }
        return p + 1;
    }

}
