package com.bridgelabz.datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringPermutationIterativ {
	public static void permutations(String s) {
		// create an empty ArrayList to store (partial) permutations
		List<String> partial = new ArrayList<>();

		// initialize the list with the first character of the string
		partial.add(String.valueOf(s.charAt(0)));

		// do for every character of the specified string
		for (int i = 1; i < s.length(); i++) {
			// consider previously constructed partial permutation one by one

			// (iterate backward to avoid ConcurrentModificationException)
			for (int j = partial.size() - 1; j >= 0; j--) {
				// remove current partial permutation from the ArrayList
				String str = partial.remove(j);

				// Insert the next character of the specified string at all
				// possible positions of current partial permutation. Then
				// insert each of these newly constructed strings in the list

				for (int k = 0; k <= str.length(); k++) {
					// Advice: use StringBuilder for concatenation
					partial.add(str.substring(0, k) + s.charAt(i) + str.substring(k));
				}
			}
		}
		System.out.println(partial);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string = ");
		String s = sc.next();
		System.out.println("All permutations of given String are ");
		
	}
}
