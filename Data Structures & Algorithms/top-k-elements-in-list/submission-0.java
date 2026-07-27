class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer , Integer> hs = new HashMap<>();

        for(int i : nums){
           hs.put(i , hs.getOrDefault(i ,0)+1);
        }

        ArrayList<Integer> [] arr = new ArrayList[nums.length +1];

        hs.keySet().forEach(
         c-> {
                if(arr[hs.get(c)] == null){
                    arr[hs.get(c)] = new ArrayList<>();
                }
                arr[hs.get(c)].add(c);          
            }
        );

        int ctr = 0 ; 
        int [] output = new int[k];

        for(int i = arr.length -1 ; i>=0 ; i--){
            if(arr[i]!= null){
                for(int j : arr[i]){
                    output[ctr] = j ;
                    ctr ++ ;
                    if(ctr == k ){
                        return output ; 
                    }
                }
            }
        }
     return new int[]{0,0} ; 
    }
}
