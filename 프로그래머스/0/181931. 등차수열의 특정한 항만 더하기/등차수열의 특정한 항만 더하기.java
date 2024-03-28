class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] seq = new int[included.length];
        
        for (int i = 0; i < seq.length; i++) {
            seq[i] = a + (i * d);
        }
        
        for (int i = 0; i < seq.length; i++) {
            if (included[i] == true) {
                answer += seq[i];
            }
        }
        
        return answer;
    }
}