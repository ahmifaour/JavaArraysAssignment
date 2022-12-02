package com.ahmi.javaarray;

import java.util.Arrays;
import java.util.Scanner;

public class JavaArrays {

	public static void main(String[] args) {
		printArray();
		printArrayElement();
		colorArray();
		printTwoElements();
		loopArray();
		timesTwoArray();
		hideMiddleArray();
		swapElement();
		sortArray();
		objectArray();
		favoriteThings();
	}
	
	public static void printArray() {
		int [] a = {1,2,3};
		System.out.println(Arrays.toString(a));
	}
	
	public static void printArrayElement() {
		int [] b = {13,5,7,68,2};
		System.out.println(b[2]);
	}
	
	public static void colorArray() {
		String red = "red";
		String green = "green";
		String blue = "blue";
		String yellow = "yellow";
		String [] c = {red,green,blue,yellow};
		System.out.println(c.length);
		String[] d = c.clone();
		System.out.println(Arrays.toString(d));
	}
	
	public static void printTwoElements() {
		int [] e = {1,2,3,4,5};
		System.out.println(e [0]);
		System.out.println(e[4]);
	}
	
	public static void loopArray() {
		int [] f = new int [5];
		int i;
			for(i = 0; i < 4; i++);
		System.out.println(f[i]);
	}
	
	public static void timesTwoArray() {
		int [] g = {1,2,3,4,5};
			int j = 0;
			int k = j*2;
			for(j=0; j<g.length; j++);
		System.out.println((g[k]));
		/**
		 * Can't figure out why this isn't working.
		 */
	}
	
	public static void hideMiddleArray() {
		int x=0;
		int [] h = new int [5];
			for(x=1; x<h.length; x++);
			h[0] = x;
			h[1] = x;
			h[3] = x;
			h[4] = x;
		System.out.println("Element 0: " + h[0]);
		System.out.println("Element 1: " + h[1]);
		System.out.println("Element 3: " + h[3]);
		System.out.println("Element 4: " + h[4]);
	}
	
	public static void swapElement() {
		int [] swap =  {1, 2, 3, 4, 5};
			swap[0] ^= swap[2];
			swap[2] ^= swap [0];
		System.out.println(Arrays.toString(swap));
	}
	
	public static void sortArray() {
		int [] sort = {4, 2, 9, 13, 1, 0};
		Arrays.sort(sort);
		System.out.println();
		System.out.println("Array in ascending order: " + Arrays.toString(sort));
		System.out.println("Smallest Value: " + sort[0]);
		System.out.println("Largest Value: " +sort[5]);
	}
	
	public static void objectArray() {
		Object [] objects = new Object[5];
			objects[0] = 1;
			objects[1] = "Welcome";
			objects[2] = "to";
			objects[3] = "Java";
			objects[4] = 55.55;
		System.out.println(Arrays.toString(objects));
	}
	
	public static void favoriteThings() {
		Scanner scanner = new Scanner(System.in);
		
		String [] favorite = new String[7];
			System.out.println("Enter seven of your favorite things! (One at a time):");
			favorite[0] = scanner.nextLine();
			favorite[1] = scanner.nextLine();
			favorite[2] = scanner.nextLine();
			favorite[3] = scanner.nextLine();
			favorite[4] = scanner.nextLine();
			favorite[5] = scanner.nextLine();
			favorite[6] = scanner.nextLine();
			
			scanner.close();
			
			System.out.println("How many favorite things you have: " + favorite.length);
			System.out.println("Your favorite things are: " + Arrays.toString(favorite));
	}
}
