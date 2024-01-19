import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        // 숫자만을 담을 문자열
        StringBuilder intStr = new StringBuilder();
            
        // 주어진 문자열을 순회하면서 숫자만 추출
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (Character.isDigit(ch)) {
                intStr.append(ch);
            }
        }
        
        // 문자열을 정수 배열로 변환
        int[] answer = new int[intStr.length()];
        for (int i = 0; i < intStr.length(); i++) {
            answer[i] = Character.getNumericValue(intStr.charAt(i));
        }
        
        // 정수 배열 정렬
        Arrays.sort(answer);
        
        return answer;
    }
}
