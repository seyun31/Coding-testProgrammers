class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int sum1 = 0, sum2 = 0;
        boolean com = arr1.length == arr2.length;

        if (com) {
            for (int i = 0; i < arr1.length; i++) {
                sum1 += arr1[i];
            }
            for (int i = 0; i < arr2.length; i++) {
                sum2 += arr2[i];
            }

            if (sum1 > sum2) {
                answer = 1;
            } else if (sum2 > sum1) {
                answer = -1;
            } else {
                answer = 0;
            }
        } else {
            answer = arr1.length > arr2.length ? 1 : -1;
        }
        return answer;
    }
}
