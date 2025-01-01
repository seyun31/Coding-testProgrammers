import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];  // queries의 크기만큼 answer 배열 초기화

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];  // 시작 인덱스
            int e = queries[i][1];  // 종료 인덱스
            int k = queries[i][2];  // 기준값

            // 조건에 맞는 값을 저장할 리스트
            ArrayList<Integer> pr = new ArrayList<>();

            // 조건에 맞는 값 찾기
            for (int j = s; j <= e; j++) {
                if (arr[j] > k) {
                    pr.add(arr[j]);  // 리스트에 추가
                }
            }

            // 리스트가 비어있으면 -1 저장, 그렇지 않으면 최소값 저장
            if (pr.isEmpty()) {
                answer[i] = -1;  // 조건을 만족하는 값이 없을 때
            } else {
                Collections.sort(pr);  // 오름차순 정렬
                answer[i] = pr.get(0);  // 가장 작은 값 저장
            }
        }

        return answer;
    }
}
