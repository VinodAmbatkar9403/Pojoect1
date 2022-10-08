package com.problem_statement_6_2;

import java.util.Hashtable;
import java.util.Scanner;

public class Product {

	
		public static void main(String[] args) {
			
			Scanner in=new Scanner(System.in);
			Hashtable<String, String> list=new Hashtable<String, String>();
			System.out.println("Enter number of products you want to add");
			int n = in.nextInt();
			System.out.println("Enter the product id and name :");
			
			for (int i = 0; i <n; i++) {
				
				list.put(in.next(), in.next());
			}
			System.out.println("the product list is :"+list);
			System.out.println("Enter the removable product id :");
			String id=in.next();
			list.remove(id);
			System.out.println("item removed :");
			System.out.println("the product list is :");
			System.out.println(list.toString());
			System.out.println("Enter the product id to be serched :");
			
			String sid=in.next();
			
			if (list.containsKey(sid)) {
				
				System.out.println(list.get(sid));
				
			}
			else {
				System.out.println("do not exist");
			}
		}
	}