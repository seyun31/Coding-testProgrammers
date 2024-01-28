import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        
        char[] chArr = my_string.toCharArray();
        Arrays.sort(chArr);
        
        return new String(chArr);
    }
}

// 대문자를 소문자로 변경 -> 알파벳순으로 변경