package com.kd;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner var= new Scanner(System.in);
		int num = var.nextInt();
		
		if(num%2==0)
			System.out.println("It is an even number");
		else
			System.out.println("It is an odd number");

	}

}
