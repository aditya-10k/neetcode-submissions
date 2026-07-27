class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer , ArrayList<Integer>> hs = new HashMap<>();
        int [] output = new int[2];
        for(int i = 0 ; i< nums.length; i++){
            if(!hs.containsKey(nums[i]))
            {
                ArrayList<Integer> al = new ArrayList<>();
                al.add(i);
                hs.put(nums[i] ,al); 
            }
            else{
                hs.get(nums[i]).add(i);
            }
            
        }

        for(int i = 0 ; i < nums.length ; i ++){
            int rem = target - nums[i] ;

            if(hs.containsKey(rem)){
                ArrayList<Integer> list = hs.get(rem);
                System.out.println(list);
                for(int j : list) 
                {
                    if(j != i)
                {
                        output[1] = j ; 
                        output[0] = i ; 
                        return output ; 
                }
                }
            }
        }
        return output;
    }
}
