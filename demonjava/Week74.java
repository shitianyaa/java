package demonjava;

public class Week74 {

	public static void main(String[] args) {
		// 数组for
		int a[]=new int[5];
		int b[]= {12,23,25,48,65,35};
		System.out.println(b);
		int t;
		for(int i=0;i<=5;i++) {
			int j=5-i;
			if(i<=j) {
			t=b[i];
			b[i]=b[j];
			b[j]=t;
			}
	
		}
		for(int k:b) {
		System.out.println(k+",");
		}
		
	}

}
