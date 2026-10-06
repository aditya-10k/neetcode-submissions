class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){

            if(Character.isLetterOrDigit(c)) sb.append(c) ; 

        }

        s = sb.toString().toLowerCase();

        int st = 0 ; int e = sb.length()-1 ; 

        while(st<e){
            if(s.charAt(st) != s.charAt(e)) return false ; 
            st++ ; e-- ; 

        }

        return true ; 
        
    }
}
