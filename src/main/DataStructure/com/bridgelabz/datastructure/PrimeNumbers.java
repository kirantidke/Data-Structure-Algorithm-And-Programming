package com.bridgelabz.datastructure;

import java.util.Scanner;
import java.util.*;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Lower limit : ");
		int start = s.nextInt();
		System.out.print("Enter the upper limit : ");
		int end = s.nextInt();
		System.out.println("List of prime numbers between " + start + " and " + end);
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
