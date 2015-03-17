package net.biz.algorithm.hanoi;

import java.util.Scanner;

public class HanoiTowers {
	public static void main(String[] args) {
		System.out.println("请输入盘数:");

		Scanner scanner = new Scanner(System.in);
		HanoiTowers ht = new HanoiTowers();
		int num = scanner.nextInt();
		ht.move(num, 'A', 'B', 'C');

	}

	private void move(int plateNum, char a, char b, char c) {

		if (plateNum == 1) {
			System.out.println("盘子由  " + a + " 移到 " + c);
		} else {
			move(plateNum - 1, a, c, b);
			move(1, a, b, c);
			move(plateNum - 1, b, a, c);
		}

	}
}
