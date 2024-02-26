class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even.append(Integer.toString(num_list[i]));
            } else {
                odd.append(Integer.toString(num_list[i]));
            }
        }
        
        String oddstr = odd.toString();
        String evenstr = even.toString();
        
        int oddnum = Integer.parseInt(oddstr);
        int evennum = Integer.parseInt(evenstr);
        
        return oddnum + evennum;
    }
}