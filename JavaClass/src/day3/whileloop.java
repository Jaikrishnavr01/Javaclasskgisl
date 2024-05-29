package day3;

import java.util.Scanner;

public class whileloop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num 1");
		int a = sc.nextInt();
		System.out.println("Enter num 2");
		int b = sc.nextInt();
		
		int res; 
		
		res = a+b;
//System.out.println(res);
		
		while(res<25) {
			res++;
			System.out.println(res);
		}
		System.out.println(res);
		}

}
