package com.java.bean;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task {

	// Java 8 Feature Using Stream API.
	public static void concat() {

		// 1.) Merging Two Arrays
		int[] a = { 1, 3, 4, 5 };
		int[] b = { 9, 8, 7, 6 };

		int res[] = IntStream.concat(Arrays.stream(b), Arrays.stream(a)).toArray();

		System.out.println(Arrays.toString(res));

		// 2.) Merging two String Arrays.
		String n[] = { "v", "i", "n", "a", "y" };
		String m[] = { "s", "a", "i" };

		Object[] k = Stream.concat(Arrays.stream(n), Arrays.stream(m)).toArray();

		System.out.println(Arrays.toString(k));

		Student[] s = new Student[2];
		{
			s[0] = new Student(1, "vinay");
			s[1] = new Student(2, "sai");
		}
		Student[] as = new Student[2];
		{

			as[0] = new Student(3, "ks");
			as[1] = new Student(4, "sai");

		}

		// 3.) Merging a Dynamic Array.
		Object[] stu = Stream.concat(Stream.of(s), Stream.of(as)).toArray(l -> new Student[l]);

		for (Object student : stu) {

			System.out.println(student);
		}
	}

	public static void main(String[] args) {

		Task.concat();

	}
}
