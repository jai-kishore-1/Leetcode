class Solution {
    public int lengthOfLongestSubstring(String s) {
        char c[]=s.toCharArray();
        StringBuffer st[]=new StringBuffer[c.length];
        for(int i=0;i<c.length;i++){ st[i]=new StringBuffer();}     
        int a=0; // substring count
        int t=0;//tally count
        
        String str=new String();
        char car='a';
        int max=0;
       if(s.length() !=0){
          st[0].append(c[0]);
            for(int i=1;i<c.length;i++){
            str=st[a].toString();
            car=c[i];
            if(str.indexOf(car)==-1){
                  st[a].append(c[i]);
                  System.out.println(st[a]+"-st["+a+"]"+c[i]+ "- if");
            }
            else{
                a++;
                
                if(c[i-1] != c[i]){st[a].append(c[i-1]);} 
                st[a].append(c[i]); 
                System.out.println(st[a]+"-st["+a+"]- else");
        }
            }
        for(int i=0;i<c.length;i++){
            str=st[i].toString();
             if(str.length() >=max)
                max=str.length();
        }
       }

       return max;
}}