package firstweek9;

import chapter2.step7.string;

public class Student {
	
	
	//属性
	String stuid;
	String name;
	short height;
	float weight;
	 short age;
	char gender;
	static String school;
	
	
	Student(String name){
		this.name="Noname";
		this.weight=180;
		
	}
	
	public Student() {
		
	}
	
	//方法功能
	void study() {
	System.out.println("好好学习，天天向上");
	}
	void eat() {
		System.out.println("贤者模式");
		weight +=2;
	}
	void eatMore(int t) {
		System.out.println("多吃");
		weight +=t;
	}
	void sleep() {
		System.out.println("睡吧睡吧");
		weight-=0.5f;
	}
	
	
	
}
