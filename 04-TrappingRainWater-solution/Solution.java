class Solution {
    public int trap(int[] height) {
       int []leftmax=new int[height.length];
       int []rightmax=new int[height.length];
       leftmax[0]=height[0];
        rightmax[height.length-1]=height[height.length-1];
        for(int j=1;j<height.length;j++){
            leftmax[j]=Math.max(leftmax[j-1],height[j]);
        }
        for(int k=height.length-2;k>0;k--){
            rightmax[k]=Math.max(rightmax[k+1],height[k]);
        }
        int sum=0;
        for(int i=1;i<height.length;i++){

        int watertrapped=(Math.min(leftmax[i],rightmax[i]))-height[i];
        sum=sum+watertrapped;
       } 
       return sum;
    }
}