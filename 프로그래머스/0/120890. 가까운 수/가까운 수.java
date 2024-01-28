class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0]; // 초기값 설정

        for (int i = 1; i < array.length; i++) {
            int diffCurr = Math.abs(array[i] - n);
            int diffPrev = Math.abs(answer - n);

            if (diffCurr < diffPrev || (diffCurr == diffPrev && array[i] < answer)) {
                answer = array[i];
            }
        }

        return answer;
    }
}
