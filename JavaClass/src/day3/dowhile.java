package day3;

import java.util.Scanner;

public class dowhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num 1");
		int a = sc.nextInt();
		System.out.println("Enter num 2");
		int b = sc.nextInt();
		
		int res;
		int total = 0;
	        
	        do {
	            res = a + b;
//	            System.out.println(res);
	            total = total + res; //total += res;
	            System.out.println(total);
	        } while (total < 25);
	        
	        System.out.println("Total sum: " + total);
	}

}
