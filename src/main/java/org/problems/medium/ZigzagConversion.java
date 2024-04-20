package org.problems.medium;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if(numRows == 1)
            return s;
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < numRows; i++){
            boolean flag = false;
            for(int j = i; j < s.length(); j += (flag && i != numRows -1) || i == 0 ?  2*(numRows - i - 1) : 2*i){
                res.append(s.charAt(j));
                flag = ! flag;
            }
        }
        return res.toString();
    }
}
