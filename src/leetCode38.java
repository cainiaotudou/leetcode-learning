import java.util.HashMap;
import java.util.Map;

/*
报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：

1.     1
2.     11
3.     21
4.     1211
5.     111221
1 被读作  "one 1"  ("一个一") , 即 11。
11 被读作 "two 1s" ("两个一"）, 即 21。
21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 */
public class leetCode38 {

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }

    public static String countAndSay(int n) {
        String num = "1";
        String res = "";
        if (n == 1) {
            return num;
        }
        num = countAndSay(n - 1);
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == '1') {
                if (num.length() - i > 1 && num.charAt(i + 1) == '1') {
                    res += "21";
                    i++;
                    continue;
                } else {
                    res += "11";
                }
            }
            if (num.charAt(i) == '2') {
                res += "12";
            }
        }
        num = res;
        return num;
    }
}
