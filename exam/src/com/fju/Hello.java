package com.fju;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello");
		int age = 19;
		float height =1.78f;
		int weight = 54;
		System.out.println(age);
		System.out.println(height);
		System.out.println(weight);
		float bmi = weight/(height*height);
		System.out.println(bmi);
		age = age + 1;
		System.out.println(age);

	}

}
