class Solution {
    public int findPairs(int[] nums, int k) {
     Arrays.sort(nums);
     HashSet<Integer> hs=new HashSet<>();
        
        for(int n: nums)
        {
            hs.add(n);
        }
        int[] arr= new int[hs.size()];
        int j=0;
        for(int i:hs)
        {
            arr[j++]=i;
        }
     
    if(k==0)
    {
       HashMap<Integer,Integer> hm = new HashMap<>();
       for(int i:nums)
       {
           if(hm.containsKey(i))
           {
               hm.put(i,hm.get(i)+1);
           }
           else hm.put(i,1);
       }

       int count=0;

       for(int i:arr)
       {
           if(hm.get(i)>1){count++; 
           hm.put(i,0);}
       }
       return count;
    }
    else
    {
        return getCount(arr,k);
    }
  
    }

    public static int getCount(int[] nums,int k){
     int l=0;
     int r=1;
     int count=0;
    while(r<nums.length && l<nums.length)
    {   System.out.println(Math.abs(nums[l]-nums[r]));
        if(Math.abs(nums[l]-nums[r]) == k && l!=r){
        count++;
        l++;
        r++;}
        else if(Math.abs(nums[l]-nums[r]) > k) l++;
        else  r++;
    }
    return count;
    }
}
