class Solution {
    public int trap(int[] height) {

        int [] pre = new int[height.length];
        int [] suf = new int[height.length];

        pre[0] = 0 ; suf[height.length-1] = 0; 
        for(int i = 1 ; i < height.length ; i++ ){
            pre[i] = Math.max(height[i-1] , pre[i-1]);
        }
        for(int i = height.length - 2; i >= 0; i--){
    suf[i] = Math.max(suf[i+1], height[i+1]);
}
        for(int i : suf){
            System.out.print(i);
        }
        System.out.println();
        for(int i : pre){
            System.out.print(i);
        }
        System.out.println();
        int sum = 0 ; 
        for(int i = 0 ; i < height.length ; i ++){
            if(height[i]<Math.min(suf[i] , pre[i])){
                sum += Math.min(suf[i] , pre[i]) - height[i] ; 
            }
        }

        return sum ; 
    }

    
}
