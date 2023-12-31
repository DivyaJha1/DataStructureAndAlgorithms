package HashMaps;

import java.util.Arrays;
import java.util.HashMap;

public class printIntersection {
    public static void intersection(int[] arr1, int[] arr2) {
        //Your code goes here
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            if(hm.containsKey(arr1[i])){
                int k=hm.get(arr1[i]);
                hm.replace(arr1[i], k+1);
            }
            else{
                hm.put(arr1[i], 1);
            }
        }
        Arrays.sort(arr2);
        for(int i=0;i<arr2.length;i++){
            if(hm.containsKey(arr2[i]) && hm.get(arr2[i])>=1){
                System.out.print(arr2[i]+" ");
                hm.replace(arr2[i], hm.get(arr2[i])-1);

            }
        }


    }
}
