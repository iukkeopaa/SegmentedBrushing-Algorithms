/**
 * @Description:
 * @Author: wjh
 * @Date: 2025/4/15 上午8:16
 */
public class IsSubsequence {

    public static boolean Solution(String s,String t){


        if (s.length()==0) return true;

        for (int i = 0, j = 0; j < t.length(); j++) {

            if (s.charAt(i) == t.charAt(j)) {
                // 若已经遍历完 s ，则提前返回 true
                if (++i == s.length())
                    return true;
            }

        }
        return false;

    }
}
