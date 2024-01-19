class Solution {
    public int solution(int hp) {
        int answer = 0;
        if (hp >= 5) {
            answer = hp / 5;
            answer = answer + ((hp % 5) / 3) + ((hp % 5) % 3);
        } else if (hp >= 3) {
            answer = hp / 3;
            answer = answer + hp % 3;
        } else {
            answer = hp;
        }
        return answer;
    }
    }
