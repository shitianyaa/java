package demonjava;

import java.util.Scanner;

public class Week4 {
	public static void main(String[] args) {
		
	
		
	
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入：");
	String name = scan.next();
	String age = scan.next();

	System.out.println("hello  "+name );
	System.out.println("age:"+age);
	float 温度=scan.nextFloat();
	float t=温度*1.8f+32;
	System.out.println("t:"+t);
	}
	}

