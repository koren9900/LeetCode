package org.problems.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Map<Character, Character> closer = new HashMap<>();
        closer.put('(',')');
        closer.put('[',']');
        closer.put('{','}');
        Stack<Character> nextClose = new Stack<>();

        for(char c : s.toCharArray())
            if(closer.containsKey(c))
                nextClose.push(closer.get(c));
            else
                if(nextClose.empty() || nextClose.pop() != c)
                    return false;


        return nextClose.empty();
    }
}
