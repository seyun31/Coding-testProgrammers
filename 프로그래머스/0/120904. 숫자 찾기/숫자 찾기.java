class Solution {
    public int solution(int num, int k) {
    int answer = 0;
    String[] stringArr = String.valueOf(num).split("");
    int[] arr = new int[stringArr.length];
        
        for (int i = 0; i < stringArr.length; i++) {
            arr[i] = Integer.parseInt(stringArr[i]);
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                answer = i + 1;
                break;
            } else if (arr[i] != k) {
                answer = -1;
            }
        }
       return answer; 
        }
    }