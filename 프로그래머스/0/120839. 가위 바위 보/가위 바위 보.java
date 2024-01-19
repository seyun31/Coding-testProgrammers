class Solution {
    public String solution(String rsp) {
        char[] arr = rsp.toCharArray();
        int[] answer = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '0') {
                answer[i] = 5;
            } else if (arr[i] == '2') {
                answer[i] = 0;
            } else if (arr[i] == '5') {
                answer[i] = 2;
            }
        }

        StringBuilder strBuilder = new StringBuilder();
        for (int ans : answer) {
            strBuilder.append(ans);
        }
        return strBuilder.toString(); 
        
    }
}