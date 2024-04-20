package org.problems.medium;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        String[] split = s.split(" +");
        for(int i = split.length - 1; i >= 0 ; i--){
            if(!split[i].isEmpty()) {
                res.append(split[i]);
                if (i != 0 && !split[i -1].isEmpty())
                    res.append(" ");
            }
        }
        return res.toString();
    }
}
