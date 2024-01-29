import java.util.*;

class Solution {
    public int solution(String s) {
        String[] list = s.split(" ");
        int answer = 0;
        
        for(int i = 0 ; i < list.length ;i++){
            if(list[i].equals("Z")){
                answer -= Integer.parseInt(list[i-1]);  
            } else {
                answer += Integer.parseInt(list[i]);  
            }
        }
        return answer;
    }
}
//string을 string배열로, 배열에서 Z가 나오면 그 인덱스랑 그 전 인덱스 삭제, int 배열로 바꾸고 더함