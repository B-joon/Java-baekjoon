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
		if (size >= 10 && size < 25) {
			for (int i = 0; i < 5; i++) {
				map[ran.nextInt(size)][ran.nextInt(size)] = 7;
			}
		} else if (size >= 25) {
			for (int i = 0; i < 15; i++) {
				map[ran.nextInt(size)][ran.nextInt(size)] = 7;
			}	
		}
		// ���ڸ� ������ �� �迭�� temp�� join
		for (int i = 1; i < temp.length - 1; i++) { 
			for (int k = 1; k < temp.length - 1; k++) {
				temp[i][k] = map[i-1][k-1];
			}
		}
		// ��ĭ�� �������� 8���� Ȯ���ؼ� ���ڰ� ����� ī��Ʈ ���ش�.
		for (int i = 1; i < map.length + 1; i++) { 
			for (int j = 1; j < map.length + 1; j++) {
				int count = 0;
				if (temp[i][j] == 7) {
					continue;
				} 
				if (temp[i - 1][j - 1] == 7) {
					count++;
				} 
				if (temp[i - 1][j] == 7) {
					count++;
				} 
				if (temp[i - 1][j + 1] == 7) {
					count++;
				} 
				if (temp[i][j - 1] == 7) {
					count++;
				} 
				if (temp[i][j + 1] == 7) {
					count++;
				} 
				if (temp[i + 1][j - 1] == 7) {
					count++;
				} 
				if (temp[i + 1][j] == 7) {
					count++;
				} 
				if (temp[i + 1][j + 1] == 7) {
					count++;
				}
				temp[i][j] = count;
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
		// ���ڿ� ��ȯ
		String[][] change = new String[size + 2][size + 2];
		
		for (int i = 0; i < change.length; i++) {
			for (int j = 0; j < change.length; j++) {
				if (temp[i][j] == 7) {
					change[i][j] = "*";
				} else {
					change[i][j] = Integer.toString(temp[i][j]);
				}
			}
		}
		for (int i = 1; i < change.length - 1; i++) {
			for (int j = 1; j < change.length - 1; j++) {
				System.out.printf("%2s",change[i][j]);
			}
			System.out.println();
		}
	}
}
