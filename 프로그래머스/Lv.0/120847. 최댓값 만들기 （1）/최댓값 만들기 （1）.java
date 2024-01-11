class Solution {
    public int solution(int[] numbers) {
        int max1 = numbers[0];
        int max2 = numbers[1]; 

        for (int i = 1; i < numbers.length; i++) {
            if (max1 < numbers[i]) {
                max2 = max1;
                max1 = numbers[i];
            } else if (max2 < numbers[i]) {
                max2 = numbers[i];
            }
        }

        return (max1 * max2);
    }
}
