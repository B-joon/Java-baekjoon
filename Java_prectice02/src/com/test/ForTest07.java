package com.test;

import java.util.Scanner;

public class ForTest07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int i = 1; i <= T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = a + b;
			if ((a > 0 && a < 10) && (b > 0 && b < 10)) {
				System.out.println("Case #" + i + ": " + sum);
			}
		}
		sc.close();
	}
}
