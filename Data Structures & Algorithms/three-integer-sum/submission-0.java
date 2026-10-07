class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> ls = new ArrayList<>();

        int pivot = 0 ;  

        while(pivot < nums.length-2 ){
            int start = pivot+1 ; int end = nums.length - 1 ;
            while(start < end){
                int sum = nums[pivot] + nums[start] + nums[end];

                if(sum > 0){
                    end -- ;
                }
                else if(sum < 0){
                    start ++ ; 
                }
                else{
                    List<Integer> t = List.of(nums[pivot] , nums[start] , nums[end]);
                    if(!ls.contains(t)){
                        System.out.println("xx");
                        ls.add(t) ; 
                    }
                    start ++ ; end -- ; 
                }

            }
            pivot ++ ;

            
        }
        return ls ;
        
    }
}
