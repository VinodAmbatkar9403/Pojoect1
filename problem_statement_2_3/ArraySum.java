package com.problem_statement_2_3;

public class ArraySum {
	 public static void main(String[] args) {  
	        //Initialize array  
	        int [] arr = new int [] {3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};  
	        int sum = 0;  
	        Double average;
	        //Loop through the array to calculate sum of elements  
	        for (int i = 0; i < 14; i++) {  
	           sum = sum + arr[i];  
	        }  
	        arr[15] = sum;
	        System.out.println("Sum of 14 elements of an array: " + sum);
	        int avg =sum/arr.length;
	        arr[16]= avg;
	        System.out.println("averageof all array element stored at16th index = "+arr[16]);
	        int temp=0;
	        for (int s=0;s<arr.length;s++) {
	        	for (int j=0;j<arr.length;j++) {
	        		if(arr[s]>arr[j]) {
	        			temp = arr[s];
	        			arr[s] = arr[j];
	        			arr[j]=temp;
	        		}
	        	}
	        	
	        }
	        System.out.println("smallest element of an array:"+arr[0]);
	        arr[17]=arr[0];
	        System.out.println("smallest array element stored at 17 index:" +arr[17]);
	       
	         
	        
	    }  
}
