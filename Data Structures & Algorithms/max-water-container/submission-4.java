class Solution {
    public int maxArea(int[] heights) {

        int vol = 0 ; 
        int start = 0 ; int end = heights.length-1 ; 

        while(start < end){

            int area = (end - start) * Math.min(heights[start] , heights[end]);
            vol = area > vol ? area : vol ; 

            if(heights[start] > heights[end]){

                end -- ; 
            }else{
                start ++ ; 
            }

        }

        return vol ;

        
    }
}
