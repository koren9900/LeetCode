package org.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> values = new HashMap<>();
        values.put('I',1);
        values.put('V',5);
        values.put('X',10);
        values.put('L',50);
        values.put('C',100);
        values.put('D',500);
        values.put('M',1000);
        int sum = 0;
        int cur = 0;
        char priv = 0;
        for(char c: s.toCharArray()){
            if(priv != 0 && values.get(c) < values.get(priv)){
                sum += cur;
                cur = 0;
            }
            if(values.get(c) > cur){
                cur = values.get(c)-cur;
            }
            else{
                cur += values.get(c);
            }
            priv = c;
        }
        sum += cur;
        return sum;
    }

}
