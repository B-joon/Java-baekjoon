package com.test;

/*
 * ���ĺ� �ҹ���, �빮��, ���� 0-9�� �ϳ��� �־����� ��, 
 * �־��� ������ �ƽ�Ű �ڵ尪�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
 * 
 * �Է�
 * ���ĺ� �ҹ���, �빮��, ���� 0-9�� �ϳ��� ù° �ٿ� �־�����.
 * 
 * ���
 * �Է����� �־��� ������ �ƽ�Ű �ڵ� ���� ����Ѵ�.
 * 
 */

import java.util.Scanner;

public class StringTest01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		char c = s.charAt(0);
		
		System.out.println((int)c);
		sc.close();
	}
}
