class Solution {
    public int maxPower(String s) {
        int current = 1;
        int max = 1;
        for(int i = 1; i < s.length(); i++){
            char c = s.charAt(i);
            char last = s.charAt(i-1);
            if(c == last) current++;
            else {
                max = Math.max(current, max);
                current = 1;
            }
        }
        return Math.max(current, max);
    }
}