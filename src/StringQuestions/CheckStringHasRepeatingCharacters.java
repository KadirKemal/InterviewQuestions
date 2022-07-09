package StringQuestions;

import java.util.HashSet;
import java.util.Set;

public class CheckStringHasRepeatingCharacters {

    public static boolean checkRepeatingCharactersWithLoops(String s){
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkRepeatingCharactersWithSet(String s){
        Set<String> set = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            String subString = s.substring(i, i+1);
            if(set.contains(subString)){
                return true;
            }
            set.add(subString);
        }
        return false;
    }

    public static void main(String args[]) {
        String s = "abcdefgh";
        System.out.println(s + " check");
        System.out.println("function 1 result : " + checkRepeatingCharactersWithLoops(s));
        System.out.println("function 2 result : " + checkRepeatingCharactersWithSet(s));

        s = "abca";
        System.out.println(s + " check");
        System.out.println("function 1 result : " + checkRepeatingCharactersWithLoops(s));
        System.out.println("function 2 result : " + checkRepeatingCharactersWithSet(s));
    }
}
