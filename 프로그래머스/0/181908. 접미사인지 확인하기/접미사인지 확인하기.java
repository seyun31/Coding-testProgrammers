class Solution {
    public int solution(String my_string, String is_suffix) {
        int s = my_string.length();
        int answer = 0;
        for (int i = 0; i < s; i++) {
            if (my_string.substring(i, s).equals(is_suffix)) {
                return answer = 1;
            }
        }
        return answer;
    }
}