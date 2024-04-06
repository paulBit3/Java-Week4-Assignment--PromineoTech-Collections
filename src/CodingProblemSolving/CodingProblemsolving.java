package CodingProblemSolving;

import java.util.*;

public class CodingProblemsolving {
	
	/*
	 * 
	 * Given an array and a permutation, apply the permutation to the array. 
	 * For example, given the array ["a", "b", "c"] and
	 * the permutation [2, 1, 0], return ["c", "b", "a"].
	 */
	
	//we will create a array method
	public static String[] arrayPermutation(String[] arr, int[] num) {
		//a new array char
		String[] newArr = new String[3];
		
		//outer looping 
		for(String str : arr) {
			//inner loop
			System.out.println(str);
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < num.length; j++) {
					newArr[j] = str;
				}
				
			}
		}
		
		return newArr;
	}

	public static void main(String[] args) {
		// Testing
		
		String[] arr = {"a", "b", "c"};
		int[] num = {2, 1, 0};
		
		String[] arrPermute = arrayPermutation(arr, num);
		System.out.println(Arrays.toString(arrPermute));

	}

}
