class Solution {
    static String revStr(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}

        
        /*int len = s.length();
        for(int i = len-1;i>=0;i-- )
        {
            rev = rev + s.charAt(i);
        }
        
        return rev;
        */
        
        /*char[] ch = s.toCharArray();
        int len = ch.length;
        for(int i = len-1;i>=0;i--)
        {
            rev = rev + ch[i];
        }
        
        return rev;
        */
        
