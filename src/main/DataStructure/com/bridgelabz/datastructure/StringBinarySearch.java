package com.bridgelabz.datastructure;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Class to search element in the file

public class StringBinarySearch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// read data from the file
		ArrayList<String> dataArray = ReadFile.readFile();

		// sort the data in ascending order
		Collections.sort(dataArray);

		// Take input from the user to search for the word
		System.out.print("Enter the word you want to search from the file: ");
		String value = input.next();
		input.close();

		// convert the Arraylist into array to pass it to the generic class
		String[] array = new String[dataArray.size()];
		array = dataArray.toArray(array);

		// Create object for binary search class and check if the user input element is
		// present or not
		BinarySearchImplementation<String> searcher = new BinarySearchImplementation<>(array);
		int result = searcher.search(value);
		if (result >= 0) {
			System.out.println(value + " is at index " + result + " in the array");
		} else {
			System.out.println(value + " is not in the array.");
		}
	}
}
