//https://leetcode.com/problems/longest-substring-without-repeating-characters/

package StringQuestions;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutDuplicates {

    public static String longestSubstring(String s){
        String result = "";

        int head = 0;
        int tail = 0;
        Set<String> set = new HashSet<>();

        for(; tail<s.length(); tail++){
            String tailChar = s.substring(tail, tail+1);
            if(set.contains(tailChar)){
                if(tail-head > result.length()){
                    result = s.substring(head, tail);
                }
                while(set.contains(tailChar)){
                    String headChar = s.substring(head, head+1);
                    set.remove(headChar);
                    head ++;
                }
            }
            set.add(tailChar);
        }

        if(tail-head > result.length()){
            result = s.substring(head, tail);
        }

        return result;
    }

    public static void main(String args[]) {
        System.out.println(longestSubstring("abacdcbabc"));
        System.out.println(longestSubstring("aaa"));
        System.out.println(longestSubstring("ababcb"));
    }
}
