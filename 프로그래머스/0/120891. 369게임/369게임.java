class Solution {
    public int solution(int order) {
    int answer = 0;
    String[] stringArr = String.valueOf(order).split("");
    int[] arr = new int[stringArr.length];
        
        for (int i = 0; i < stringArr.length; i++) {
            arr[i] = Integer.parseInt(stringArr[i]);
        }
        
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 3 || arr[i] == 6 || arr[i] == 9)
                answer += 1;
        }
        
        return answer;
    }
}