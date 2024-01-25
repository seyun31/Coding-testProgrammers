class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n == 1) {
            answer = 1;
        } else {
              for (int i = 1; i <= (n/2); i++ ) {
            if (n % i == 0 && i < (n/i)) {
                answer += 2;
            } else if (n % i == 0 && i == (n/i)) {
                answer += 1;
                }
            }
        }
      
        return answer;
    }
}