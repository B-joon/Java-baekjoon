package com.test;

import java.util.Scanner;

/*
 * n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ� �Ͻÿ�
 * 
 * 1. ù° �ٿ� n(1 <= n <= 10000)�� �־�����.
 */

public class ForTest03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0;
		
		for (int i = n; i >= 1 && i <= 10000;) {
			for (int j = 1; j <= n; j++) {
				sum += j;
			}
			break;
		}
		System.out.println(sum);
		sc.close();
	}
	
}
