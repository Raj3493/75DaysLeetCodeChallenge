class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0, maxLen = 0;
        
        int[] map = new int[256]; 
        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);
            left = Math.max(left, map[c]);
            maxLen = Math.max(maxLen, right - left + 1);
            map[c] = right + 1;
        }
        
        return maxLen;
    }
}