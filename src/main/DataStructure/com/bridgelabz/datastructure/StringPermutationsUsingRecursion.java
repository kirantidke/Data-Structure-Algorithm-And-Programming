package com.bridgelabz.datastructure;

//Java program to print all permutations of a given string.

import java.util.*;

public class StringPermutationsUsingRecursion {

	// function to swap two characters in a character array
   
	
	private static void swap(char[] ch, int i, int j)
    {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }
 
    // Recursive function to generate all permutations of a string
    private static void permutations(char[] ch, int currentIndex)
    {
        if (currentIndex == ch.length - 1) {
            System.out.println(String.valueOf(ch));
        }
 
        for (int i = currentIndex; i < ch.length; i++)
        {
            swap(ch, currentIndex, i);
            permutations(ch, currentIndex + 1);//calling the function recurcively
            swap(ch, currentIndex, i);
        }
    }
 
    // generate all permutations of a string in Java
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the string = ");
    	String s = sc.next();
    	System.out.println("All permutations of given String are ");
        permutations(s.toCharArray(), 0);
    }
}
