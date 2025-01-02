import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            arr1.add(num_list[i]);
        }
        
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i = n; i < num_list.length; i++) {
            arr2.add(num_list[i]);
        }
        
        arr2.addAll(arr1);
        
        int[] answer = new int[num_list.length];
        for(int i = 0; i < arr2.size(); i++) {
            answer[i] = arr2.get(i);
        }
        
        return answer;
    }
}