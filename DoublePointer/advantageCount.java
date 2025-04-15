import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @Description: leetcode870
 * @Author: wjh
 * @Date: 2025/4/15 上午9:22
 */
public class advantageCount {

    public static int[] Solution(int[] nums1, int[] nums2){

        int n = nums1.length;
        Arrays.sort(nums1);

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for (int i = 0; i < n; i++) {
            maxHeap.offer(new int[]{i, nums2[i]});
        }

        int left = 0, right = n - 1;
        int[] result = new int[n];

        while (!maxHeap.isEmpty()) {
            int[] cur = maxHeap.poll();
            int index = cur[0], val = cur[1];
            if (nums1[right] > val) {
                result[index] = nums1[right];
                right--;
            } else {
                result[index] = nums1[left];
                left++;
            }
        }
        return result;
    }


}
