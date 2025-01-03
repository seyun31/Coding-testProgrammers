import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stkList = new ArrayList<>();
        
        int i = 0; // 배열의 인덱스를 관리
        while (i < arr.length) {
            if (stkList.isEmpty()) {
                stkList.add(arr[i]);
                i++;
            } else if (stkList.get(stkList.size() - 1) < arr[i]) {
                stkList.add(arr[i]);
                i++;
            } else if ((stkList.get(stkList.size() - 1) >= arr[i])) {
                stkList.remove(stkList.size() - 1);
            }
        }
        
        // ArrayList를 int[]로 변환
        int[] stk = new int[stkList.size()];
        for (int j = 0; j < stkList.size(); j++) {
            stk[j] = stkList.get(j);
        }
        
        return stk;
    }
}
