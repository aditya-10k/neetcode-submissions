class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> al = new HashSet<>();
        int max = 0 ;

        if(nums.length == 0 ){
            return 0 ;
        }

        for(int i : nums){
            al.add(i);
        }

        

        for(int i = 0 ; i < nums.length ; i++){

            if (al.contains(nums[i]-1)){
                continue ; 
            }
            else{
                int ctr = 1 ;
                int k = 1 ; 
                while(true){
                    if (al.contains(nums[i]+k)){
                        ctr ++ ; 
                        k++ ;
                    }
                    else break ; 
                }
                 max = Math.max(max , ctr);

            }
        }
        return max ; 
    }
}
