package com.test;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		System.out.println("����ã�� �� ũ�⸦ �����Ͻÿ� : ");
		int size = sc.nextInt();
		// ���� ���� �迭
		int[][] map = new int[size][size];
		// map�迭�� join
		int[][] temp = new int[size + 2][size + 2]; 
		// ������ �ε����� ���� ����
		for (int i = 0; i < map.length; i++) { 
			map[ran.nextInt(size)][ran.nextInt(size)] = 7;
		}
		// ���ڸ� ������ �� �迭�� temp�� join
		for (int i = 1; i < temp.length - 1; i++) { 
			for (int k = 1; k < temp.length - 1; k++) {
				temp[i][k] = map[i-1][k-1];
			}
		}
		// ���ڸ� �������� �ָ鿡 1�� ����
		for (int i = 2; i < map.length + 2; i++) { 
			for (int j = 2; j < map.length + 2; j++) {
				if (temp[i][j] == 7) {
					temp[i - 1][j - 1] += 1;
					temp[i - 1][j] += 1;
					temp[i - 1][j + 1] += 1;
					temp[i][j - 1] += 1;
					temp[i][j + 1] += 1;
					temp[i + 1][j - 1] += 1;
					temp[i + 1][j] += 1;
					temp[i + 1][j + 1] += 1;
				}
			}
		}
		// ���ڸ� ���� �迭
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				System.out.printf("%2d", map[i][j]);
			}
			System.out.println();
		}
		System.out.println("\n----------------------\n");
		// �������
		for (int i = 1; i < map.length + 1; i++) {
			for (int j = 1; j < map.length + 1; j++) {
				// ���ڰ� int �����̶� 8�� �߿� ���ڰ� ������� ���ڰ� 8�� �����ϱ� ������ 
				// 7���� Ŀ���� �ٽ� 7�� ����
				if (temp[i][j] > 7) {
					temp[i][j] = 7;
				}
				System.out.printf("%2d", temp[i][j]);
			}
			System.out.println();
		}
	}
}
