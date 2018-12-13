import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

有效字符串需满足：

左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
注意空字符串可被认为是有效字符串。

示例 1:

输入: "()"
输出: true
示例 2:

输入: "()[]{}"
输出: true
示例 3:

输入: "(]"
输出: false
示例 4:

输入: "([)]"
输出: false
示例 5:

输入: "{[]}"
输出: true
 */
public class leetCode20 {
    public static void main(String[] args){
    }
    public boolean isValid(String s) {
        Map<Character,Character> map = new HashMap<Character, Character>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');


        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i<s.length();i++){
            char curr = s.charAt(i);
            if(map.containsKey(s.charAt(i))){
                char top = stack.empty()?'#':stack.pop();
                if(top != map.get(curr)){
                    return false;
                }
            }else{
                stack.push(curr);
            }
        }
        return stack.isEmpty();


    }
}

