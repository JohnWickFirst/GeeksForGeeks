import java.util.*;

public class potdMain {

    public static void main(String[] args){

    }

    //Problem: Modify and element of the array to get the maximum bitwise And for all the element of the Array
    public static int getMaxAnd(int[] A, int N){
        int[] p= new int[N];
        int[] s= new int[N];
        p[0]=s[N-1]=Integer.MAX_VALUE;
        int ans=0;
        for(int i=1;i<N;i++){
            p[i]=p[i-1]&A[i];
        }
        for(int i=N-1;i>=0;i--){
            s[i]=s[i+1]&A[i];
        }
        for(int i=0;i<N;i++){
            ans=Math.max(ans, p[i]&s[i]);
        }
        return ans;

    }
    
}
