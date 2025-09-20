package demonjava;

import java.util.Scanner;

public class Week83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入身高和体重");
		double inp1 = sc.nextDouble();
		int inp2 = sc.nextInt();
		double a=inp2/(inp1*inp1);
		if(a<=18.5) {
			System.out.println("瘦了");
		}else if(a>=24) {
			System.out.println("胖了");
		}else {
			System.out.println("正常");
		}

	}

}
