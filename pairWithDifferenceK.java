package HashMaps;

import java.util.Arrays;

public class pairWithDifferenceK {
    public static int getPairsWithDifferenceK(int arr[], int k) {
        //Write your code here
        int count = 0;
        int N=arr.length;
        Arrays.sort(arr);
        for(int i = 0 ; i < N ; ++i) {
            int X = BS(arr, arr[i] + k, i + 1);
            if(X != N) {
                int Y = BS(arr, arr[i] + k + 1, i + 1);
                count += Y - X;
            }
        }

        return count;
    }

    static int BS(int[] arr, int X, int low)  {
        int high = arr.length - 1;
        int ans = arr.length;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] >= X) {
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return ans;
    }

}
