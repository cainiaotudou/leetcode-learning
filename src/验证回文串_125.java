public class 验证回文串_125 {
    public static boolean isPalindrome(String s) {
        if(s==null){
            return true;
        }
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for(char c : chars){
            if((c>='0' && c<='9')||(c>='a' && c<='z')){
                stringBuffer.append(c);
            }
        }

        return stringBuffer.toString().equals(stringBuffer.reverse().toString());
    }
    public static void main(String[] args){
        String s = "race a car";
        isPalindrome(s);
    }
}
