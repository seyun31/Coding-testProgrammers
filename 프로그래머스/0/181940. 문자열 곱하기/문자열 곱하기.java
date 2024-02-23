class Solution {
    public String solution(String my_string, int k) {
        StringBuilder answer = new StringBuilder();
        for(int i = 1; i <= k; i++) {
            answer.append(my_string);
        }
        return String.valueOf(answer);
    }
}