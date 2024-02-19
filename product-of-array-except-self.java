class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prodOfArray=1;
        Boolean isZero=false;
        Boolean notAllZero=false;
        for(int i=0;i<nums.length;i++){
         if(isZero || nums[i]!=0){
           prodOfArray*=nums[i];
           notAllZero=true;}
         else isZero=true;}
        for(int i=0;i<nums.length;i++)
        if(isZero)
        {   if(notAllZero && nums[i]==0)
            nums[i]=prodOfArray;
            else
            nums[i]=0;
        }
        else
        {
            nums[i]=prodOfArray/nums[i];
        }
       
       return nums;
    }
}
