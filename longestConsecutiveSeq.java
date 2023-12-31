package HashMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class longestConsecutiveSeq {
    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        HashMap<Integer,Boolean> map = new HashMap<>();
        ArrayList<Integer> output = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],true);
        }

        int maxlength = 0;
        int start  = 0;

        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])){
                int length = 0;
                int temp = arr[i];
                while(map.containsKey(temp)){
                    length++;
                    map.put(temp,false);
                    temp = temp+1;
                }
                int starttemp = arr[i];
                temp = arr[i]-1;
                while(map.containsKey(temp)){
                    length++;
                    map.put(temp,false);
                    starttemp = temp;
                    temp = temp-1;
                }

                if(length > maxlength){
                    maxlength = length;
                    start = starttemp;
                }else if(length == maxlength){
                    maxlength = length;
                    for(int j=0;j<arr.length;j++){
                        if(arr[j] == start){
                            start = start;
                            break;
                        }else if(arr[j] == starttemp){
                            start = starttemp;
                            break;
                        }
                    }
                }
            }

        }


        output.add(start);
        output.add(start+maxlength-1);


        return output;

    }
}
