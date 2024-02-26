class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int a = 1;
        for (int i = 0; i < num_list.length; i++) {
            a = a * num_list[i];
            sum = sum + num_list[i];
        }
        int b = (int) Math.pow(sum,2);
        return a < b? 1: 0;
    }
}