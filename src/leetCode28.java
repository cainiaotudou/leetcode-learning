/*
实现 strStr() 函数。

给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。

示例 1:

输入: haystack = "hello", needle = "ll"
输出: 2
示例 2:

输入: haystack = "aaaaa", needle = "bba"
输出: -1
 */
public class leetCode28 {
    public static void main(String[] args){
        String haystack="mississippi";
        String needle="issip";
        System.out.println(strStr(haystack,needle));
    }
    public static int strStr(String haystack, String needle) {
        int j =0;int len=haystack.length();int i;
        for( i =0;i<len;i++){
            if(j>=needle.length()){
                break;
            }
            if(haystack.charAt(i)==needle.charAt(j)){
                j++;
            }else{
                i=i-j;
                j=0;
            }
        }
        if(j==needle.length()){
            return  i-needle.length();
        }
            return -1;

    }
}
