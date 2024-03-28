class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        int nonEmptyCount = 0;
        
        // 빈 문자열 제거 및 비어있지 않은 문자열 개수 계산
        for (int i = 0; i < answer.length; i++) {
            if (!answer[i].equals("")) {
                answer[nonEmptyCount++] = answer[i];
            }
        }
        
        // 빈 문자열을 제외한 문자열 배열 생성
        String[] result = new String[nonEmptyCount];
        System.arraycopy(answer, 0, result, 0, nonEmptyCount);
        
        return result;
    }
}
