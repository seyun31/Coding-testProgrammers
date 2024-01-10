class Solution {
    public int solution(int n) {
        int sum = 0;
        
        String[] stringArr = String.valueOf(n).split("");
        int[] arr = new int[stringArr.length];
        
        for (int i = 0; i < stringArr.length; i++) {
            arr[i] = Integer.parseInt(stringArr[i]);
        }
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
