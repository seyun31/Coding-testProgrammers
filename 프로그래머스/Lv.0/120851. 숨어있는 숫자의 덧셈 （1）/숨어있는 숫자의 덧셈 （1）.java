class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] strArr = my_string.replaceAll("[^0-9]" , "").split("");
        
        for (int i = 0; i < strArr.length; i++) {
            answer += Integer.parseInt(strArr[i]);
            }
        
        /* 위에 꺼 대신 for 루프문을 사용해도 됨
            for(String s : strArr) {
	            answer += Integer.parseInt(s); */
        
         return answer;
        }
    }

