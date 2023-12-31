package Stacks;

public class spanStock {
    public static int[] stockSpan(int[] price) {
        //Your code goes here
        int n=price.length;
        int[] arr=new int[price.length];
        arr[0] = 1;


        for (int i = 1; i < n; i++) {
            arr[i] = 1;
            for (int j = i - 1; (j >= 0) && (price[i] > price[j]); j--){
                arr[i]++;
            }
        }
        return arr;
    }
}
