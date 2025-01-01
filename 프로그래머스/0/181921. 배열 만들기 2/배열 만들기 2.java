import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            String s = Integer.toString(i);

            // 숫자가 0과 5만으로 구성되었는지 확인
            if (isZeroOrFive(s)) {
                answer.add(i);
            }
        }

        // 결과가 없으면 -1 추가
        if (answer.isEmpty()) {
            return new int[]{-1};
        }

        // ArrayList를 배열로 변환
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }

        return result;
    }

    // 숫자가 0과 5만으로 구성되었는지 확인하는 함수
    private boolean isZeroOrFive(String s) {
        for (char c : s.toCharArray()) {
            if (c != '0' && c != '5') {
                return false;
            }
        }
        return true;
    }
}
