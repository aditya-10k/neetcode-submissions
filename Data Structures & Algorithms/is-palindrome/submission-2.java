class Solution {
    public boolean isPalindrome(String s) {

        if(s.length() == 1) return true ;

        
       String s1 = s.toLowerCase();
       
       int start = 0 ; int end = s1.length()-1 ; 

       while(start<=end){

        while(!Character.isAlphabetic(s1.charAt(start)) && !Character.isDigit(s1.charAt(start))){
            start ++ ;
            if(start == end) return true ;
        }
        while(!Character.isAlphabetic(s1.charAt(end)) && !Character.isDigit(s1.charAt(end))){
            end -- ;
        }

        if(s1.charAt(start)!=s1.charAt(end)){
            return false ;
        }
        start ++ ; end --;
       }
       return true ;

    }
}
