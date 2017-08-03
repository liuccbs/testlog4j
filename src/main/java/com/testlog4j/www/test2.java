package com.testlog4j.www;

public class test2 {
	
	public static void main(String[] args) {
		
	//syso正是哈哈哈哈
		int[] arr =new int[]{1,2,3,42,7,3,56};
		
		for (int i = 0; i < arr.length-1; i++) {
			
			for (int j = 0; j < arr.length-1-i; j++) {
				
				if (arr[j]>arr[j+1]) {
					int c=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=c;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
			System.out.println("哈哈哈哈");
		}
		
		//fff
	System.out.println("jj");
	}

}
