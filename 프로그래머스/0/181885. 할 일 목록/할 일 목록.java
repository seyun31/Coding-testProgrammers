import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> strArr = new ArrayList<>();
        for(int i = 0; i < finished.length; i++) {
            if(finished[i] == false) {
                strArr.add(todo_list[i]);
            }
        }
        String[] answer = new String[strArr.size()];
        for (int i = 0; i < strArr.size(); i++) {
            answer[i] = strArr.get(i);
        }
        
        
        return answer;
    }
}