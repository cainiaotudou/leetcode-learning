/*
编写一个函数来查找字符串数组中的最长公共前缀。

如果不存在公共前缀，返回空字符串 ""。

示例 1:

输入: ["flower","flow","flight"]
输出: "fl"
示例 2:

输入: ["dog","racecar","car"]
输出: ""
解释: 输入不存在公共前缀。
说明:

所有输入只包含小写字母 a-z 。
 */
public class leetCode14 {
    public static void main(String[] args){
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==1){
            return strs[0];
        }
        String res = "";
        if(strs.length>1){
            for(int i=0;i<strs[0].length();i++){
                char curr = strs[0].charAt(i);
                for(int j = 1;j<strs.length;j++){
                    if(strs[j].length()<=i || strs[j].charAt(i)!=strs[0].charAt(i)){
                        return res;
                    }
                    if(strs[j].charAt(i)==curr && j==strs.length-1){
                        res+=curr;
                    }
                }
            }
        }
        return res;
    }
}
