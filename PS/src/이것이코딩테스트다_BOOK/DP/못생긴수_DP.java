package 이것이코딩테스트다_BOOK.DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 3개의 idx를 이용해서 가장 최소값을 찾아서 배열에 삽입한 후에 삽입한 idx를 +1한다.
 */
public class 못생긴수_DP {

    public static void main(String[] args) throws Exception{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(input.readLine());
        int dp[]=new int[n+1];
        dp[1]=1;
        int idx2=1; int idx3=1; int idx5=1;
        for(int i=2;i<=n;i++){
           int idx2_value=dp[idx2]*2;
           int idx3_value=dp[idx3]*3;
           int idx5_value=dp[idx5]*5;
           dp[i]=Math.min(idx5_value,Math.min(idx2_value,idx3_value));
           if(dp[i]==idx2_value){
               idx2++;
           }
            if(dp[i]==idx3_value){
                idx3++;
            }
            if(dp[i]==idx5_value){
                idx5++;
            }
        }
        System.out.println(dp[n]);
    }
}
