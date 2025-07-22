package algorithms.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public int romanToInt(String s) {
        Map<Character, Integer> dict = new HashMap<>();
        dict.put('I', 1);
        dict.put('V', 5);
        dict.put('X', 10);
        dict.put('L', 50);
        dict.put('C', 100);
        dict.put('D', 500);
        dict.put('M', 1000);

        char[] chars = s.toCharArray();
        Integer sum = 0;
        Integer previous = null;
        Integer index = 0;

        while (index < chars.length) {
            Integer current = dict.get(chars[index]);
            if (previous == null) {
                previous = current;
            }
            else if (previous < current) {
                sum += -previous + current;
                previous = null;
            }
            else if (previous > current) {
                sum += previous;
                previous = current;
            }

            index++;
        }


        return sum;

    }

    public static void main(String[] args) {
        RomanToInt romanToInt = new RomanToInt();
        System.out.println(romanToInt.romanToInt("MCMXCIV"));
    }

}
