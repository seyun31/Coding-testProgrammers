class Solution {
    public int[] solution(int n) {
        int count = 0;

        // 약수의 개수를 찾기
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        // 약수를 배열에 저장
        int[] answer = new int[count];
        int index = 0; // 배열 인덱스를 추적하기 위한 변수

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer[index] = i;
                index++;
            }
        }

        return answer;
    }
}
