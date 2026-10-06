class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0) return 0 ; 

        HashSet<Integer> hs = new HashSet<>();
        int count = 1 ; 

        for(int i : nums){
            hs.add(i);
        }

        for(int i : nums){

            if(hs.contains(i)){
                if(hs.contains(i-1)) continue ; 
                int num =i ; 
                int m = 1 ;
                while(hs.contains(num+1)){
                    m++ ; 
                    num++ ; 
                }
                count = count > m ? count : m ; 
            }
        }
        return count; 
    }
}
