package demonjava;

import java.util.Iterator;

public class Week81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]={6,3,19,27,9,15,21};
	
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k]+",");
		}
		
		
		
		
		int i,j,t;
	
	i=0;
		 
		for ( i = 0; i < a.length-1; i++) {
			
		
		for( j=1 ;j<a.length;j++) {
			if(a[i]<a[j]) {
				t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
			
		}
		}
		System.out.println("");
		System.out.println(a[i]);
			
		
	
		
	}

}
