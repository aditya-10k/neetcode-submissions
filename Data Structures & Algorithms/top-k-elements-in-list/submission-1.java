class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> hs = new HashMap<>();

        
        for(int i : nums){
            hs.put(i,hs.getOrDefault(i , 0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> hs.get(a)-hs.get(b));

        for(int i : hs.keySet()){

            pq.add(i);

            while(pq.size()>k){

            pq.poll();

        }
        }



        int[] arr =new int[pq.size()];
        int idx = 0 ; 
        for(int i : pq){
            arr[idx++] = i;
        } 
        return arr  ;
    }
}
