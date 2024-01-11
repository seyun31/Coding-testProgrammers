import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String[] answer = new String[my_string.length()];
        char[] arr = my_string.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            answer[i] = String.valueOf(arr[arr.length - 1 - i]);
        }
        
        return String.join("", answer);
    }
}
