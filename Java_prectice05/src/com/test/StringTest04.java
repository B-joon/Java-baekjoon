package com.test;

import java.io.IOException;
import java.util.Scanner;

/*
 * ���ڿ� S�� �Է¹��� �Ŀ�, �� ���ڸ� R�� �ݺ��� �� ���ڿ� P�� ���� ��
 * ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ��, ù��° ���ڸ� R�� �ݺ��ϰ�, �� ��° ���ڸ� R�� �ݺ��ϴ� ������ P��
 * ����� �ȴ�. S���� QR Code "alphanumeric"���ڸ� ����ִ�.
 * 
 * QR Code "alphanumeric" ���ڴ� 
 * 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ|$%*+-.?: �̴�.
 * 
 * �Է�
 * ù° �ٿ� �׽�Ʈ ���̽��� ���� T(1 <= T <= 1000) �� �־�����. �� �׽�Ʈ ���̽���
 * �ݺ�Ƚ�� R(1<= R <= 8), ���ڿ� S�� �������� ���еǾ� �־�����.
 * S�� ���̴� ��� 1�̸�, 20���ڸ� ���� �ʴ´�.
 */

public class StringTest04 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			int R = sc.nextInt();
			
			String S = sc.next();
			
			for (int j = 0; j < S.length(); j++) {
				for (int k = 0; k < R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
