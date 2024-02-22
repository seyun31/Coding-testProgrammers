import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int[] intArr = {a, b};
        int num = concatIntArray(intArr);
        int sum = num;
        int answer = (sum >= (2 * a * b)) ? sum : 2 * a * b;
        return answer;
    }

    private int concatIntArray(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        return Integer.parseInt(sb.toString());
    }
}
