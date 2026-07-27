class Solution {
    public int maxProfit(int[] prices) {
        
        int max = 0 ;
        int posn = 0 ;  

        for(int i = 1 ; i < prices.length  ; i++){

            if(prices[i] - prices[posn] > 0){
                max = Math.max(max ,prices[i] - prices[posn] ) ; 
            }
            else{
                posn = i ; 
            }
        }

        return max ; 
    }
}
