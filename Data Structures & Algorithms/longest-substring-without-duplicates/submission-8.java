
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        HashMap<Character, Integer> hs = new HashMap<>();
        
        int left = 0; 

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            if (hs.containsKey(currentChar) && hs.get(currentChar) >= left) {
                left = hs.get(currentChar) + 1;
            }

            hs.put(currentChar, right);

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
