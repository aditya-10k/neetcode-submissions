class Solution {
    public int maxArea(int[] heights) {
        
        int start = 0  ; int end = heights.length-1 ;

        int maxArea = 0;
        while(start < end ){

            maxArea = Math.max(maxArea , area(heights,start , end));

            if(heights[start]>= heights[end]){
                end -- ; 
            }
            else{
                start ++ ;
            }

        }
        return maxArea;
    }

    public int area(int [] arr , int start , int end){

        return Math.min(arr[start] , arr[end]) * (end-start) ; 
    }
}
