class Solution {
    public String reverseVowels(String str) {
        int l=0;
        int r=str.length() - 1;
        StringBuilder s = new StringBuilder(str);
       
        while(l<=r)
        {
            if((s.charAt(l)=='a' ||s.charAt(l)=='e' ||s.charAt(l)=='i' 
            ||s.charAt(l)=='o' ||s.charAt(l)=='u' ||s.charAt(l)=='A' ||s.charAt(l)=='E' 
            ||s.charAt(l)=='I' ||s.charAt(l)=='O' ||s.charAt(l)=='U' ) &&
             (s.charAt(r)=='a' ||s.charAt(r)=='e' ||s.charAt(r)=='i' 
            ||s.charAt(r)=='o' ||s.charAt(r)=='u' ||s.charAt(r)=='A' ||s.charAt(r)=='E' 
            ||s.charAt(r)=='I' ||s.charAt(r)=='O' ||s.charAt(r)=='U' ))
            {
                char temp=s.charAt(l);
                 s.setCharAt(l, s.charAt(r));
                 s.setCharAt(r,temp);
                 l++;
                 r--;
            }
            else if((s.charAt(l)=='a' || s.charAt(l)=='e' ||s.charAt(l)=='i' 
            ||s.charAt(l)=='o' ||s.charAt(l)=='u' ||s.charAt(l)=='A' ||s.charAt(l)=='E' 
            ||s.charAt(l)=='I' ||s.charAt(l)=='O' ||s.charAt(l)=='U' ) ||
             (s.charAt(r)!='a' && s.charAt(r)!='e' && s.charAt(r)!='i' 
            && s.charAt(r)!='o' && s.charAt(r)!='u' && s.charAt(r)!='A' && s.charAt(r)!='E' 
            && s.charAt(r)!='I' && s.charAt(r)!='O' && s.charAt(r)!='U' ))
          {
                
                r--;
            }
            else if((s.charAt(l)!='a' && s.charAt(l)!='e' && s.charAt(l)!='i' 
            && s.charAt(l)!='o'&& s.charAt(l)!='u' && s.charAt(l)!='A' && s.charAt(l)!='E' 
            && s.charAt(l)!='I'&& s.charAt(l)!='O' && s.charAt(l)!='U' ) ||
             (s.charAt(r)=='a' ||s.charAt(r)=='e' ||s.charAt(r)=='i' 
            ||s.charAt(r)=='o' ||s.charAt(r)=='u' ||s.charAt(r)=='A' ||s.charAt(r)=='E' 
            ||s.charAt(r)=='I' ||s.charAt(r)=='O' ||s.charAt(r)=='U' ))
          {
                
                l++;
            }
            else
            {
                r--;
                l++;
            }
        }

        return s.toString();
    }
}
