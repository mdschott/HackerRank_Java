/*
Print an integer denoting the minimum cost of turning matrix s into a magic square.
Matrix s is always a 3x3 matrix.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int formingMagicSquare(int[][] s) {
        // Complete this function
        
        int result = Integer.MAX_VALUE;
        int count = 0;
        
        //Every 3x3 Magic Square
         int[][][] allMagics = {
             {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
             {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
            {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
            {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}}, 
            {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
            {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}}, 
            {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}}, 
            {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},
        };
         
         for(int i = 0; i < allMagics.length; i++)
         {
             for(int j = 0; j < 3; j++)
             {
                 for(int k = 0; k < 3; k++)
                 {
                     if(allMagics[i][j][k] != s[j][k])
                     {
                         count += Math.abs((allMagics[i][j][k] - s[j][k]));
                     }
                 }
             }
             
             if(count < result)
                 result = count;
             
             count = 0;
         }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] s = new int[3][3];
        for(int s_i = 0; s_i < 3; s_i++){
            for(int s_j = 0; s_j < 3; s_j++){
                s[s_i][s_j] = in.nextInt();
            }
        }
        int result = formingMagicSquare(s);
        System.out.println(result);
        in.close();
    }
}