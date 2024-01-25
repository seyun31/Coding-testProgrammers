import java.util.*;

class Solution {
    public String solution(String cipher, int code) {
        int num = cipher.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= (num/code) ; i++) {
            sb.append(cipher.charAt((code * i) - 1));
            }
        return sb.toString();
        }
    }