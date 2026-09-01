class Solution {
    public int longestOnes(int[] nums, int k) {

        int start = 0;
        int c = 0;      
        int max = 0;

        for (int end = 0; end < nums.length; end++) {

            if (nums[end] == 0) {
                c++;
            }

            while (c > k) {
                if (nums[start] == 0) {
                    c--;
                }
                start++;
            }

            int mco = end - start + 1;
            max = Math.max(max, mco);
        }

        return max;
    }
}