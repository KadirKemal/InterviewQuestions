package ArrayQuestions;

import java.util.*;

public class RemoveDuplicatesFromStringArray {

    public static List<String> removeDuplicatesWithForLoop(List<String> arr){
        List<String> result = new ArrayList<>();

        for(int i=0; i<arr.size(); i++){
            boolean flag = false;
            for(int j=0; j<result.size(); j++){
                if(result.get(j) == arr.get(i)){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                result.add(arr.get(i));
            }
        }
        return result;
    }

    public static List<String> removeDuplicatesWithSet(List<String> arr){
        List<String> result = new ArrayList<>();
        Set<String> set = new HashSet<>();

        for(int i=0; i<arr.size(); i++){
            if(! set.contains(arr.get(i))){
                set.add(arr.get(i));
                result.add(arr.get(i));
            }
        }
        return result;
    }

    public static void main(String args[])
    {
        List<String> input = Arrays.asList("Kadir", "Kemal", "Kemal", "Dursun", "Kadir", "Kemal");

        List<String> output1 = removeDuplicatesWithForLoop(input);
        System.out.println(output1);

        List<String> output2 = removeDuplicatesWithSet(input);
        System.out.println(output2);

    }

}
