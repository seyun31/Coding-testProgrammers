class Solution {
    public int[] solution(int[] arr, int n) {
        if (arr.length % 2 == 0) {
            for (int i = 0; i < (arr.length / 2); i++) {
                 arr[2 * i + 1] = arr[2 * i + 1] + n;
            }
        } else {
            for (int i = 0; i < (arr.length / 2) + 1; i++) {
                arr[i * 2] = arr[i * 2] + n;
            }
        }
        return arr;
    }
}