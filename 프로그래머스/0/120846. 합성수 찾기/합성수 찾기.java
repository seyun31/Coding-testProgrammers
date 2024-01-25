class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sum += 1;
                }
            } 
            if (sum >= 3) {
                answer += 1;
            }   
        }
        return answer;
    }
}