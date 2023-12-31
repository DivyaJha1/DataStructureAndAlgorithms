package HashMaps;

import java.util.HashMap;

public class extractUniqueChar {
    public static String uniqueChar(String str){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(h.containsKey(str.charAt(i))){
                h.put(str.charAt(i), h.get(str.charAt(i))+1);
            }
            else{
                h.put(str.charAt(i), 1);
            }
        }
        String s="";
        for(int i=0;i<str.length();i++){
            if(h.get(str.charAt(i))>0){
                s+=str.charAt(i);
                h.put(str.charAt(i), 0);
            }

        }
        return s;

    }

}
