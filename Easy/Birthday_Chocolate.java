Lily has a chocolate bar that she wants to share it with Ron for his birthday. 
Each of the squares has an integer on it. 
She decides to share a contiguous segment of the bar selected such that the length of the segment mathches Ron's birth month 
and the sum of the integers on the squares is equal to his birth day. 
You must determine how many ways she can divide the chocolate.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int[] s, int d, int m){
        // Complete this function
        int result = 0, chocolateCount = 0;
        
        //Conform to constraints
        if(d < 1 || d > 31)
            return result;
        
        if(m < 1 || m > 12)
            return result;
        
        
        if(n >= 1 && n <= 100)
        {
            for(int i = 0; i < s.length; i++)
            {
                
                chocolateCount = s[i];
            
                
                if((i + m) <= s.length)
                {
                    for(int j = 1; j < m; j++)
                    {
                        chocolateCount += s[i + j];
                    }
                }
                
                if(chocolateCount == d)
                    result++;
            }
        }
        
        
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}
