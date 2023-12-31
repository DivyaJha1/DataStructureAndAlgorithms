package HashMaps;

import java.util.HashMap;

public class pairSum0 {
    public static int PairSum(int[] input, int size) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        return getPairsCount(input,0);



    }


    static int getPairsCount(int arr[], int sum){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!hm.containsKey(arr[i])){
                hm.put(arr[i], 0);
            }
            hm.put(arr[i], hm.get(arr[i]) + 1);
        }
        int twice_count = 0;


        for (int i = 0; i < arr.length; i++) {
            if (hm.get(sum - arr[i]) != null){
                twice_count += hm.get(sum - arr[i]);
            }
            if (sum - arr[i] == arr[i]){
                twice_count--;
            }
        }

        return twice_count / 2;
    }
}
