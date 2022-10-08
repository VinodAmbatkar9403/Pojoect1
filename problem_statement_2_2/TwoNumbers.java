package com.problem_statement_2_2;

public class TwoNumbers {
	 public static void main(String[] args) {

		    int i = 1, n = 13, firstTerm = 0, secondTerm = 1;
		    System.out.println("Fibonacci Series till " + n + " terms:");

		    while (i <= n) {
		      System.out.print(firstTerm + ", ");

		      int nextTerm = firstTerm + secondTerm;
		      firstTerm = secondTerm;
		      secondTerm = nextTerm;

		      i++;
		    }
		  }
}
