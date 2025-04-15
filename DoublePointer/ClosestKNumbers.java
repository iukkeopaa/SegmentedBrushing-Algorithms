import java.util.ArrayList;
import java.util.List;

/**
 * @Description: leetcode658
 * @Author: wjh
 * @Date: 2025/4/15 上午9:31
 */
public class ClosestKNumbers {

    public static List<Integer> Solution(int[] arr, int k, int x){

        int left = 0;
        int right = arr.length - k;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (Math.abs(arr[mid] - x) > Math.abs(arr[mid + k] - x)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = left; i < left + k; i++) {
            result.add(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        ClosestKNumbers solution = new ClosestKNumbers();
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        int x = 3;
        List<Integer> closestElements = Solution(arr, k, x);
        System.out.println(closestElements);
    }
    }
}
