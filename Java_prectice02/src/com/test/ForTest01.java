package com.test;

import java.util.Scanner;

/*
 *  n�� �Է¹��� ��, ������ n���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *  
 *  1. ù° �ٿ� n�� �־�����.
 *  2. n�� 1���� ũ�ų� ����, 9���� �۰ų� ����.
 *  
 *  ���
 *  2 * 1 = 2
 *  2 * 2 = 4
 *  2 * 3 = 6
 *  2 * 4 = 8
 *  2 * 5 = 10
 *  2 * 6 = 12
 *  2 * 7 = 14
 *  2 * 8 = 16
 *  2 * 9 = 18
 *  
 */


public class ForTest01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int mul = 0;
		
		// ���ϴ� ���� ��� �ϱ� ������ ���������ڴ� �ʿ� ����.
		for (int i = n; i <= 9 && i >= 1;) {
			for (int j = 1; j < 10; j++) {
				mul = n * j;
				System.out.println(n + " * " + j + " = " + mul);
			}
			break;
		}
		sc.close();
	}

}
