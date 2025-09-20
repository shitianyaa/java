package demonjava;

import java.util.Random;
import java.util.Scanner;

public class Week82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入:");
		int inp = sc.nextInt();
		Random r = new Random();
		int num = r.nextInt(100);
//		System.out.println(num);

		while (true) {

			if (inp > num) {
				System.out.println("big");
			} else if (inp < num) {
				System.out.println("small");
			} else {
				System.out.println("right");
				break;
			}

		}
		System.out.println("over");
		sc.close();
	}

}
