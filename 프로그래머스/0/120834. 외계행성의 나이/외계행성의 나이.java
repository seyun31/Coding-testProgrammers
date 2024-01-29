import java.util.*;

class Solution {
    public String solution(int age) {
        String[] stringArr = String.valueOf(age).split("");
        int[] arr = new int[stringArr.length];
        
         for (int i = 0; i < stringArr.length; i++) {
            arr[i] = Integer.parseInt(stringArr[i]);
        }
        
        String[] word = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String[] answer = new String[arr.length];
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < 10; j++) {
                if(arr[i] == j) {
                    answer[i] = word[j];
                }
            }
        }
        return String.join("", answer);
    }
}
