import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

示例 1:

输入: "abcabcbb"
输出: 3
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
示例 2:

输入: "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
示例 3:

输入: "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
public class leetCode03 {

    public static void main(String[] args) {
        int res = lengthOfLongestSubstring("a");
        System.out.println(res);
    }

    //方法2
    public static int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int res = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        //取res1=1就可以解决字符串长度为1的情况
        for (int i = 0, j = 0; j < len; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
                //第一个出现的重复字节，它的第一位下标是i ...
                //第n个出现的重复字节，它的第一位下标是i
            }
            //如果没出现重复，i=0，最大长度就一直是字符串自身的长度 j+1
            //如果这一次循环中出现重复，就会立刻改变i的值，重复字节第一个下标为i，第二个下标为j+1，子串的长度就为j-i+1
            res = Math.max(res, j + 1 - i);
            map.put(s.charAt(j), j + 1);//从j+1开始方便计算没有重复的字符串的长度
        }
        return res;
    }

    //方法一超出时间限制
    public static int lengthOfLongestSubstring1(String s) {
        int len = s.length();
        int res = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                if (Check(s, i, j)) {
                    res = Math.max(res, j - i);
                }
            }
        }
        return res;
    }

    public static Boolean Check(String s, int start, int end) {
        Set<Character> set = new HashSet<Character>();
        for (int x = start; x < end; x++) {
            if (set.contains(s.charAt(x))) {
                return false;
            }
            set.add(s.charAt(x));
        }
        return true;
    }


}
