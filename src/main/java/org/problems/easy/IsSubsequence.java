package org.problems.easy;

public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        int j = 0;
        for (int i = 0; i < s.length() && j < s.length(); i++)
            if (s.charAt(j) == t.charAt(i))
                j++;
        return j == s.length();
    }
}
