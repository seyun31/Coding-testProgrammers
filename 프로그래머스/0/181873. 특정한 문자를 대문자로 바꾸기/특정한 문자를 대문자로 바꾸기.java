class Solution {
    public String solution(String my_string, String alp) {
        String ALP = alp.toUpperCase();
        my_string = my_string.replace(alp, ALP);
        return my_string;
    }
}