package com.jake.kotlinjava.gettersetter;

import java.time.LocalDate;

/**
 * Java 에서 코틀린 클래스의 getter / setter 접근
 */
public class JavaGetterSetterExample {

	public static void main(String[] args) {
		Student student = new Student();

//		student.setName("스티브");
		student.name = "스티브";
		student.setBirthDate(LocalDate.of(1918, 7, 4));

		System.out.println(student.name);
		System.out.println(student.getBirthDate());
		System.out.println(student.getAge());

		student.changeGrade("A");
		System.out.println(student.getGrade());
	}
}
