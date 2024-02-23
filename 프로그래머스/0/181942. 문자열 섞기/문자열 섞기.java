class Solution {
    public String solution(String str1, String str2) {
        StringBuilder answer = new StringBuilder();
        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");
        
        for(int i = 0; i < arr1.length; i++) {
            answer.append(arr1[i]);
            answer.append(arr2[i]);
        }
        
        return String.valueOf(answer);
    }
}