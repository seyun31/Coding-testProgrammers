class Solution {
    public String solution(String str) {
        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()) {
            if(Character.isLowerCase(ch))   // 소문자면 참
                sb.append(Character.toUpperCase(ch));
            else if(Character.isUpperCase(ch))  // 대문자면 참
                sb.append(Character.toLowerCase(ch));
        }
    
        return sb.toString();
    }
}