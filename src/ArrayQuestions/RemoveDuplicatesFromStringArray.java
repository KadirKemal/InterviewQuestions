package ArrayQuestions;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromStringArray {

    public static List<String> removeDuplicates(List<String> arr){
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

    public static void main(String args[])
    {

    }

}
