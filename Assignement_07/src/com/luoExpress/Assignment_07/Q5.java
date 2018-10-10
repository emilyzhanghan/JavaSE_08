package com.luoExpress.Assignment_07;

import java.util.ArrayList;

public class Q5 {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(s1);
		arrayList.add(s2);
		arrayList.add(s3);
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).name+" "+arrayList.get(i).age+""+arrayList.get(i).sex);
			
		}
		int max = maxAge(s1.age, s2.age, s3.age);
		find(max, s1, s2, s3);

	}

	public static int maxAge(int num1, int num2, int num3) {
		int max = 0;
		int temp1 = num1 > num2 ? num1 : num2;

		max = temp1 > num3 ? temp1 : num3;
		return max;
	}

	public static void find(int max, Student s1, Student s2, Student s3) {
		if (max == s1.age) {
			System.out.println("年龄最大的学生:" + s1.name);
			s1.name = "king";
		} else if (max == s2.age) {
			System.out.println("年龄最大的学生:" + s2.name);
			s2.name = "king";

		} else if (max == s3.age) {
			System.out.println("年龄最大的学生:" + s3.name);
			s3.name = "king";

		}
	}
}

	




