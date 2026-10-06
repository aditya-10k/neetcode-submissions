class Solution {
    public int[] productExceptSelf(int[] nums) {

        int [] prefix = new int[nums.length];
        int [] suffix = new int [nums.length];
        int prepro = nums[0] ; 
        int sufpro = nums[nums.length-1] ; 
        prefix[0] = prepro ;
        suffix[nums.length-1] = sufpro ; 

        for(int i = 1 ; i < nums.length-1 ; i++){

            prepro *= nums[i] ;
            prefix[i] = prepro ; 
            sufpro *= nums[nums.length-i-1]; 
            suffix[nums.length-i-1] = sufpro ; 

        }

        int[] res = new int[nums.length] ; 
        res[0] = suffix[1] ; 
        res[nums.length-1] = prefix[nums.length-2];

        for(int i = 1 ; i < nums.length-1 ; i ++){

            res[i] = prefix[i-1] * suffix[i+1];
        }

        return res ; 
        
    }
}  
