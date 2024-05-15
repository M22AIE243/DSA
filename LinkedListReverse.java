package com.dsa.datastruc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinkedListReverse {

    public static void main(String[] args) {

        reverseListOptimised();
        reverseListBruteForce();
    }

   // two pointer
    public static void reverseListOptimised()
    {
        List<Integer> myList= new ArrayList<>(Arrays.asList(23,34,45,56,50));

        int temp;

        for(int i=(myList.size()-1), j=0; j<i ; j++ ,i--)
        {
            if(i!=j){
                temp= myList.get(i);
                myList.set(i, myList.get(j));//dont use add here
                myList.set(j,temp);
            }else{
                break;
            }
        }
        System.out.println(myList.size()+"Output");
        myList.stream().forEach(System.out::println);
    }


    public static void reverseListBruteForce()
    {
        List<Integer> myList=List.of(12,23,45,65);

        List<Integer> myList2=new ArrayList<>();
        for(int i=myList.size()-1; i>=0; i--)
        {
            myList2.add(myList.get(i));
        }
        myList2.stream().forEach(System.out::println);
    }
}
