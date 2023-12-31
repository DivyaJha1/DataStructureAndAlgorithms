package HashMaps;

public class longestSubArrSum0 {
    public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
        // Write your code here
        int max_len = 0;
        int N=arr.length;
        for (int i = 0; i < N; i++) {
            int curr_sum = 0;
            for (int j = i; j < N; j++) {
                curr_sum += arr[j];
                if (curr_sum == 0)
                    max_len = Math.max(max_len, j - i + 1);
            }
        }
        return max_len;
    }
}
