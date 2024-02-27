package org.problems.easy;

import java.util.*;

public class RemoveLetterToEqualizeFrequency {
    public boolean equalFrequency(String word) {
        Map<Character, Integer> count = new HashMap<>();
        for(char c : word.toCharArray()){
            if(count.containsKey(c))
                count.put(c, count.get(c)+1);
            else
                count.put(c, 1);
        }
        if(count.size() == 1)
            return true;
        else{
            Collection<Integer> vals = count.values();
            Map<Integer, Integer> values = new HashMap<>();
            for (Integer val: vals) {
                if(values.containsKey(val))
                    values.put(val, values.get(val)+1);
                else
                    values.put(val, 1);
            }
            if(values.size() > 2)
                return false;
            if(values.size() == 1)
                return values.containsKey(1);
            if(count.containsValue(1) && values.get(1)==1)
                return true;
            Integer[] v = new Integer[0];
            v = values.keySet().toArray(v);
            if(values.get(v[0]) <= 1 || values.get(v[1]) <= 1)
                if(v[0] - v[1] == 1 && values.get(v[0])==1)
                    return true;
                else return v[1] - v[0] == 1 && values.get(v[1]) == 1;
            else return false;
         }

    }
}
