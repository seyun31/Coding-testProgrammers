class Solution {
    public int solution(int n) {
        int sum = 1;
        int answer = 0;
        
        for(int i = 1; i <= 10; i++) {
            sum = sum * i;
            if (sum == n) {
                answer = i;
                break;
            } else if (sum > n) {
                answer = i - 1;
                break;
            }
        }
        return answer;
    }
}