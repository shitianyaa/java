package firstweek9;

import chapter2.step7.string;
import firstweek10.Cat;

public class SwufeCat extends Cat {
	string name;

	void eat(int fd) {
		System.out.println("SwufeCat.zay(food)....");
	}

	public static void main(String[] args) {
		Cat cat = new SwufeCat();
		System.out.println(cat instanceof Cat);

	}
}
