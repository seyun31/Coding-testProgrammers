class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        int l = is_prefix.length();
        if(my_string.length() >= l && my_string.substring(0, l).equals(is_prefix)){
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}