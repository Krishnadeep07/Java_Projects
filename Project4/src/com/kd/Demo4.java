package com.kd;

public class Demo4 {

	public static double getArea(int radius) {
		double area= Math.PI * Math.pow(radius, 2);
		return area;
	}
	public static void main(String[] args) {
		int radius= 2;
		double area= getArea(radius);
		System.out.println("The area of circle is "+ area);
	}

}
