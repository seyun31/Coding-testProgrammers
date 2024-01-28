import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] chArrB = before.toCharArray();
        Arrays.sort(chArrB);
        String bef = new String(chArrB);
        
        char[] chArrA = after.toCharArray();
        Arrays.sort(chArrA);
        String aft = new String(chArrA);
        
        if(bef.equals(aft)) {
            answer = 1;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}

// before와 after를 각각 배열로 변환 -> 둘이 구성이 같으면 1, 아니면 0을 출력.