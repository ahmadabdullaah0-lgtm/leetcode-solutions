class Solution {
    public boolean checkZeroOnes(String s) {

        int start = 0;
        int max1 = 0;
        int max2 = 0;
        int c1 = 0;
        int c2 = 0;

        while (start < s.length()) {

            if (s.charAt(start) == '1') {
                c1++;
                c2 = 0;
                max1 = Math.max(c1, max1);
            } 
            else {
                c2++;
                c1 = 0;
                max2 = Math.max(c2, max2);
            }

            start++;
        }

        return max1 > max2;
    }
}