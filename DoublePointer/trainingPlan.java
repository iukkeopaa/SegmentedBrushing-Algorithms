/**
 * @Description:
 * @Author: wjh
 * @Date: 2025/4/15 上午8:25
 */
public class trainingPlan {

    public static int[] Solutions(int[] actions){
        int i = 0, j = actions.length - 1, tmp;
        while(i < j) {
            while(i < j && (actions[i] & 1) == 1) i++;
            while(i < j && (actions[j] & 1) == 0) j--;
            tmp = actions[i];
            actions[i] = actions[j];
            actions[j] = tmp;
        }
        return actions;
    }


    public int[] exchange(int[] nums) {
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            if ((nums[fast] & 1) == 1) {//奇数
                if (slow != fast) {
                    nums[slow] ^= nums[fast];
                    nums[fast] ^= nums[slow];
                    nums[slow] ^= nums[fast];
                }
                slow++;
            }
            fast++;
        }
        return nums;
    }
}

