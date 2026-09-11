class Solution {

    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        if (digits.length() == 0) {
            return ans;
        }

        String[] map = {
            "",     
            "",     
            "abc",  
            "def",  
            "ghi",  
            "jkl",  
            "mno",  
            "pqrs", 
            "tuv",  
            "wxyz"  
        };

        helper(digits, 0, "", ans, map);

        return ans;
    }

    private void helper(String digits, int index, String current,
                        List<String> ans, String[] map) {

    
        if (index == digits.length()) {
            ans.add(current);
            return;
        }
        int digit = digits.charAt(index) - '0';

        String letters = map[digit];
        for (int i = 0; i < letters.length(); i++) {

            char ch = letters.charAt(i);
            helper(digits, index + 1, current + ch, ans, map);
        }
    }
}