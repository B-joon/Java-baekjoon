package com.test;

/*
 * ���ĺ� �ҹ��ڷθ� �̷���� �ܾ�S�� �־�����. ������ ���ĺ��� ���ؼ�,
 * �ܾ ���ԵǾ� �ִ°�쿡�� ó�� �����ϴ� ��ġ��, ȣ�ԵǾ� ���� ���� ��쿡��
 * -1 �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
 * 
 * �Է�
 * ù° �ٿ� �ܾ�S�� �־�����. �ܾ��� ���̴� 100�� ���� ������ ���ĺ� �ҹ��ڷθ� �̷���� �ִ�.
 * 
 * ���
 * ������ ���ĺ��� ���ؼ�, a�� ó�� �����ϴ� ��ġ, b�� ó�� �����ϴ� ��ġ, ...z�� ó�� �����ϴ� ��ġ��
 * �������� �����ؼ� ����Ѵ�. ����, � ���ĺ��� �ܾ ���ԵǾ� ���� �ʴٸ� -1�� ����Ѵ�.
 * �ܾ��� ù ��° ���ڴ� 0��° ��ġ�̰�, �ι�° ���ڴ� 1��° ��ġ�̴�.
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringTest03 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		
		for (char i = 'a'; i <= 'z'; i++) {
			if (i < 'z') {
				System.out.print(S.indexOf(i) + " ");
			} else {
				System.out.print(S.indexOf(i));
			}
		}
		
	}
}
