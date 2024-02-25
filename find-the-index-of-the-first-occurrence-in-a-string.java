class Solution {
    public int strStr(String haystack, String needle) {
        int start=0;
        int end=0;
        int returnVal=-1;
        int lengthOfNeedle=needle.length();
        System.out.println("lengthOfNeedle" +lengthOfNeedle);
        int i=0;
        if(haystack.length() < lengthOfNeedle) return -1;
        while(i < haystack.length())
        {
            if(haystack.charAt(i)==needle.charAt(start))
            {
               returnVal=i;
               int j=i;
               while(start<lengthOfNeedle && j < haystack.length()) 
               { System.out.println("Start"+start);
                 System.out.println("j"+j);
               if(haystack.charAt(j)==needle.charAt(start))
               { start++;
                j++;
               }
               else{
                     System.out.println("Start in else"+start);
                      System.out.println("j"+j);
                     start=0;
                     break;
                 } 
               }
             
            }
            System.out.println("Start out loop"+start);
            if(start==lengthOfNeedle) break;
            else i++;
        }
if(start==0 || start!=lengthOfNeedle)returnVal=-1;
        return returnVal;
    }
}
