package demonjava;

public class Week72 {
	public static void main(String[] args) {
		/*int i;
		for(i=10;i>=1;i--) {
			if(i==4) {
				System.out.println("准备");
			
			}
			else {
				System.out.println(i);
				
			}
			
				
		}
		
		System.out.println("原神启动");
		*/
		int a,b=5,c=7;
		for(a=50;a>=1;a--) {
			if (a%b==0  && a%c==0) {
				System.out.println(a+"可以被5和7整除");
			}
				 if (a%b==0) {
					System.out.println(a+"可以被5整除");
			}
				
				 if(a%c==0) {
					 System.out.println(a+"可以被7整除");
					 continue;
				 }
				 if(a%c!=0 && a%b!=0) {
					 System.out.println(a);
				 }
 
		}
		
	}

}
