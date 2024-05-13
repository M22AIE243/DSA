package com.dsa.datastruc;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array A[] of n numbers and another number x, the task is to check whether or
 * not there exist two elements in A[] whose sum is exactly x.
 *
 * Examples:
 *
 * Input: arr[] = {0, -1, 2, -3, 1}, x= -2
 * Output: Yes
 * Explanation: If we calculate the sum of the output,1 + (-3) = -2
 *
 * Input: arr[] = {1, -2, 1, 0, 5}, x = 0
 * Output: No
 */
public class ArraySolution {

    public static void main(String[] args) {
        bruteForceSoltuion();
        optimisedSoltuion();
    }


    public  static void  optimisedSoltuion()
    {
        int arr[]={0,-1,2,-3,1};
        int sum=5;

        Map<Integer,Integer>  mymap= new HashMap<>();
        String result="No";
        //n
        for(int i=0; i<arr.length; i++)
        {
           mymap.put(arr[i],i);
        }
        //n
        for(int i=0; i<mymap.size(); i++)
        {
            if(mymap.containsKey(sum-arr[i]))
            {
                result="Yes";
                break;
            }
        }
        System.out.println(result);

    }

     public static void  bruteForceSoltuion()
     {
         //int arr[]={0,-1,2,-3,1};
         //int sum=-2;
         int arr[]={1, -2, 1, 0, 5};
         int sum=0;
         // Step 1 Brute force method , means just solve the problem
         String result="No";
         for(int i=0; i<arr.length; i++)
         {
             for(int j=0; j<arr.length; j++)
             {
                 if(i!=j && arr[i]+arr[j]==sum)
                 {
                     result="Yes";
                     break;
                 }
             }
         }
         System.out.println(result);

     }

}
