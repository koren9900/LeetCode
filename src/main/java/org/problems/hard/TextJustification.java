package org.problems.hard;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> justified = new ArrayList<>();
        int i = 0;

        while(i < words.length){
            int width = 0;
            List<String> line = new ArrayList<>();
            while(i < words.length && width + words[i].length() <= maxWidth){
                width += words[i].length() + 1;
                line.add(words[i]);
                i++;
            }
            if(line.size() == 1 || i == words.length){
                StringBuilder lne = new StringBuilder();
                for(String word : line){
                    lne.append(word);
                    lne.append(" ");
                }
                if(lne.length() > maxWidth)
                    lne.deleteCharAt(lne.length() - 1);
                while(lne.length() < maxWidth)
                    lne.append(" ");
                justified.add(lne.toString());
            }
            else{
                StringBuilder lne = new StringBuilder();
                width = width - line.size();
                int common = (maxWidth - width) / (line.size() - 1);
                int leftCommon = (maxWidth - width) % (line.size() - 1);
                for(String word : line){
                    lne.append(word);
                    if(leftCommon != 0) {
                        lne.append(new String(new char[common + 1]).replace("\0", " "));
                        leftCommon--;
                    }
                    else
                        lne.append(new String(new char[common]).replace("\0", " "));
                }
                while(lne.length() > maxWidth)
                    lne.deleteCharAt(lne.length() - 1);
                justified.add(lne.toString());
            }
        }
        return justified;
    }
}
