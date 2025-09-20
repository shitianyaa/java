package firstweek9;

public class Swufer extends Student {
	int qq;


	public static void main(String[] args) {
		Swufer sw = new Swufer();
		sw.age=17;
		sw.qq=251970624;
		sw.sleep();
		System.out.println(sw.age);
		System.out.println(sw instanceof Student);
	
}
}