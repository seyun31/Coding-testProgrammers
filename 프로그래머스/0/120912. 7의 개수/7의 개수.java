class Solution {
    public int solution(int[] array) {
        int result = 0;
        
        for (int i = 0; i < array.length; i++) {
            String str = Integer.toString(array[i]);
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '7') {
                    result += 1;
                }
            }
        }
        return result;
    }
}
