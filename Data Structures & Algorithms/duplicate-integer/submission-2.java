class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashMap<Integer , Integer> hs = new HashMap<>();

        for(int i: nums){

            if(hs.containsKey(i)){
                return true ;
            }
            else{
                hs.put(i , 1);
            }
        }
        return false ;
    }
}