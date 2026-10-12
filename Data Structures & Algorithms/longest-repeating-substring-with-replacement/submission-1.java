class Solution {
    public int characterReplacement(String s, int k) {
        
        int maxCount = 0 ; 
        int [] arr = new int[26];

        int l = 0 ; 
        int max = 0 ;


        for(int i = 0 ; i < s.length() ; i ++){

            arr[s.charAt(i) - 'A'] +=1 ; 
            max = Math.max(max , arr[s.charAt(i)-'A'] );

            if(i-l +1 - max > k){
                arr[s.charAt(l)-'A'] -=1 ; 
                l ++ ;
            }

            maxCount = Math.max(maxCount , i-l +1);
        }
        return maxCount;
    }
}
