package com.bridgelabz.datastructure;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSortImplementation {
	
	static ArrayList<Integer> bubble_sort(ArrayList<Integer> array){
		// contains a single element
		if (array.size() <= 1)
		return array;

		// If array contains two elements
		if (array.size() == 2) {
		if (array.get(0) < array.get(1))
			return array;
		else
			return new ArrayList<Integer>(
			Arrays.asList(array.get(1), array.get(0)));
		}

		// Store the first two elements
		// of the list in variables a and b
		int firstElement = array.get(0);
		int secondElement = array.get(1);

		// Store remaining elements
		// in the list bs
		ArrayList<Integer> secondArray = new ArrayList<>();
		for (int i = 2; i < array.size(); i++)
			secondArray.add(array.get(i));

		// Store the list after
		// each recursive call
		ArrayList<Integer> res = new ArrayList<>();

		// If a < b
		if (firstElement < secondElement) {
		ArrayList<Integer> temp1 = new ArrayList<>();
		temp1.add(secondElement);
		for (int i = 0; i < secondArray .size(); i++)
			temp1.add(secondArray.get(i));

		ArrayList<Integer> vir = bubble_sort(temp1);
		vir.add(0, firstElement);
		res = vir;
		}

		// Otherwise, if b >= a
		else {
		ArrayList<Integer> temp1 = new ArrayList<>();
		temp1.add(firstElement);
		for (int i = 0; i < secondArray.size(); i++)
			temp1.add(secondArray.get(i));

		ArrayList<Integer> vir = bubble_sort(temp1);
		vir.add(0, secondElement);
		res = vir;
		}

		// Recursively call for the list
		// less than the last element and
		// and return the newly formed list
		ArrayList<Integer> pass = new ArrayList<>();
		for (int i = 0; i < res.size() - 1; i++)
		pass.add(res.get(i));

		ArrayList<Integer> sort = bubble_sort(pass);
		sort.add(res.get(res.size() - 1));
		return sort;
	}

	public static void main(String[] args)
	{

		ArrayList<Integer> arr = new ArrayList<Integer>(
		Arrays.asList(1, 3, 4, 5, 6, 2));
		System.out.println("Before Sorting array is "+ arr);
		ArrayList<Integer> res = bubble_sort(arr);
		System.out.print("After Sorting array is ");
		// Print the array
		for (int i = 0; i < res.size(); i++)
		System.out.print(res.get(i) + " ");
	}
}


