class Solution {
    public int characterReplacement(String s, int k) {

        int arr[] = new int[26];
        int max = 0 ; 
        int l = 0 ; 
        int maxCount = 0 ; 

        for(int r = 0 ; r < s.length() ; r++){

            arr[s.charAt(r) - 'A'] += 1 ; 
            maxCount = Math.max(maxCount , arr[s.charAt(r) - 'A']);

            if((r - l +1) -maxCount > k ){
                arr[s.charAt(l) - 'A'] -- ;
                l++ ;
            }

            max = Math.max(max , r - l +1);
        }
        
        return max ; 
    }
}
