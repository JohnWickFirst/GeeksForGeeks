package ProblemOfTheDay;

import java.util.ArrayList;
import java.util.HashSet;

public class ProblemOfTheDay {

    public static void main(String[] args){
       System.out.println( uniqueChar("aabacbebebe", 3));
    }

    // Method to find the longest substring of k unique characters
    public static  String uniqueChar(String s, int k){
        if(k>s.length()){
            return null;
        }
        HashSet<Character> set= new HashSet<Character>();
        int[] str= new int[26];
        int i=0,j=0;
        int cur=0,max=0;
        boolean found=false;
        while(j<k){
            char c= s.charAt(j);
            str[c-'a']++;
            set.add(c);
            j++;
        }

        while(j<s.length() && i<s.length()-k){
            char c= s.charAt(j);
            if(set.size()==k && !(set.contains(c))){
                cur=(j-i);
                max=Math.max(cur,max);
                while(set.size()==k){
                    char ch=s.charAt(i);
                    int count=str[ch-'a'];
                    if(count==1){
                        set.remove(ch);
                    }
                    str[ch-'a']--;
                    i++;
                }

            }
                set.add(c);
                str[c-'a']++;


            j++;
        }
        if(!found && set.size()!=k){
            return null;
        }
        cur=(j-i);
        System.out.println( cur+" "+max);
        return s.substring(i,j);
    }



}
