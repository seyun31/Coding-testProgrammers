import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        list.add(n);
                 
        do {       
            if (n % 2 == 0) {
                n = n / 2;
                list.add(n); 
            } else {
                n = 3 * n + 1;
                list.add(n); 
            }
            count += 1; 
        } while (n != 1); 
            
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
