package day3;

import java.util.Scanner;

public class Arrayexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//method -1 in array (static)
		System.out.println("method-1");
		int[] arr = {1,12,33,64,5};
		for(int i = 0; i<arr.length; i++) {
			System.out.println(i);
			System.out.println(arr[i]);
		}

		//method -2 in array (declaring)
		System.out.println("method-2");
		int[] arr1 = new int[5];
		for(int i = 0; i<arr1.length; i++) {
			System.out.println(i);
		}
		
		//method -3 
		System.out.println("method-3");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr2 = new int[size]; 
		for(int i = 1; i<size; i++) {
			System.out.println("enter value");
			sc.nextInt();
		}
		
		for(int i = 1; i<size; i++) {
			System.out.println("i : "+ i +" "+ arr2[i]);
		};
		


	}

}
