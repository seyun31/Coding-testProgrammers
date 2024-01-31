class Solution {
    public int solution(String my_string) {
        // 입력 문자열을 공백을 기준으로 나눠 배열로 만듦
        String[] list = my_string.split(" ");
        
        // 결과를 저장할 변수를 첫 번째 숫자로 초기화
        int answer = Integer.parseInt(list[0]);

        // 숫자와 연산자로 이루어진 배열을 순회하면서 계산
        for (int i = 1; i < list.length; i += 2) {
            if (list[i].equals("+")) {
                answer += Integer.parseInt(list[i + 1]);
            } else if (list[i].equals("-")) {
                answer -= Integer.parseInt(list[i + 1]);
            }
        }
        
        // 최종 결과 반환
        return answer;
    }
}
