/*
给定两个二进制字符串，返回他们的和（用二进制表示）。

输入为非空字符串且只包含数字 1 和 0。

示例 1:

输入: a = "11", b = "1"
输出: "100"
示例 2:

输入: a = "1010", b = "1011"
输出: "10101"
 */
public class leetCode67 {
    public static void main(String[] args) {


        System.out.println(addBinary("11", "1001"));
    }

    public static String addBinary(String a, String b) {
        String[] as = a.split("");
        String[] bs = b.split("");
//        String[] res=new String[as.length>bs.length?as.length:bs.length];
        int cur = 0;
        if (as.length == 0 || bs.length == 0) {
            return as.length > bs.length ? a : b;
        }
        int i, j, sum;
        String res = "";
        for (i = as.length - 1, j = bs.length - 1; i >=0 || j >= 0; i--, j--) {

            if(i>=0&&j>=0){
                sum = Integer.parseInt(as[i]) + Integer.parseInt(bs[j]) + cur;
            }else{
                sum = Integer.parseInt(i<j?bs[j]:as[i]) + cur;
            }

            if (i != -1 && j != -1) {
                if (sum> 1) {
                    res = sum-2 + res;
                    cur = 1;
                } else {
                    res = sum  + res;
                    cur = 0;
                }
            } else if (i <= 0) {
                if(sum>1){
                    res = 0 + res;
                    cur = 1;
                }else{
                    res = sum + res;
                    cur=0;
                }
            }else if(j<=0){
                if(sum>1){
                    res = 0 + res;
                    cur = 1;
                }else{
                   res = sum + res;
                   cur=0;
                }
            }
        }
        if(cur==1){
            return "1"+res;
        }
        return res;
    }
}
