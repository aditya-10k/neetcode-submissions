class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character , Integer> hs = new HashMap<>() ; 
        int max = 0 ; 


        if(s == null){
            return 0 ; 
        }
        if(s.length() ==1){
            return 1 ; 
        }

        int left = 0 ; 

        for(int right = 0 ; right < s.length() ; right ++){

            char k = s.charAt(right) ; 

            if(hs.containsKey(k) && hs.get(k) >= left){

                left = hs.get(k) + 1 ;
            }

            hs.put(k , right) ; 

            max = Math.max(max , right -left +1 );
        }



        return max ; 
    }
}
