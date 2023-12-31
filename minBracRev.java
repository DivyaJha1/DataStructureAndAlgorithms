package Stacks;

public class minBracRev {
    public static int countBracketReversals(String input) {
        //Your code goes here
        int x = 0;
        int y = 0;
        int n = input.length();
        if (n % 2 != 0){
            return -1;
        }
        for (int i = 0; i < n; i++) {
            if (input.charAt(i) == '{')
                x++;
            else {
                if (x == 0) {
                    y++;
                    x++;
                }
                else
                    x--;
            }
        }
        if (x > 0){
            y += x / 2;
        }
        return y;
    }
}
