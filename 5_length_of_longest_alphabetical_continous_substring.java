class Solution {
    public int longestContinuousSubstring(String s) {
         StringBuffer st[]=new StringBuffer[s.length()];
         for(int m=0;m<s.length();m++){st[m]=new StringBuffer();}
         int i =0; int k=0; int l=0; int a=0; char q='a'; char w='b';
         while(i<s.length()){
            if((st[a]).isEmpty() == true){
                st[a].append(s.charAt(i));
            }
            else{
                 q=s.charAt(i);
                 w=s.charAt(i-1);
                 k=(int) q;
                 l=(int) w;
             if( l+1 == k){
                 st[a].append(s.charAt(i));
             }
             else{
                 a++;
                 st[a].append(s.charAt(i));
             }
            }
             i++;
         }
         int max=0;
         for(int j=0;j<s.length();j++){
             if (max <= st[j].length()){
                 max=st[j].length();
             }
         }
           return max;
    }
}