class Solution {
    public String solution(String my_string) {
        
        StringBuilder stringBuilder = new StringBuilder(my_string);
        for(int i = 0; i < stringBuilder.length(); i++) {
            for(int j = i + 1; j < stringBuilder.length(); j++) {
                if(stringBuilder.charAt(i) == stringBuilder.charAt(j)) {
                    stringBuilder.deleteCharAt(j);
                    j--;
                        }
                    }
                }
        return stringBuilder.toString();
    }
}

//문자열 -> 배열로 바꾸기, 비교해서 똑같은건 뒤에꺼 제거하기, 문자열로 변환