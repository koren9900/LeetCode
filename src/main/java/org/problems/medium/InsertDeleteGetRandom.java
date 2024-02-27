package org.problems.medium;

import java.util.HashMap;
import java.util.Random;

public class InsertDeleteGetRandom {
    class RandomizedSet {
        HashMap<Integer, Integer> map;
        HashMap<Integer, Integer> reverse;
        int size;
        Random random = new Random();
        public RandomizedSet() {
            map = new HashMap<>();
            reverse = new HashMap<>();
            size = 0;
        }

        public boolean insert(int val) {
            if(reverse.containsKey(val)) return false;
            map.put(size, val);
            reverse.put(val, size);
            size++;
            return true;
        }

        public boolean remove(int val) {
            if(!reverse.containsKey(val)) return false;
            int i = reverse.get(val);
            map.remove(i);
            if(i != size - 1){
                int max = map.get(size -1);
                map.remove(size - 1);
                map.put(i, max);
                reverse.put(max, i);
            }
            reverse.remove(val);
            size--;
            return true;
        }

        public int getRandom() {
            int i = random.nextInt(0,size);
            return map.get(i);
        }
    }
}
