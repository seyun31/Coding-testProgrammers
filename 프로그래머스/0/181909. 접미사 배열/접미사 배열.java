import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> strArr = new ArrayList<>();
        
        for(int i = 1; i < my_string.length(); i++) {
            strArr.add(my_string.substring(i));
        }
        
        strArr.add(my_string);
        Collections.sort(strArr);
        
        String[] answer = new String[strArr.size()];
        for(int i = 0; i < strArr.size(); i++) {
            answer[i] = strArr.get(i);
        }
        
        return answer;
    }
}