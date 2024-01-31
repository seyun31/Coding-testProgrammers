class Solution {
    public String solution(String letter) {
        // 입력 문자열을 공백을 기준으로 나눠 배열로 만듦
        String[] list = letter.split(" ");
        
        // 결과를 저장할 char 배열 선언
        char[] answer = new char[list.length];

        // Morse 코드와 알파벳을 매핑한 배열
        String[] mose = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        // 입력된 Morse 코드를 알파벳으로 변환
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < mose.length; j++) {
                if (list[i].equals(mose[j])) {
                    answer[i] = alphabet[j];
                    break;  // 매칭되는 Morse 코드를 찾으면 루프 종료
                }
            }
        }
        
        // char 배열을 문자열로 변환하여 반환
        return new String(answer);
    }
}
