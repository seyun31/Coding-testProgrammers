import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = new int[numlist.length];
        int removeCount = 0; 
        
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                answer[i - removeCount] = numlist[i];
            } else {
                removeCount++; 
            }
        }

        answer = Arrays.copyOf(answer, numlist.length - removeCount);

        return answer;
    }
}
