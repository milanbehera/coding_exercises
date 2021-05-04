package practice.coding.arrays.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LongestBalancedSubstring {

    public static int longestBalancedSubstring(String string) {
        Map<Character, Character> mappings = new HashMap<>();
        mappings.put('(', ')');
        int counter = 0;
        char[] charArr = string.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(Character item: charArr) {
            if(mappings.containsKey(item)) {
                stack.push(item);
                counter ++;
            } else if(mappings.containsValue(item)) {
                if(stack.isEmpty() || stack.pop() == item) {
                    break;
                }
                counter++;
            }
        }
        return counter;
    }

    public static void main(String s []) {
        String str = "())()(()())";
        System.out.println(longestBalancedSubstring(str));
    }
}
