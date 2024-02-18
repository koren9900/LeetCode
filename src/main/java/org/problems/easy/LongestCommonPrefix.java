package org.problems.easy;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs[0].length()==0)
            return "";
        String prefix = "";
        int i = 0;
        boolean con = true;
        while (true){
            if(strs[0].length() <= i)
                break;
            char cur = strs[0].charAt(i);
            for(String str: strs){
                if(str.length() <= i || cur != str.charAt(i)){
                    con = false;
                    break;
                }
            }
            if(con){
                prefix += cur;
                i++;
            }else{
                break;
            }
        }
        return prefix;
    }
}
