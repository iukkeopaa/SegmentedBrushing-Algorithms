import java.util.Arrays;

/**
 * @Description: leetcode825
 * @Author: wjh
 * @Date: 2025/4/15 上午9:36
 */
public class numFriendRequests {
    public static int Solution(int[] ages){
        Arrays.sort(ages);
        int l = 0, r = 0, ans = 0;
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] <= 14)
                continue;
            while (ages[l] <= 0.5 * ages[i] + 7)
                l++;
            while (r + 1 < ages.length && ages[r + 1] <= ages[i])
                r++;
            ans += r - l;
        }
        return ans;
    }


    }

