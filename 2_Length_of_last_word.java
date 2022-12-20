import java.util.*;
class Solution {
    public int lengthOfLastWord(String s) {
        StringTokenizer st=new StringTokenizer(s," ");
        int i=0;
        String str[]=new String[100];
        while(st.hasMoreTokens()){
            str[i]=st.nextToken();
            i++;
        }
        return str[i-1].length();
    }
}