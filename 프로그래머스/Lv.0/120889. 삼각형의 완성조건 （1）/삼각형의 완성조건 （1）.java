class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int sum = sides[0];
        int max = sides[0];
        
        for (int i = 1; i < sides.length; i++) {
            if (sides[i] > max) {
                max = sides[i];
            }
            sum += sides[i];
        }

        sum -= max;

        if (sum <= max) {
            answer = 2; 
        } else if (sum > max) {
            answer = 1; 
        }
        
        return answer;
    }
}