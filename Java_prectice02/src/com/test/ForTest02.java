package com.test;

import java.util.Scanner;

/*
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오
 * 
 * 1. 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * 2. 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다.
 *    (0 < A, B < 10)
 * 
 * 출력
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
