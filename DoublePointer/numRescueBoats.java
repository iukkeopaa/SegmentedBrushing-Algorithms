import java.util.Arrays;

/**
 * @Description: leetcode881
 * @Author: wjh
 * @Date: 2025/4/15 上午9:13
 */
public class numRescueBoats {

    public static int Solution(int[] people, int limit){
        Arrays.sort(people);

        int l = 0;
        int r = people.length - 1;
        int cnt = 0;

        while (l <= r) {
            if (people[l] + people[r] <= limit)
                l++;
            cnt++;
            r--;
        }

        return cnt;
    }

}
