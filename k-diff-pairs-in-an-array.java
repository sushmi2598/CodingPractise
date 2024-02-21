class Solution {
    public int findPairs(int[] nums, int k) {
     Arrays.sort(nums);
     int l=0;
     int r=1;
     int count=0;
     if(k==0)return 1;
    for(int n:nums) System.out.print(n);
    System.out.println("");
    while(r<nums.length && l<nums.length)
    { System.out.println(Math.abs(nums[l]-nums[r]));
        if(Math.abs(nums[l]-nums[r]) == k){
        count++;
        l++;
        r++;}
        else if(Math.abs(nums[l]-nums[r]) < k)r++;
        else if(Math.abs(nums[l]-nums[r]) > k)l++;
    
    }
    return count;
    }
}
