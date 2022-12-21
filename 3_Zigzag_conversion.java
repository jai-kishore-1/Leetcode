class Solution {
    public String convert(String s, int numRows) {
        char c[]=s.toCharArray();
        int n=c.length;
        StringBuffer st[]=new StringBuffer[numRows];
        for(int i=0;i<numRows;i++)
           st[i]=new StringBuffer();
        int i=0;
        while(i<n){
            for(int j=0;j<numRows && i<n;j++)
                st[j].append(c[i++]);
            for(int j=numRows-2;j>=1 && i<n;j--)
                st[j].append(c[i++]);
        }
        for(int j=1;j<numRows;j++){
            st[0].append(st[j]);
        }
        return st[0].toString();
    }
}