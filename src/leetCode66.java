/*
给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。

最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。

你可以假设除了整数 0 之外，这个整数不会以零开头。

示例 1:

输入: [1,2,3]
输出: [1,2,4]
解释: 输入数组表示数字 123。
示例 2:

输入: [4,3,2,1]
输出: [4,3,2,2]
解释: 输入数组表示数字 4321。
 */
public class leetCode66 {
    public static void main(String[] args) {
    }

    public int[] plusOne(int[] digits) {
        digits[digits.length - 1] += 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i]!=10) {
                return digits;
            } else {
                digits[i]=0;
                if(i!=0){
                    digits[i-1]+=1;
                }
            }
        }
        int[] res = new int[digits.length+1];
        res[0]=1;
        System.arraycopy(digits,0,res,1,digits.length);
        return res;
    }

    //失败 不允许转成数字进行+1
    public int[] plusOne1(int[] digits) {
        digits.r
        if (digits[digits.length - 1] + 1 != 10) {
            digits[digits.length - 1] += 1;
            return digits;
        } else {
            String num = "";
            long sum = 0;
            for (int i = 0; i < digits.length; i++) {
                num += digits[i];
            }
            sum = Long.parseLong(num) + 1;
            num = String.valueOf(sum);
            int[] res = new int[num.length()];
            for (int j = 0; j < num.length(); j++) {
                res[j] = Integer.parseInt(String.valueOf(num.charAt(j)));
            }
            return res;
        }
    }

}
