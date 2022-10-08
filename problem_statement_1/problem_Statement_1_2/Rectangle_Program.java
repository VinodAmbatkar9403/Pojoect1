package com.problem_statement_1.problem_Statement_1_2;

import java.util.Scanner;

public class Rectangle_Program {
	int length; 
    int breadth; 
    int area; 
   
    public Rectangle_Program()
    {
    	length = 0;
    	breadth= 0;
    }

   public void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        length = in.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        breadth = in.nextInt();
    }

   public void calculate() {
        area = length * breadth;
        
    }

   public void display() {
        System.out.println("Area of Rectangle = " + area);
       
    }


}
