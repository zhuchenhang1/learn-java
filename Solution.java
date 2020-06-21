package practice;
//数组中值出现了一次的数字
import java.util.*;
public class Solution {
    public void FindNums(int[] array, int num1[], int num2[]) {
        if (array == null || array.length == 0) {
            return;
        }
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            int len = array.length;
            for (int i = 0; i < len; i++) {
                if (map.containsKey(array[i])) {
                    map.remove(array[i]);
                } else {
                    map.put(array[i], 1);
                }
            }
            Set<Integer> keys = map.keySet();
            int index=0;
            for (Integer key : keys) {
                if (index == 0) {
                    num1[0] = key;
                    index++;
                } else {
                    num2[0] = key;
                }
            }
        }
    }
