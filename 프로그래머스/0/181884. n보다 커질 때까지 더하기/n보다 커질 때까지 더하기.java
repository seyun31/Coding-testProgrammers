class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer = answer + numbers[i];
            if (answer < n) {
                continue;
            } else if (answer > n) {
                break;
            }
        }
            return answer;
    }       
}