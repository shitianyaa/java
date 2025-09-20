package firstweek9;

public class Week91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student tom = new Student("出厂tom");
		//tom.name ="周杭同学";
		tom.age =17;
		tom.age++;
		Student.school="MIT";
		//tom.weight=60.1f;
		System.out.println(tom.age);
		System.out.println(tom.name);
		System.out.println(tom.weight);
		
		
		
		Student zhang = new Student("小蝌蚪");
		zhang.name="周杭同学";
		zhang.gender = '男';
		zhang.weight=52.2f;
		zhang.age=18;
		//System.out.printf("%s,%d,%s,%f\n",zhang.gender,zhang.age,zhang.name,zhang.weight);
		tom.eatMore(6);
		System.out.println(tom.weight);
		tom.sleep();
		System.out.println(tom.weight);
		System.out.println("----------------");
		System.out.println(tom.school);
		System.out.println(zhang.school);

		
		
	}

}
