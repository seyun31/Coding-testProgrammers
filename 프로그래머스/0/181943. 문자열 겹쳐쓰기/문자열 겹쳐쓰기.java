class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int a = overwrite_string.length();
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        
        for(int i = 0; i < a; i++) {
            sb.setCharAt(i + s, overwrite_string.charAt(i));
            }
        return String.valueOf(sb);
    }
}