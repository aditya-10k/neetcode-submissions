class Solution {
    public int maxProfit(int[] prices) {

        int maxDiff =  0 ; 
        int ptr = 0 ; 

        for(int i = 1 ; i < prices.length ; i++){

            int diff = prices[i] - prices[ptr] ; 

            if(diff < 0 ){
                ptr = i ; 
            }
            maxDiff = maxDiff > diff ? maxDiff : diff ; 
        }

        return maxDiff ;
        
    }
}
