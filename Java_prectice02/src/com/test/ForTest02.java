package com.test;

import java.util.Scanner;

/*
 * �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
 * 
 * 1. ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
 * 2. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����.
 *    (0 < A, B < 10)
 * 
 * ���
 * 2
 * 5
 * 7
 * 17
 * 7
 * 
 */
public class ForTest02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = a + b;
			System.out.println(sum);
		}
		sc.close();
		
	}
	
}
